package com.mycompany.strawberryslastdaygame;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class UpgradesController {

    @FXML
    private Label lblMoedas;

    @FXML
    private Label lblStatus;

    @FXML
    private ChoiceBox<String> escolhaUpgrade;

    private static int moedas = 50;
    private static int vida = 100;
    private static int dano = 10;
    private static int velocidade = 1;

    @FXML
    public void initialize() {
        escolhaUpgrade.getItems().add("Mais vida");
        escolhaUpgrade.getItems().add("Mais dano");
        escolhaUpgrade.getItems().add("Mais velocidade");

        atualizarTela();
    }

    @FXML
    private void comprar() {
        String upgrade = escolhaUpgrade.getValue();

        if (upgrade == null) {
            mostrarAlerta("Atenção", "Escolha um upgrade.");
            return;
        }

        int preco = 0;

        if (upgrade.equals("Mais vida")) {
            preco = 20;
        } else if (upgrade.equals("Mais dano")) {
            preco = 30;
        } else if (upgrade.equals("Mais velocidade")) {
            preco = 25;
        }

        if (moedas < preco) {
            mostrarAlerta("Atenção", "Você não tem moedas suficientes.");
            return;
        }

        moedas = moedas - preco;

        if (upgrade.equals("Mais vida")) {
            vida = vida + 20;
        } else if (upgrade.equals("Mais dano")) {
            dano = dano + 5;
        } else if (upgrade.equals("Mais velocidade")) {
            velocidade = velocidade + 1;
        }

        atualizarTela();
        mostrarAlerta("Compra realizada", upgrade + " comprado!");
    }

    private void atualizarTela() {
        lblMoedas.setText("Moedas: " + moedas);
        lblStatus.setText(
                "Vida: " + vida
                + " | Dano: " + dano
                + " | Velocidade: " + velocidade
        );
    }

    private void mostrarAlerta(String titulo, String mensagem) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
}