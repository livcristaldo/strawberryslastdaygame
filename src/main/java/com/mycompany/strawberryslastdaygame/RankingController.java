package com.mycompany.strawberryslastdaygame;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RankingController {

    @FXML
    private Label lblRanking;

    private static String pontuacoes = "Ainda não há pontuações.";

    @FXML
    public void initialize() {
        lblRanking.setText(pontuacoes);
    }

    public static void adicionarPontuacao(String nome, int pontos) {
        if (pontuacoes.equals("Ainda não há pontuações.")) {
            pontuacoes = "";
        }

        pontuacoes = pontuacoes + nome + " - " + pontos + " pontos\n";
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}