package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Registr {
    @FXML
    void registration(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("new.fxml"));
        Stage stage = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 800, 600);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Зареєструватися");
        stage.setScene(scene);
        stage.show();
    }
}