package com.poker.game;

import com.poker.cards.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Player implements Comparable<Player>{
    private final List<Card> hand;
    private final Integer playerNumber;

    public Player(Integer playerNumber) {
        this.hand = new ArrayList<>();
        this.playerNumber = playerNumber;
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    @Override
    public String toString() {
        List<String> handArrayString = hand.stream().map(s -> s.toString()).collect(Collectors.toList());

        return "Player{" +
                "hand=" + String.join(",", handArrayString) +
                ", playerNumber=" + playerNumber +
                '}';
    }

    // TODO
    @Override
    public int compareTo(Player o) {
        return 0;
    }
}
