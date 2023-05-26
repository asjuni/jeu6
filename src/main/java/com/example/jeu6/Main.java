package com.example.jeu6;

import com.example.jeu6.CARD.Deck;
import com.example.jeu6.Game.Game;
import com.example.jeu6.PLAYER.Player;
import com.example.jeu6.PLAYER.Row;

public class Main {
    public static void main(String[] args) {
        // Création des joueurs
        Player player1 = new Player();
        Player player2 = new Player();

        // Création du deck
        Deck deck = new Deck();

        // Création des rangées
        Row row1 = new Row();
        Row row2 = new Row();
        Row row3 = new Row();
        Row row4 = new Row();
        Row[] rows = {row1, row2, row3, row4};

        // Création du jeu
        Game game = new Game(new Player[]{player1, player2}, deck, rows);

        // Démarrage du jeu
        game.startGame();

        // Boucle de jeu
        while (!game.isGameOver()) {
            // Afficher l'état actuel du jeu
            System.out.println("---- État du jeu ----");
            System.out.println("Joueurs :");
            System.out.println("Joueur 1 : " + player1.getHand());
            System.out.println("Joueur 2 : " + player2.getHand());
            System.out.println("Rangées :");
            for (int i = 0; i < rows.length; i++) {
                System.out.println("Rangée " + (i + 1) + " : " + rows[i].getCards());
            }
            System.out.println("---------------------");

            // Jouer un tour de jeu
            game.playRound();
        }

        // Afficher le résultat final du jeu
        System.out.println("---- Résultat final ----");
        System.out.println("Joueurs :");
        System.out.println("Joueur 1 : " + player1.getScore() + " points");
        System.out.println("Joueur 2 : " + player2.getScore() + " points");
        System.out.println("------------------------");
    }
}

