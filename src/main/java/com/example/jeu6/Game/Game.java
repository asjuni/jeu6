package com.example.jeu6.Game;

import com.example.jeu6.CARD.Card;
import com.example.jeu6.CARD.Deck;
import com.example.jeu6.PLAYER.Player;
import com.example.jeu6.PLAYER.Row;

import java.util.ArrayList;


public class Game {
    // Créer et initialiser les instances de com.example.jeu6.PLAYER.Row


    private final Player[] players;
    private final Deck deck;
    private final Row[] rows;

    public Game(Player[] players, Deck deck, Row[] rows) {
        this.players = players;
        this.deck = deck;
        this.rows = rows;
    }

    public void startGame() {
        deck.shuffle(); // Mélanger le deck

        for (Player player : players) {
            ArrayList<Card> playerHand = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                Card card = deck.drawCard(); // Piocher une carte depuis le deck
                playerHand.add(card);
            }
            player.setHand(playerHand);
        }
    }

    public void playRound() {
        for (Player player : players) {
            int selectedRow = player.playCard(rows); // Passer les rangées en argument
            Card playedCard = player.getHand().remove(0);
            rows[selectedRow].addCard(playedCard);
        }
    }

    public boolean isGameOver() {
        for (Row row : rows) {
            if (!row.isFull()) {
                return false;
            }
        }
        return true;
    }
}
