package com.poker.game;

import com.poker.cards.Card;
import com.poker.cards.CardValue;
import com.poker.cards.Suit;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class PokerHandSorterTest {
    @Test
    void testPairDetector() {
        Card firstCard = new Card(Suit.CLUBS, CardValue.ACE);
        Card secondCard = new Card(Suit.DIAMONDS, CardValue.ACE);
        List<Card> hand = new ArrayList<>(Arrays.asList(firstCard, secondCard));
        PokerHandSorter pokerHandSorter = new PokerHandSorter(hand);
        assert pokerHandSorter.hasKPair(2);
        assert !pokerHandSorter.hasKPair(3);
    }

    @Test
    void testFlushDetector() {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand.add(new Card(Suit.DIAMONDS, CardValue.values()[i]));
        }
        PokerHandSorter pokerHandSorter = new PokerHandSorter(hand);
        assert pokerHandSorter.hasFlush();
    }
}