package com.snakeladder;


import java.util.Arrays;
import java.util.List;

/**
 * Main Class to Run Game
 */
public class SnakeLadderMain {
    public static void main(String[] args) {
        SnakeLadderGame game = SnakeLadderGame.getInstance();

        List<Player> players = Arrays.asList(new Player("Alice"), new Player("Bob"));
        List<Cell> snakesAndLadders = Arrays.asList(
                CellFactory.createCell(14, 7),  // Snake
                CellFactory.createCell(23, 5),  // Snake
                CellFactory.createCell(8, 29),  // Ladder
                CellFactory.createCell(21, 82)  // Ladder
        );

        game.getInstance().gameController.setupGame(players, snakesAndLadders);
        game.startGame();
    }
}
