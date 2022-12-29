package com.poker.cards;

public enum Suit {
     SPADES(0x2660),
    CLUBS(0x2663),
    HEARTS(0x2764),
     DIAMONDS(0x2666);

    private final char[] suitEmoji;
    Suit(int suitEmoji) {
        this.suitEmoji = Character.toChars(suitEmoji);
    }

    @Override
    public String toString() {
       return String.valueOf(suitEmoji);
    }
}
