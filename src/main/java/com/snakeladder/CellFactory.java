package com.snakeladder;

/**
 * Cell Factory for Snake and Ladder
 */
class CellFactory {
    public static Cell createCell(int start, int end) {
        if (start > end) {
            return new Snake(start, end);
        } else if (start < end) {
            return new Ladder(start, end);
        } else {
            return new Cell(start);
        }
    }
}
