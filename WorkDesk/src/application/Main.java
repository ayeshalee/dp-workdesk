package application;

import DecorateWall.DecorateWall;
import base.Base;
import base.CustomImageView;
import cat.CatStrategy;
import computer.ComputerFacade;
import food.Food;
import javafx.application.Application;
import javafx.stage.Stage;
import light.Light;
import light.MainLight;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.event.EventHandler;
import javafx.geometry.Pos;

public class Main extends Application {

    private int sceneWidth = 1080;
    private int sceneHeight = 770; //770 original 680 tom

    @Override
    public void start(Stage primaryStage) {
        try {
        	
            Base base = new Base();
            Group baseGroup = base.getGroup();

            HBox buttonMenu = new HBox();
            buttonMenu.setAlignment(Pos.TOP_CENTER);
            buttonMenu.setSpacing(10);
            
            DecorateWall decorateWall = new DecorateWall(baseGroup, buttonMenu);
            
            Group content = new Group(decorateWall.getGroup(), baseGroup);
            
            VBox vbox = new VBox(content, buttonMenu);
            Scene scene = new Scene(vbox, this.sceneWidth, this.sceneHeight);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            //setting color to the scene 
            primaryStage.setTitle("WorkDesk Virtual Space");
            primaryStage.setScene(scene);
            primaryStage.show();

            new Food(content, buttonMenu, primaryStage);
            new ComputerFacade(content, buttonMenu);
            new MainLight(content);
            new CatStrategy(content, buttonMenu);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
