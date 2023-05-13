package com.example.jeu6;


import java.util.ArrayList;

public class Row {
    private ArrayList<Card> cards;

    public Row() {
        this.cards = new ArrayList<Card>(); // Initialisation de la liste de cartes dans row
    }

    public void addCardToRow(Card card) { // Ajout d'une carte à la liste de cartes dans row
        this.cards.add(card);
    }

}
