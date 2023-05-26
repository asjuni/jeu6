package com.example.jeu6.Game;

import com.example.jeu6.PLAYER.Player;

import java.util.LinkedList;
import java.util.List;

public class Game {
    private final Board board;
    private final List<Player> players;
    private int currentPlayer;

    public Game() {
        this.board = new Board();
        this.players = new LinkedList<>();
        this.currentPlayer = 1;
    }
    public Board getBoard() {
        return board;
    }

    public boolean isGameOver(){
        boolean gameFinished = false;
        return gameFinished;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }
}


