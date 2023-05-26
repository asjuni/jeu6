package com.example.jeu6.CARD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        initializeDeck();
    }

    private void initializeDeck() {
        cards = new ArrayList<>();
        for (Card card : Card.values()) {
            cards.add(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (!isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }

    public boolean isDeckEmpty() {
        return cards.isEmpty();
    }

    public int getDeckSize() {
        return cards.size();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

}