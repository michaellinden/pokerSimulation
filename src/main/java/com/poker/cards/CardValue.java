package com.poker.cards;

import java.util.Comparator;

public enum CardValue implements Comparator<CardValue> {
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
    KING("K"),
    ACE("A");

    final private String cardString;

    CardValue(String cardString) {
        this.cardString = cardString;
    }

    @Override
    public String toString() {
        return cardString;
    }

    @Override
    public int compare(CardValue o1, CardValue o2) {
        if (o1.ordinal() < o2.ordinal()) {
            return -1;
        } else if (o1.ordinal() == o2.ordinal()) {
            return 0;
        } else {
            return 1;
        }
    }

//    public Integer toInt() {
//        switch (this) {
//            // TODO: Ace can also be low
//            case ACE -> {
//                return 11;
//            }
//            case TWO -> {
//                return 2;
//            }
//            case THREE -> return 3;
//            case FOUR -> return 4;
//            case FIVE -> return 5;
//            case SIX -> return 6;
//            case SEVEN -> return 7;
//            case EIGHT -> return 8;
//            case NINE -> return 9;
//            case TEN -> return 10;
//        }
//    }
}

