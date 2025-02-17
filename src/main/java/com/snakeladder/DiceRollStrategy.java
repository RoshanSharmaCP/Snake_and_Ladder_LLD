package com.snakeladder;

import java.util.Random;

/**
 * Dice Strategy Pattern
 */
interface DiceRollStrategy {
    int roll();
}

class StandardDice implements DiceRollStrategy {
    private Random random = new Random();
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
