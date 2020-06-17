package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.java.com.goxr3plus.javafxwebbrowser.browser.WebBrowserController;

public class Main {

    public static class Browserr extends Application {

        WebBrowserController webBrowserController = new WebBrowserController();
        @Override
        public void start(Stage stage) throws Exception {

            BorderPane borderPane = new BorderPane(webBrowserController);
            Scene scene = new Scene(borderPane);
            stage.setScene(scene);
            stage.show();

        }
    }

    public static void main(String[] args) {
        Application.launch(Browserr.class, args);
    }
}
