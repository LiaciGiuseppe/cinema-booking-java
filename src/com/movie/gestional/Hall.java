package com.movie.gestional;

public class Hall {
    private final int id;
    private final int rows;
    private final int cols;
    private final boolean[][] seats; // true = not free, false = free

    public Hall(int id, int rows, int cols) {
        this.id = id;
        this.rows = rows;
        this.cols = cols;
        this.seats = new boolean[rows][cols]; 
    }

    public boolean isSeatAvailable(int row, int col) {
        return !seats[row][col];
    }

    public void bookSeat(int row, int col) {
        if (isSeatAvailable(row, col)) {
            seats[row][col] = true;
        } else {
            throw new IllegalStateException("Posto già occupato!");
        }
    }

    public int getId() { return id; }
}
