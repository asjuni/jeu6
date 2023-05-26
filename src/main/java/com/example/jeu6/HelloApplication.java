package com.example.jeu6;

import com.example.jeu6.Game.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        this.stage = stage;
        VBox root = new VBox();
        GameView gameView = new GameView();
        Game game = new Game();
        GamePresenter gamePresenter = new GamePresenter(gameView, game, this);
        System.out.println("Le 6 qui prend commence !");
        root.getChildren().add(gameView);
        Scene scene = new Scene(root, 1000, 1000);
        this.stage.setTitle("6 qui prend!");
        this.stage.setScene(scene);
        this.stage.show();
    }

    public void declareWinner(int player) {
        VBox root = new VBox();
        Label label = new Label(String.format("Le joueur %d a gagné !", player));
        label.getStyleClass().add("label");
        root.getStyleClass().add("vbox");
        root.getStylesheets().add(
                Objects.requireNonNull(
                                getClass().getResource("style.css"))
                        .toExternalForm()
        );
        root.getChildren().add(label);
        Scene scene = new Scene(root, 1000, 1000);
        this.stage.setTitle("Fin du jeu !");
        this.stage.setScene(scene);
        this.stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}