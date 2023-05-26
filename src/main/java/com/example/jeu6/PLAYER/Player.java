package com.example.jeu6.PLAYER;

import com.example.jeu6.CARD.Card;
import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
@Getter@Setter
public class Player {
    private ArrayList<Card> hand;
    private int score;

    public int playCard(Row row1, Row row2, Row row3, Row row4){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Card> handPlayer = getHand(); //On cherche la main du player
        System.out.println("Veuillez choisir une carte :");
        System.out.println(handPlayer);                 //On montre la main au player
        int card = scanner.nextInt();                   //Player choisit une carte
        return chooseRow(card, row1, row2, row3, row4);
    }

    private int chooseRow(int card, Row row1, Row row2, Row row3, Row row4){
        Card lastCardRowOne = row1.getLastCard();
        Card lastCardRowTwo = row2.getLastCard();
        Card lastCardRowThree = row3.getLastCard();
        Card lastCardRowFour = row4.getLastCard();
        ArrayList<Card> listOfLastCard = new ArrayList<>(Arrays.asList(lastCardRowOne, lastCardRowTwo, lastCardRowThree, lastCardRowFour));
        for (int i = 0; i < listOfLastCard.size(); i++){
            int numberCard = listOfLastCard.get(i).ordinal();
            if (card < numberCard){
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
}
