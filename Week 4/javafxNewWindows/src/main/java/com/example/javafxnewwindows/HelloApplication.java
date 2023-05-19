package com.example.javafxnewwindows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// 1. Verwijder de fx:controller in de fxml files
// 2. Na het aanmaken van de fxmlLoader zet je de controller (geef de application mee met de constructor)
// 3. Bewaar in de start methode de stage (dit wordt hergebruikt door alle schermen)
// 4. Pas de constructor van de hello controller aan om de application te bewaren (deze wordt gebruikt om andere schermen te openen)
// 5. Maak hieronder een methode aan om een tweede scherm te openen gebaseerd op de start
// 6. Gebruik deze tweede methode in de controller om het scherm te wisselen

//# voor het model
// maak een property voor het model (bibliotheek of wasserij in de application)
// geef deze door tot in het viewmodel via de constructors
// zo werken alle schermen met dezelfde data

// om informatie door te geven kan je het instellen in het model
// of rechtstreeks via de parameters van de functie om een scherm te openen
// pas op dat je pas data aanpast na het uitvoeren van de fxmlLoader.load()
// anders bestaan de UI-elementen nog niet

public class HelloApplication extends Application {

    private Stage stage;
    private Wasserij wasserij;

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        fxmlLoader.setController(new HelloController(this, wasserij));
        this.stage = stage;
        stage.setTitle("Scherm 1");
        stage.setScene(new Scene(fxmlLoader.load(), 300, 275));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void openScreen2(String text) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("window2.fxml"));
        ResultController ctrl = new ResultController(this, wasserij);
        fxmlLoader.setController(ctrl);
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        ctrl.load(text);

        stage.show();
    }
}