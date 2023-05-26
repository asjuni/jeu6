package com.example.jeu6.PLAYER;


import com.example.jeu6.CARD.Card;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import lombok.*;
public class Row {
    @Getter @Setter private ArrayList<Card> cards;

    public Row() {
        Row row1 = new Row();
        Row row2 = new Row();
        Row row3 = new Row();
        Row row4 = new Row();
    }

    public void addCard(Card card) {
        ArrayList<Card> cards = this.getCards();
        cards.add(card);
        this.setCards(cards);
    }

    public List<Card> getHand() {
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