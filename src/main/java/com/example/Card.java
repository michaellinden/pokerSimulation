package com.example;

public class Card {
    final private Suit suit;
    final private CardValue value;


    Card(Suit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }
}
