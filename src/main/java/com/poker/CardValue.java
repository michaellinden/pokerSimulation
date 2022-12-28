package com.poker;

public enum CardValue {
    ACE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K");

    final private String cardString;

    CardValue(String cardString) {
        this.cardString = cardString;
    }

    @Override
    public String toString() {
        return cardString;
    }
}
