module com.mycompany.strawberryslastdaygame {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.strawberryslastdaygame to javafx.fxml;
    exports com.mycompany.strawberryslastdaygame;
}
