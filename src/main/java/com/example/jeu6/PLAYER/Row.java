package com.example.jeu6.PLAYER;


import com.example.jeu6.CARD.Card;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private ArrayList<Card> cards;

    public Row() {
        this.cards = new ArrayList<Card>(); // Initialisation de la liste de cartes dans row
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card getLastCard() {
        if (!cards.isEmpty()) {
            return cards.get(cards.size() - 1);
        }
        return null;
    }

    public boolean isFull() {
        return cards.size() == 5;
    }

    public void clear() {
        cards.clear();
    }
}

