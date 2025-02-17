package com.snakeladder;

import java.util.*;


/**
 * Singleton Class for Game Instance
 */
class SnakeLadderGame {
    private static SnakeLadderGame instance;
    GameController gameController;

    SnakeLadderGame() {
        gameController = new GameController();
    }

    public static SnakeLadderGame getInstance() {
        if (instance == null) {
            instance = new SnakeLadderGame();
        }
        return instance;
    }

    public void startGame() {
        gameController.playGame();
    }
}