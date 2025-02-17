package com.snakeladder;

/**
 * Ladder Class
 */
class Ladder extends Cell {
    private int end;

    public Ladder(int start, int end) {
        super(start);
        this.end = end;
    }

    @Override
    public int move() {
        return end;
    }
}
