package com.example.jeu6.PLAYER;

import com.example.jeu6.CARD.Card;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<Card> cards;

    public Row() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        if (isFull()) {
            throw new IllegalStateException("La rangée est déjà pleine");
        }
        cards.add(card);
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards); // Retourne une copie de la liste des cartes pour éviter les modifications externes
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

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public void removeLastCard() {
        if (!cards.isEmpty()) {
            cards.remove(cards.size() - 1);
        }
    }
}
