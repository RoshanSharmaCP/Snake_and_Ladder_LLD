package com.snakeladder;

/**
 * Observer Pattern - Player
 */
interface Observer {
    void update(String message);
}

class Player implements Observer {
    private String name;
    private int position;

    public Player(String name) {
        this.name = name;
        this.position = 1;
    }

    public void move(int steps, Board board) {
        int newPos = position + steps;
        if (newPos <= board.getSize()) {
            position = board.getNewPosition(newPos);
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
