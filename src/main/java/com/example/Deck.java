package com.example;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    static Deck constructDeck() {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (CardValue cardValue: CardValue.values()) {
                Card card = new Card(suit, cardValue);
                cards.add(card);
            }
        }
        return new Deck(cards);
    }
}
