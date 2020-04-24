/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lissajous;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Willem Dendauw
 */
public class Lissajous extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        LissajousData data = new LissajousData();
        
        BorderPane root = new BorderPane();
        root.setTop(new LissajousMenu());
        ControlePaneel controlePaneel = new ControlePaneel(data);
        root.setLeft(controlePaneel);
        LissajousCanvas canvas = new LissajousCanvas(data, 200,200);
        data.setCanvas(canvas);
        root.setCenter(canvas);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/stijl/LissajousCSS.css");
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
