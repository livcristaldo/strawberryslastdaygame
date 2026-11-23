package com.mycompany.strawberryslastdaygame;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void vaiJogar() throws IOException {
        App.setRoot("gameplay");
    }

    @FXML
    private void vaiRanking() throws IOException {
        App.setRoot("ranking");
    }

    @FXML
    private void vaiCreditos() throws IOException {
        App.setRoot("creditos");
    }

    @FXML
    private void sair() {
        Platform.exit();
    }
}