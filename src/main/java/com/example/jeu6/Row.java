package com.example.jeu6;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<Card> cards;

    public Row() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        int index = 0;
        for (Card c : cards) {
            if (card.getNumber() < c.getNumber()) {
                break;
            }
            index++;
        }
        cards.add(index, card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card getLastCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.get(cards.size() - 1);
    }

    public boolean isFull() {
        return cards.size() == 5;
    }

    public void clear() {
        cards.clear();
    }
}
