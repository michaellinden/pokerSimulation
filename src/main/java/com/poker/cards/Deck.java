package com.poker.cards;

import java.util.*;
import java.util.stream.Collectors;

public class Deck {

    Queue<Card> cards;

    public Deck(Queue<Card> cards) {
        this.cards = cards;
    }

    public Card draw() {
        if (cards.size() == 0) {
            throw new RuntimeException("No cards left in deck!");
        }
        return cards.poll();
    }

    public void shuffle() {
        List<Card> arrayCards = cards.stream().collect(Collectors.toList());
        Collections.shuffle(arrayCards);
        cards = new ArrayDeque<Card>(arrayCards);
    }

    public static Deck constructDeck() {
        Queue<Card> cards = new ArrayDeque<>();
        for (Suit suit : Suit.values()) {
            for (CardValue cardValue : CardValue.values()) {
                Card card = new Card(suit, cardValue);
                cards.add(card);
            }
        }
        return new Deck(cards);
    }

    @Override
    public String toString() {
        String s = "";
        for (Card card : cards) {
            s += card.toString() + " ";
        }
        return s;
    }
}
