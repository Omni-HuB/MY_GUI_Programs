package com.example.progressbar;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public ProgressBar progressBar;
    @FXML
    public Label progressBarLabel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressBar.setStyle("-fx-accent: #00FF00;");
        progressIncrease();
    }


   public void progressIncrease(){
           Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), new EventHandler<ActionEvent>() {

               @Override
               public void handle(ActionEvent event)    {
                    int counter = 0;

                    while (counter <= 100) {

                        progressBar.setProgress((counter));
                        progressBarLabel.setText(counter + "%");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        counter += 10;

                    }
                    progressBarLabel.setText("Game Loaded Successfully!");
                   timeline.setCycleCount(5);
                   timeline.play();
           }
           }

    }
}