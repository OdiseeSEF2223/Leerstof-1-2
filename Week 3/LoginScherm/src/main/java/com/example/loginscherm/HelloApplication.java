package com.example.loginscherm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //hiermee bepaal je welk scherm geopend wordt
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // maak een window -> 320x240 pixels
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        // titel van het scherm applicatie
        stage.setTitle("Hello!");
        // toon het
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}