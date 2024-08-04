package com.example.gui_3_changing_title_logo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),400,720);

         //Group root=new Group();
         //Scene scene = new Scene(fxmlLoader.load(),Color.BLACK);
         //Scene scene = new Scene(root,Color.WHEAT);
         // Scene scene = new Scene(root,Color.BLACK);
        //Scene scene = new Scene(root,Color.CORAL);
        //Scene scene = new Scene(root,Color.LAVENDER);
        // Scene scene = new Scene(root,Color.AQUA);
         //Scene scene = new Scene(root,Color.LINEN);

        stage.setTitle("Changed_Title_Logo_Icon");
        //  stage.setTitle("Hello!!");

       ////// calling Image class and giving relative or absolute path to the image that we want to add in the title
            //bar as icon
        //# with absolute path reference

        // Image Title_ICON=new Image("D:\\_________CODING_WORK______\\__PRACTICE__\\" +
        // "MY_GUI_Programs\\GUI_3_Changing_Title_logo\\src\\icons.png");

        //# with relative path reference
       Image Title_ICON=new Image("file:src/icons.png");
//        Image Title_ICON=
//                Image.getClass().getClassLoader().getResource("Snake/Images/background_options.png").toString(), true);

     //   stage.getX();
        //stage.getY();

        ////// calling the getIcons method of Stage to add Icons in the list of Icons
        //stage.setFullScreen(true);
       // stage.setWidth(600);
       // stage.setHeight(800);
        stage.getIcons().add(Title_ICON);

        stage.setScene(scene);  //////  Setting Scene on the Stage
        stage.show();

    }

    public static void main(String[] args) {
       // Application.launch(args);
        launch();
    }
}