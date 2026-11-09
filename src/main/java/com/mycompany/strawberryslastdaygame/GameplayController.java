package com.mycompany.strawberryslastdaygame;

import java.io.IOException;
import javafx.fxml.FXML;

public class GameplayController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}