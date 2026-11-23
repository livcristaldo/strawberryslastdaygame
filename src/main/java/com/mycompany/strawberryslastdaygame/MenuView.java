package com.mycompany.strawberryslastdaygame;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MenuView extends VBox {

    public Label titulo = new Label("Strawberry's Last Day");

    public Button jogar = new Button("JOGAR");
    public Button ranking = new Button("RANKING");
    public Button creditos = new Button("CRÉDITOS");
    public Button sair = new Button("SAIR");

    public MenuView() {
        setAlignment(Pos.CENTER);
        setSpacing(20);

        getChildren().addAll(titulo, jogar, ranking, creditos, sair);
    }
}