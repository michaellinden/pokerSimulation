package com.poker;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public void runGame(Integer numberOfPlayers) {
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player(i));
        }
        Deck deck = Deck.constructDeck();
        deck.shuffle();

        System.out.println(deck);

        Dealer dealer = new Dealer(deck, players);
        dealer.deal();
        System.out.println(dealer);
    }
}
