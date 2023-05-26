package com.example.jeu6.Game;

import com.example.jeu6.PLAYER.Row;

public class Board {
    private Row[] rows;

    public Board(int numRows) {
        rows = new Row[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new Row();
        }
    }

    public Row[] getRows() {
        return rows;
    }

    public void clearBoard() {
        for (Row row : rows) {
            row.clear();
        }
    }
}
