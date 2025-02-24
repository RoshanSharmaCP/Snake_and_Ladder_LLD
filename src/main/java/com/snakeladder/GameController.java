package com.snakeladder;

import java.util.ArrayList;
import java.util.List;

/**
 * Game Controller
 */
class GameController {
    private List<Player> players;
    private Board board;
    private DiceRollStrategy dice;

    public GameController() {
        players = new ArrayList<>();
        board = new Board(100);
        dice = new StandardDice();
    }

    public void setupGame(List<Player> playerList, List<Cell> snakesAndLadders) {
        players.addAll(playerList);
        board.initializeBoard(snakesAndLadders);
    }

public void playGame() {
    boolean gameOver = false;
    while (!gameOver) {
        for (Player player : players) {
            int roll = dice.roll();
            player.update(player.getName() + " rolled a " + roll);

            player.move(roll, board);
            player.update(player.getName() + " moved to " + player.getPosition());

            if (player.getPosition() == board.getSize()) {
                player.update(player.getName() + " wins the game!");
                gameOver = true;
                break;
            }
        }
    }
}
}


