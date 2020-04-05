package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        List<Token> tokens = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            Token token = new Token(i);
            tokens.add(token);
        }
        Board board = new Board(tokens);
        for (int i = 0; i < tokens.size(); i++) {
            System.out.println(tokens.get(i));
        }
        Player player1 = new Player("Mirela");
        Player player2 = new Player("Ionela");
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        Game game = new Game(players, board);
        game.startThreads();
    }
}
