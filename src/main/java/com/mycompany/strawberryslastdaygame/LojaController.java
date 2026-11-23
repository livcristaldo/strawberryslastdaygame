package com.mycompany.strawberryslastdaygame;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class LojaController {

    @FXML
    private Label lblMoedas;

    @FXML
    private ChoiceBox<String> escolhaItem;

    private static int moedas = 50;
    private static ArrayList<String> itensComprados = new ArrayList<>();

    private ArrayList<String> itens = new ArrayList<>();
    private ArrayList<Integer> precos = new ArrayList<>();

    @FXML
    public void initialize() {
        itens.add("Vida extra");
        precos.add(20);

        itens.add("Mais dano");
        precos.add(30);

        itens.add("Mais velocidade");
        precos.add(25);

        escolhaItem.getItems().addAll(itens);
        atualizarMoedas();
    }

    @FXML
    private void comprar() {
        int indice = escolhaItem.getSelectionModel().getSelectedIndex();

        if (indice == -1) {
            mostrarAlerta("Atenção", "Escolha um item primeiro.");
            return;
        }

        String item = itens.get(indice);
        int preco = precos.get(indice);

        if (itensComprados.contains(item)) {
            mostrarAlerta("Atenção", "Você já comprou esse item.");
            return;
        }

        if (moedas < preco) {
            mostrarAlerta("Saldo insuficiente",
                    "Você não tem moedas suficientes para esse item.");
            return;
        }

        moedas = moedas - preco;
        itensComprados.add(item);

        atualizarMoedas();
        mostrarAlerta("Compra realizada", item + " foi comprado!");
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }

    private void atualizarMoedas() {
        lblMoedas.setText("Moedas: " + moedas);
    }

    private void mostrarAlerta(String titulo, String mensagem) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
}