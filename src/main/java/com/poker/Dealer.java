package com.poker;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private final Deck deck;
    private final List<Card> sharedCards;
    private final List<Player> players;

    public Dealer(Deck deck, List<Player> players) {
        this.deck = deck;
        this.sharedCards = new ArrayList<>();
        this.players = players;
    }

    public void deal() {
        for (int i = 0; i < 2; i++) {
            for (Player player : players) {
                player.add(deck.draw());
            }
        }
        for (int i = 0; i < 5; i++) {
            sharedCards.add(deck.draw());
        }
    }

    // TODO
    public void sortPlayersByHand() {
        // players.sort;
    }

    List<Card> getSharedCards() {
        return sharedCards;
    }

    @Override
    public String toString() {
        return "Dealer{\n\t" +
                "players=" + players +
                ",\n\t sharedCards=" + sharedCards +
                "\n}";
    }
}
