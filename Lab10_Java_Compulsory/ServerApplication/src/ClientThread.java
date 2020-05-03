import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class ClientThread extends Thread {

    private Socket socket = null ;
    private ServerSocket serverSocket= null;
    // serverSocket from constructor -- closing the whole connection
    public ClientThread (Socket socket, ServerSocket serverSocket) {
        this.socket = socket;
        this.serverSocket=serverSocket;
    }
    public void run () {
        try {
            // sending more commands
            while(true) {
                // taking the command from client
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                String request = in.readLine();
                // Send the response to the oputput stream: server → client
                PrintWriter out = new PrintWriter(socket.getOutputStream());

                if(request.equals("stop")) {
                    String response ="Server stopped";
                    out.println(response);
                    out.flush();

                    serverSocket.close();

                }
                else
                {
                    String response="Server received the request";
                    out.println(response);
                    out.flush();
                }
            }
        } catch (IOException e) {
            System.err.println("Communication error... " + e);
        } finally {
            try {
                socket.close(); // or use try-with-resources
            } catch (IOException e) { System.err.println (e); }
        }
    }
}
