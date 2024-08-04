package com.example.handlingevents_creating_event_handler_token;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void up(ActionEvent e){
       // System.out.println("Moving UP");
        myCircle.setCenterY(y-=10);          // setting y=y-10  for moving circle 10 units Up
    }
    public void down(ActionEvent e){
      //  System.out.println("Moving DOWN");
        myCircle.setCenterY(y+=10);
    }
    public void left(ActionEvent e){
       // System.out.println("Moving LEFT");
        myCircle.setCenterX(x-=10);
    }
    public void right(ActionEvent e){
       // System.out.println("Moving RIGHT");
        myCircle.setCenterX(x+=10);
    }

}