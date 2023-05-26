package com.example.jeu6;
import com.example.jeu6.CARD.Deck;
import com.example.jeu6.PLAYER.Player;
import com.example.jeu6.PLAYER.Row;

class Game {
    private Player[] players;
    private Deck deck;
    private Row[] rows;

    public Game(Player[] players, Deck deck, Row[] rows) {
        this.players = players;
        this.deck = deck;
        this.rows = rows;
    }

    public void startGame() {
        // Initialiser le jeu, distribuer les cartes, etc.
    }

    public void playRound() {
        // Jouer un tour de jeu
    }

    public boolean isGameOver() {
        // Vérifier si le jeu est terminé
    }
}
