package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {


    @FXML
    void buttonClicked(ActionEvent event) {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registr.fxml"));
        Stage stage = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 320, 240);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Реєстрація");
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void button(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("button.fxml"));
        Stage stage = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 320, 240);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("вхід");
        stage.setScene(scene);
        stage.show();
    }



}

