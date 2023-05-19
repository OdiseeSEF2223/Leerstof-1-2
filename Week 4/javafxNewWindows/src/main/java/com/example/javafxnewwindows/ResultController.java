package com.example.javafxnewwindows;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ResultController {

    @FXML
    private Label lbl;


    public ResultController(HelloApplication helloApplication, Wasserij wasserij) {

    }

    public void load(String text){
        // hier kan je data uit model halen of meegegeven parametesr
        // de ui element bestaan als je dit doet na de fxmlloader.load()

        lbl.setText(text);
    }
}
