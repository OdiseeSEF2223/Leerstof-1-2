package com.example.geheledeling;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Klasse om een gehele deling te doen
 */
public class GeheleDelingController {

    @FXML
    public TextField txtX;
    @FXML
    public TextField txtY;
    @FXML
    public TextField txtResult;

    private GeheleDelingViewmodel viewmodel =  new GeheleDelingViewmodel();

    /**
     * Voer de deling uit (x en y wordt uit de ui uitgelezen)
     */
    public void bereken(){
        double x = Double.parseDouble(txtX.getText());
        double y = Double.parseDouble(txtY.getText());
        txtResult.setText("" + viewmodel.bereken(x, y));
    }
}
