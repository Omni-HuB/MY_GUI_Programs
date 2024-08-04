package com.animation.animation;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ImageView myImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /*                                      Code from  BRO CODE
              // translate
      TranslateTransition translate = new TranslateTransition();
      translate.setNode(myImage);
      translate.setDuration(Duration.millis(1000));
      translate.setCycleCount(TranslateTransition.INDEFINITE);
      translate.setByX(500);
      translate.setByY(-250);
      translate.setAutoReverse(true);
      translate.play();
      /*
      // rotate
      RotateTransition rotate = new RotateTransition();
      rotate.setNode(myImage);
      rotate.setDuration(Duration.millis(500));
      rotate.setCycleCount(TranslateTransition.INDEFINITE);
      rotate.setInterpolator(Interpolator.LINEAR);
      rotate.setByAngle(360);
      rotate.setAxis(Rotate.Z_AXIS);
      rotate.play();

      // fade
      FadeTransition fade = new FadeTransition();
      fade.setNode(myImage);
      fade.setDuration(Duration.millis(1000));
      fade.setCycleCount(TranslateTransition.INDEFINITE);
      fade.setInterpolator(Interpolator.LINEAR);
      fade.setFromValue(0);
      fade.setToValue(1);
      fade.play();

      // scale
      ScaleTransition scale = new ScaleTransition();
      scale.setNode(myImage);
      scale.setDuration(Duration.millis(1000));
      scale.setCycleCount(TranslateTransition.INDEFINITE);
      scale.setInterpolator(Interpolator.LINEAR);
      scale.setByX(2.0);
      scale.setByY(2.0);
      scale.setAutoReverse(true);
      scale.play();
      */
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //////////////////////////
        /*
        My Code
        */

        /*

        ///////////////                                        TRANSLATE

        TranslateTransition translate = new TranslateTransition();

        translate.setNode(myImage);                       // setting the node to which you want to translate

        translate.setByX(500);                            // setting coordinated till where you want it to travel
        translate.setDuration(Duration.millis(2000));     // setting duration of time period in which the transition
                                                          // should happen that is slowing the transition speed

        translate.setCycleCount(5);                      // setting the no. of time the transition should happen
        translate.setAutoReverse(true);                  // for translating image back and forth

        translate.play();

         */


       //////////////                                           ROTATE
//        RotateTransition rotate = new RotateTransition();
//        rotate.setNode(myImage);
//        rotate.setByAngle(45.0);
//        rotate.setAutoReverse(true);
//        rotate.setCycleCount(10);
//        rotate.setDuration(Duration.millis(1000));
//        rotate.play();
        FadeTransition fade = new FadeTransition();
        fade.setNode(myImage);
        fade.setDuration(Duration.millis(1000));
        fade.setCycleCount(TranslateTransition.INDEFINITE);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();





    }
}