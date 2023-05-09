package com.example.geheledeling;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * Klasse om een gehele deling te doen
 */
public class GeheleDeling {

    @FXML
    private TextField txtX;
    @FXML
    private TextField txtY;
    @FXML
    private TextField txtResult;

    /**
     * Voer de deling uit (x en y wordt uit de ui uitgelezen)
     */
    public void bereken(){
        double x = Double.parseDouble(txtX.getText());
        double y = Double.parseDouble(txtY.getText());
        int result = (int) (x/y);
        txtResult.setText("" + result);
    }
}
