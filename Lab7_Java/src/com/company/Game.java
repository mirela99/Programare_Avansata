package com.company;
import java.util.*;
import java.util.ArrayList;
import static java.lang.Thread.sleep;

public class Game {
    List<Player> players;
    Board board;
    boolean available = true;
    int winner;
    boolean gameOver = false;

    public Game(List<Player> players, Board board) {
        this.players = players;
        for (int i = 0; i < players.size(); i++) {
            players.get(i).setGame(this);
        }
        this.board = board;
    }
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    void startThreads() {
        int i;
        for (i = 0; i < players.size(); i++) {
            Runnable runnable = players.get(i);
            new Thread(runnable).start();
        }

        while (true) {
            if (gameOver) {
                break;
            } else {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }




}