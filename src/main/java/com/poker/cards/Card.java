package com.poker.cards;

public class Card {
    final private Suit suit;
    final private CardValue value;


    public Card(Suit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardValue getCardValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString() + suit.toString();
    }
}
