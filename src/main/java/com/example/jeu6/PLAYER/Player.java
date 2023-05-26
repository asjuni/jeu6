package com.example.jeu6.PLAYER;

import com.example.jeu6.CARD.Card;
import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Player {
    @Getter @Setter ArrayList<Card> hand;
    @Getter @Setter int score;

    public int playCard(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Card> handPlayer = this.returnHand(); //On cherche la main du player
        System.out.println("Veuillez choisir une carte :");
        System.out.println(handPlayer);                 //On montre la main au player
        int card = scanner.nextInt();                   //Player choisit une carte
        return (this.chooseRow(card));
    }

    private int chooseRow(int card){
        Card rowOne = row1.getLastCard();
        Card rowTwo = row2.getLastCard();
        Card rowThree = row3.getLastCard();
        Card rowFour = row4.getLastCard();
        ArrayList<Card> listOfLastCard = new ArrayList<>(Arrays.asList(rowOne,rowTwo,rowThree,rowFour));
        for (int i =0; i < listOfLastCard.size(); i++){
            int numberCard = listOfLastCard.get(i).ordinal();
            if (card < numberCard){
                return i - 1;
            }
        }
        return 0;
    }

    private ArrayList<Card> returnHand(){
        return this.getHand();
    }

}