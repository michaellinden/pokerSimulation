package com.poker.game;

import com.poker.cards.Card;
import com.poker.cards.CardValue;
import com.poker.cards.Suit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokerHandSorter {
    private final List<Card> hand;
    private final Map<CardValue, Integer> valueCounts = new HashMap<>();
    private final Map<Suit, Integer> suitCounts = new HashMap<>();

    PokerHandSorter(List<Card> hand) {
        this.hand = hand;
        List<CardValue> cardValues = hand.stream().map(s -> s.getCardValue()).collect(Collectors.toList());

        for (CardValue cardValue : cardValues) {
            valueCounts.compute(cardValue, (key, oldValue) -> (oldValue == null ? 1 : oldValue + 1));
        }

        List<Suit> suitValues = hand.stream().map(s -> s.getSuit()).collect(Collectors.toList());
        for (Suit suitValue : suitValues) {
            suitCounts.compute(suitValue, (key, oldValue) -> (oldValue == null ? 1 : oldValue + 1));
        }
    }

    public boolean hasKPair(Integer k) {
        for (Integer value : valueCounts.values()) {
            if (value == k) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFlush() {
        for (Integer value : suitCounts.values()) {
            if (value >= 5) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFullHouse() {
        boolean hasPair = false;
        boolean hasTriple = false;

        for (Integer value : valueCounts.values()) {
            if (value >= 3) {
                hasTriple = true;
            } else if (hasTriple && value >= 3) {
                hasPair = true;
            } else if (value >= 2) {
                hasPair = true;
            }
        }
        return hasPair && hasTriple;
    }


}
