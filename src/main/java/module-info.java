module com.example.jeu6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.jeu6 to javafx.fxml;
    exports com.example.jeu6;
}