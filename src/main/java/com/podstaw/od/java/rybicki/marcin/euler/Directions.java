package com.podstaw.od.java.rybicki.marcin.euler;

public enum Directions {
    LEFT(0,-1),
    DOWN(1,0),
    RIGHT(0,1),
    UP(-1,0);

    private int row;
    private int col;

    private Directions(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public int getNewRowIdx(int currentRow){
        return currentRow + getRow();
    }

    public int getNewColIdx(int currentCol){
        return currentCol + getCol();
    }
}
