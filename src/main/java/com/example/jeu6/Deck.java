package com.example.jeu6;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        // Créer le paquet de cartes initial
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        // Ajouter les cartes au paquet (ex: numéros de cartes de 1 à 104)
        for (int i = 1; i <= 104; i++) {
            cards.add(new Card(i));
        }
    }

    public void shuffle() {
        // Mélanger les cartes du paquet de manière aléatoire
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        // Tirer une carte du paquet et la renvoyer
        if (isEmpty()) {
            return null; // Pas de carte disponible, retourne null
        } else {
            Card card = cards.get(0); // Récupérer la première carte
            cards.remove(0); // Retirer la carte du paquet
            return card;
        }
    }

    public boolean isEmpty() {
        // Vérifier si le paquet de cartes est vide
        return cards.isEmpty();
    }
}
