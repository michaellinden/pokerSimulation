package com.poker;

import com.poker.game.Game;

public class Main {
    public static void main(String args[]) {

        Integer numberOfPlayer = 3;

        Game game = new Game();
        game.runGame(numberOfPlayer);
    }
}
