package com.example.progressbar;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label progressBarLabel;

    @Override
    public void start(Stage stage) throws IOException {

       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Pane root =new Pane();

        Scene scene=new Scene(root);
        stage.setScene((scene));
        stage.show();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        int counter = 0;

        while (counter <= 100) {

            progressBar.setProgress((counter));
            progressBarLabel.setText(counter + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter += 1;
        }

        progressBarLabel.setText("Game Loaded Successfully!");
    }


    public static void main(String[] args) {
        launch();
    }
}