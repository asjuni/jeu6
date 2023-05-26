package com.example.jeu6;

import com.example.jeu6.Game.Board;
import com.example.jeu6.Game.Game;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

public class GamePresenter {

    HelloApplication application;
    GameView gameView;
    Game game;

    public GamePresenter(GameView gameView, Game game, HelloApplication application) {
        this.gameView = gameView;
        this.game = game;
        this.application = application;
    }

    /*public void handleClick(MouseEvent e) {
        System.out.println("Vous avez cliqué sur une carte");
        if (game.isGameOver()) {
            System.out.println("Fin du jeu !");
            return;
        }
        if (game.isGameOver()) {
            Timeline timeline = new Timeline();
            timeline.getKeyFrames().add(new KeyFrame(Duration.millis(3000),
                    (f) -> {
                        int winner = ((game.getCurrentPlayer() + 1) % 2);
                        System.out.printf("Le joueur %d a gagné!", winner);
                        application.declareWinner(winner);
                    }
            ));
            timeline.play();
        }
    }*/
}
