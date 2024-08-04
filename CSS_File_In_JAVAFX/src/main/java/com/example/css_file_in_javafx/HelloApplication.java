package com.example.css_file_in_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));

        Scene scene = new Scene(root);

       // scene.getStylesheets().add(getClass().getResource("application.css").toString());
      //  scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        // If we want to apply our css file to more than 1 scenes we can use this method
        String css = new File("src/application.css").toURI().toString();
        scene.getStylesheets().add(css);
        /*
        scene1.getStylesheets().add(css);
        scene2.getStylesheets().add(css);
        scene3.getStylesheets().add(css);
        */
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}