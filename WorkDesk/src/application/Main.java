package application;

import base.Base;
import computer.ComputerFacade;
import food.Food;
import javafx.application.Application;
import javafx.stage.Stage;
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
    private int sceneHeight = 770;

    @Override
    public void start(Stage primaryStage) {
        try {

            Base background = new Base();
            Group backgroundGroup = background.getGroup();

            Button button1 = new Button("Button Number 1");
            Button button2 = new Button("Button Number 2");

            Label label = new Label("Not clicked");
            Button button = new Button("test");
            button.setLayoutX(250);
            button.setLayoutY(300);

            button.setOnMouseClicked((new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    System.out.println("Yay click jadi wehh");
                }
            }));

            HBox buttonMenu = new HBox(button1, button2, button);
            buttonMenu.setAlignment(Pos.TOP_CENTER);
            buttonMenu.setSpacing(10);
//            buttonMenu.setBackground(new Background(new BackgroundFill(Color.BLUE,null,null)));

            Group content = new Group(backgroundGroup);

            VBox vbox = new VBox(content, buttonMenu);
            Scene scene = new Scene(vbox, this.sceneWidth, this.sceneHeight);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            //setting color to the scene 
//			scene.setFill(Color.BROWN);  
            primaryStage.setTitle("WorkDesk");
            primaryStage.setScene(scene);
            primaryStage.show();

            content.getChildren().add(label);

            new Food(content, buttonMenu);

            new ComputerFacade(content, buttonMenu);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
