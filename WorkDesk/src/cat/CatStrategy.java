package cat;

import java.io.FileNotFoundException;

import base.CustomImageView;
import base.Location;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class CatStrategy {

    Group group;
    HBox buttonMenu;
    Cat chosenCat;
    
    ImageView catImageView;

    public CatStrategy(Group group, HBox buttonMenu) {   

        this.group = group;
        this.buttonMenu = buttonMenu;
        
        // initial default image and selected cat (Black Lick)
        try {
			this.catImageView = (new CustomImageView(492.3, 530, "black_lick.gif")).getImageView();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        this.group.getChildren().add(this.catImageView);
        this.chosenCat = new blackCat(this.catImageView);
        this.chosenCat.setCatBehaviour(new Lick());
        this.chosenCat.performMove();
        
        this.init();

    }

    public void init() {
        MenuItem blackCatButton = new MenuItem("Black Cat");
        blackCatButton.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("Kucing itam across kubur");
                SetCat(0);
            }
        }));

        MenuItem orangeCatButton = new MenuItem("Orange Cat");
        orangeCatButton.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("Oyen");
                SetCat(1);
            }
        }));

        MenuItem whiteCatButton = new MenuItem("White Cat");
        whiteCatButton.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("Santai");
                SetCat(2);
            }
        }));

        MenuItem SleepButton = new MenuItem("Sleep Cat");
        SleepButton.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("Tidur");
                SetCatBehaviour(0);
            }
        }));

        MenuItem EatButton = new MenuItem("Eat Cat");
        EatButton.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("Nom nom nom nom");
                SetCatBehaviour(1);
            }
        }));

        MenuItem LickButton = new MenuItem("Lick Cat");
        LickButton.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("Purr purrr");
                SetCatBehaviour(2);
            }
        }));

        MenuButton menuButton = new MenuButton("Choose Cat", null, blackCatButton, orangeCatButton, whiteCatButton);
        this.buttonMenu.getChildren().add(menuButton);

        MenuButton behaviourButton = new MenuButton("Choose Behaviour", null, SleepButton, EatButton, LickButton);
        this.buttonMenu.getChildren().add(behaviourButton);

    }
    
    public void SetCat(int selection){
        if (selection == 0){
        	this.chosenCat = new blackCat(this.catImageView);
        } else if (selection == 1){
        	this.chosenCat = new orangeCat(this.catImageView);
        } else if (selection == 2){
        	this.chosenCat = new whiteCat(this.catImageView);
        }
        System.out.println("I am a "+ chosenCat.name + "cat . ");
    }
    
    public void SetCatBehaviour(int selection){
    	
        if (selection == 0){
        	this.chosenCat.setCatBehaviour(new Sleep());
        } else if (selection == 1){
        	this.chosenCat.setCatBehaviour(new Eat());
        } else if (selection == 2){
        	this.chosenCat.setCatBehaviour(new Lick());
        }
        
        this.chosenCat.performMove();
    }
}
