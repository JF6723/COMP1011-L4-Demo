package com.example.week4stringlabregex;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;


    @FXML
    private TextField txtPhoneNumber;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        txtPhoneNumber.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.matches("[2-9]\\d{2}[-,\\s][0-9]{3}[-,\\s][0-9]{4}"))
            {
                welcomeText.setText(String.format("%s is a good phone number.",newValue.replaceAll("[-]"," ")));
            }
            else
            {
                welcomeText.setText("Please follow the instructions below");
            }
        });

    }
}