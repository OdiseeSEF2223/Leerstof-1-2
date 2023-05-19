package com.example.javafxnewwindows;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    private HelloApplication app;
    private HelloViewModel viewModel;

    public HelloController(HelloApplication helloApplication, Wasserij wasserij) {
        this.app = helloApplication;
        this.viewModel = new HelloViewModel(wasserij);
    }

    @FXML
    protected void onUser1ButtonClick () {
        try {
            app.openScreen2("je hebt op knop 1 geduwd");
        } catch(Exception e){

        }
    }


    @FXML
    protected void onUser2ButtonClick () {
        try {
            app.openScreen2("knop 2");
        } catch(Exception e){

        }
    }
}