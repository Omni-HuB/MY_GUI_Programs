package com.example.adding_shapes_to_gui;

import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.fonts.Fonts;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.*;
import javafx.scene.image.Image;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.load();
        Tile tile =new Tile();
        ///Scene scene = new Scene(fxmlLoader.load(),400,720, Color.LAVENDER);
        Group root=new Group();
        Scene scene = new Scene(root,600,400,Color.LAVENDER);

        stage.setTitle("Changed_Title_Logo_Icon");

        ////// calling Image class and giving relative or absolute path to the image that we want to add in the title
        //bar as icon
        Image Title_ICON = new Image("file:src/icons8-call-of-duty-modern-warfare-100.png");
        stage.getIcons().add(Title_ICON);

        Text text=new Text();
        text.setText(" CALL OF DUTY !!!!");
        text.isUnderline();
        //text.setFill(new Color(100,180,246,50));
        text.setTranslateX(100);
        text.setTranslateY(200);
        //text.setFont(Font.font("COMIC SANS",48.0));
        //text.setFont(new Font("ARIAL BLACK",44.0));
        text.setFont(new Font("Papyrus",44.0));


        Line line = new Line();
        line.setStartX(800);
        line.setStartY(500);
        line.setEndX(100);
        line.setEndY(700);
        line.setRotate(45);
        line.setFill(Color.GREEN);
        line.setStrokeDashOffset(2);
        line.setEffect(new Lighting());
        line.setStroke(Color.RED);
        line.setStrokeWidth(5);

        Rectangle rect =new Rectangle();
        rect.setFill(Color.YELLOW);
        rect.setX(600);
        rect.setY(300);
        rect.setWidth(100);
        rect.setHeight(100);
        rect.setStroke(Color.BLUE);
        rect.setStrokeWidth(5);


        // We need to set { coordinates } of the Shape. That we are creating if we are using the Polygon class
        Polygon triangle=new Polygon();
        triangle.getPoints().addAll(80.0,300.0,
                                        200.0,600.0,
                                        100.0,600.0);
        triangle.setFill(Color.YELLOW);
        triangle.setStrokeWidth(4.0);
        triangle.setStroke(Color.AQUA);
        triangle.setEffect(new InnerShadow());


        //root.getChildren().add(text);
        //root.getChildren().add(line);
        root.getChildren().addAll(text,line,rect,triangle);
        stage.setScene(scene);
        //stage.setFullScreen(true);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}