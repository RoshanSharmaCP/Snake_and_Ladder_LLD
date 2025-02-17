package com.snakeladder;

/**
 * Base Cell Class
 */
class Cell {
    protected int start;

    public Cell(int start) {
        this.start = start;
    }

    public int move() {
        return start;
    }

    public int getStart() {
        return start;
    }
}