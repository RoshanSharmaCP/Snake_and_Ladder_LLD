package com.snakeladder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Board Class
 */
class Board {
    private int size;
    private Map<Integer, Cell> cells;

    public Board(int size) {
        this.size = size;
        cells = new HashMap<>();
    }

    public void initializeBoard(List<Cell> cellList) {
        for (Cell cell : cellList) {
            cells.put(cell.getStart(), cell);
        }
    }

    public int getNewPosition(int position) {
        return cells.getOrDefault(position, new Cell(position)).move();
    }

    public int getSize() {
        return size;
    }
}