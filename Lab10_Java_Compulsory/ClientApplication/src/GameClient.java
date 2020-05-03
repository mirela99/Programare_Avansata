import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GameClient {

    public GameClient() throws IOException {
        String serverAddress = "127.0.0.1"; // The server's IP address
        int PORT = 8200; // The server's port
        try {
            Socket socket = new Socket(serverAddress, PORT);
            while (true) {
                Scanner read = new Scanner(System.in);
                System.out.println("Give us a command :");
                String command = read.next();
                PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                out.println(command);
                //stop the client
                if (command.equals("exit")) {
                    System.out.println("Server closed! ");
                    break;
                }

                //send command to the client
                String response = in.readLine();
                System.out.println(response);
                //if we send command stop we are not allowed to enter another command after !!
                if (command.equals("stop")) {
                    break;
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("No server listening... " + e);

        }
    }
}
