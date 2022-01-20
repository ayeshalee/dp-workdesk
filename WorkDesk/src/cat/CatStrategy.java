/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat;

import base.Location;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;

public class CatStrategy {

    Group group;
    HBox buttonMenu;
    String path = Location.path;
    String menuType = "Default";
    CatMain vArray[] = new CatMain[3];
    CatMain chosenCat;
    CatBehaviour bArray[] = new CatBehaviour[3];
    CatBehaviour chosenBehaviour;

    public CatStrategy(Group group, HBox buttonMenu) {
        vArray[0] = new blackCat();
        vArray[1] = new orangeCat();
        vArray[2] = new siameseCat();
        
        bArray[0] = new Sleep();
        bArray[1] = new Eat();
        bArray[2] = new Lick();

        this.group = group;
        this.buttonMenu = buttonMenu;
        // nanti add default
        // since malas nak dump semo dale constuctor
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

        MenuItem siameseCatButton = new MenuItem("Siamese");
        siameseCatButton.setOnAction((new EventHandler<ActionEvent>() {
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

        MenuButton menuButton = new MenuButton("Choose Cat", null, blackCatButton, orangeCatButton, siameseCatButton);
        this.buttonMenu.getChildren().add(menuButton);

        MenuButton behaviourButton = new MenuButton("Choose Behaviour", null, SleepButton, EatButton, LickButton);
        this.buttonMenu.getChildren().add(behaviourButton);

    }
    
    public void SetCat(int selection){
        this.chosenCat = this.vArray [selection];
        System.out.println("I am a "+ chosenCat.getClass().getName()+". ");
    }
    
    public void SetCatBehaviour(int selection){
        this.chosenBehaviour = this.bArray [selection];
//        System.out.println("I am a "+ chosenBehaviour.getClass().getName()+". ");
        this.chosenCat.setCatBehaviour(this.chosenBehaviour);
        this.chosenCat.performMove();
    }
}
