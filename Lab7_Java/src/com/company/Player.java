package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Player implements Runnable {
    String name;
    Game game;


    public List<Token> getExtractedTokens() {
        return extractedTokens;
    }

    List<Token> extractedTokens = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }


    public Player(String name, Game game) {
        this.name = name;
        this.game = game;
    }

    public void run() {

        while (!game.board.tokenList.isEmpty()) {
            extractToken();
            try {
                sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public synchronized void extractToken() {
        Random rand = new Random();
        int position = rand.nextInt(game.board.tokenList.size());
        Token token = game.board.tokenList.get(position);
        System.out.println("Playerul " + name + " a luat " + token);
        extractedTokens.add(token);
        game.board.removeToken(token);
    }

    public String getName() {
        return name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}


