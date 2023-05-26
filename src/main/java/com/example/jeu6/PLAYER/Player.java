package com.example.jeu6.PLAYER;


import com.example.jeu6.CARD.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;

    public Player() {
        hand = new ArrayList<>();
        score = 0;
    }

    public void playCard() {
        // Logique de jeu pour déterminer où poser la carte
        // ...
        // Code pour jouer la carte
    }

    public int chooseRow() {
        // Logique de jeu pour choisir une rangée où poser la carte
        // ...
        // Retourner le numéro de la rangée choisie
        return 0;
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }
}

