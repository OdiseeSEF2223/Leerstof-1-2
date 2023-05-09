package com.example.loginscherm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;

    @FXML
    public void cancelLogin(ActionEvent actionEvent) {
        txtUsername.setText("");
        txtPassword.setText("");
    }

    public void loginUser(ActionEvent actionEvent) {
        System.out.println("test");
        System.out.println();
        if(txtUsername.getText().equals("Jens") && txtPassword.getText().equals("Jens")){
            txtPassword.setText("Ingelogd");
        }
        txtUsername.setText("");
    }
}