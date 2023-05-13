package com.example.jeu6;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Deck {
    private final List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = new ArrayList<>(cards); // Crée une copie de la liste de cartes
    }

    public void shuffle() {
        int deckSize = cards.size();
        Random random = new Random();

        for (int i = deckSize - 1; i > 0; i--) {
            // Génère un index aléatoire entre 0 et i inclus
            int j = random.nextInt(i + 1);

            // Échange les cartes à l'index i et j //
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    // Méthode pour tirer une carte du paquet
    public Card drawCard() {
        if (cards.isEmpty()) {
            return null; // Le paquet est vide
        }

        Random random = new Random();
        int index = random.nextInt(cards.size()); // Génère un index aléatoire
        Card card = cards.get(index); // Récupère la carte à l'index aléatoire
        cards.remove(index); // Retire la carte du paquet

        return card;
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
