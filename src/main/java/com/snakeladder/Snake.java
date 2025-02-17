package com.snakeladder;

/**
 * Snake Class
 */
class Snake extends Cell {
    private int end;

    public Snake(int start, int end) {
        super(start);
        this.end = end;
    }

    @Override
    public int move() {
        return end;
    }
}
