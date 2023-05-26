package com.example.jeu6;

import com.example.jeu6.Game.Board;
import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;

public class GameView extends GridPane {
    static final int constraintWidth = 150;

    public GameView() {
        this.setPadding(new Insets(5, 0, 0, 5));
        this.setPrefWidth(constraintWidth * 3);
        this.setPrefHeight(constraintWidth * 3);
        this.setMinHeight(this.getPrefHeight());
        this.setMinWidth(this.getPrefWidth());
        this.setGridLinesVisible(true);
    }
}
