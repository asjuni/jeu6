package com.example.jeu6;

import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;

    public Deck(List<Card> cards) {
        // Initialisation du paquet de cartes
        // ...
        this.cards = cards;
    }

    public void shuffle() {
        int deckSize = cards.size();
        Random random = new Random();

        for (int i = deckSize - 1; i > 0; i--) {
            // Générer un index aléatoire entre 0 et i inclus
            int j = random.nextInt(i + 1);

            // Échanger les cartes à l'index i et j
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }


}
