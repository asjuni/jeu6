module com.example.jeu6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.jeu6 to javafx.fxml;
    exports com.example.jeu6;
    exports com.example.jeu6.CARD;
    opens com.example.jeu6.CARD to javafx.fxml;
    exports com.example.jeu6.PLAYER;
    opens com.example.jeu6.PLAYER to javafx.fxml;
    exports com.example.jeu6.Game;
    opens com.example.jeu6.Game to javafx.fxml;
}