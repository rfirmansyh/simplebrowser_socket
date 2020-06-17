package com.pemjarbrowser.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import main.java.com.goxr3plus.javafxwebbrowser.browser.WebBrowserController;

import java.net.URL;
import java.util.ResourceBundle;

public class Home implements Initializable {

    @FXML
    private BorderPane borderpane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        WebBrowserController webBrowserController = new WebBrowserController();
        borderpane.setCenter(webBrowserController);
    }
}
