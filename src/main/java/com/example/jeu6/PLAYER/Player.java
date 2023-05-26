package com.example.jeu6.PLAYER;

import com.example.jeu6.CARD.Card;
import lombok.*;

import java.util.ArrayList;

import java.util.Scanner;
@Getter@Setter


public class Player {

    private ArrayList<Card> hand;
    private int score;

    public Player(int i) {
        //Créé le nombre de player
    }

    public int playCard(Row[] rows) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Card> handPlayer = getHand();

        System.out.println("Veuillez choisir une carte :");
        System.out.println(handPlayer);

        int card = scanner.nextInt();
        return chooseRow(card, rows);
    }

    private int chooseRow(int card, Row[] rows) {
        for (int i = 0; i < rows.length; i++) {
            Card lastCard = rows[i].getLastCard();
            int numberCard = lastCard.ordinal();

            if (card < numberCard) {
                return i - 1;
            }
        }

        return 0;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void removeCard(Card card) {
        hand.remove(card);
    }
}
