package com.example.media_view_node;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;          ///// there were problems in importing media Package so import accordingly
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private MediaView mediaView;

//    @FXML
//    private Button playButton, pauseButton, resetButton;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    public void playMedia() {
        mediaPlayer.play();
    }

    public void pauseMedia() {
        mediaPlayer.pause();
    }

    public void resetMedia() {

    /*
     //   If media is not playable that is we either hear audio only or is lagging, if we reset it first then play

    if(mediaPlayer.getStatus()!=MediaPlayer.Status.READY) {

            mediaPlayer.seek(Duration.seconds(0.0));
        }
    */
        mediaPlayer.seek(Duration.seconds(0.0));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //getting file path
        file = new File("src/Bruno Mars, Anderson .Paak, Silk Sonic - Leave the Door Open [Official Video].mp4");
        //setting media path that is providing media source name
        media = new Media(file.toURI().toString());
        // providing media player media that is to be played
        mediaPlayer = new MediaPlayer(media);
        // providing mediaView media player that we want to view otherwise we only hear audio
        mediaView.setMediaPlayer(mediaPlayer);
        //Creating EventHandler


    }
}