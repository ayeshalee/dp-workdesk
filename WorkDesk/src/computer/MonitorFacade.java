/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ayesha
 */
public class MonitorFacade {

    Group group;
    HBox buttonMenu;
    Screen screen;
    Music music;

    boolean isSet = false;

    public MonitorFacade(Group group, HBox buttonMenu) {
        this.group = group;
        this.buttonMenu = buttonMenu;
        this.screen = new Screen(this.group);
        this.music = new Music();

        this.init();
    }

    private void init() {
        MenuItem popMode = new MenuItem("Pop");
        popMode.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                shuffle("pop");
            }
        }));

        MenuItem focusMode = new MenuItem("Focus");
        focusMode.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                select("focus");
            }
        }));

        MenuItem chillMode = new MenuItem("Chill");
        chillMode.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                select("chill");
            }
        }));

        MenuItem start = new MenuItem("Start");
        start.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                on();
            }
        }));

        MenuItem shutdown = new MenuItem("Shut Down");
        shutdown.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                off();
            }
        }));

        MenuButton menuButton = new MenuButton("Monitor", null, popMode, focusMode, chillMode, shutdown, start);
        this.buttonMenu.getChildren().add(menuButton);

        Button button = new Button("Shuffle Virtual Workspace");
        button.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                select("");

            }
        }));
        this.buttonMenu.getChildren().add(button);
    }

    public void on() {

        screen.onScreen();
        music.playMusic();
        this.isSet = true;
    }

    public void off() {
        screen.offScreen();
        music.stopMusic();
        this.isSet = false;
    }

    public void select(String mode) {
        String chosen;
        if (!mode.equals("")) {
            chosen = mode;
        } else {
            chosen = getMode();
        }
        shuffle(chosen);
    }

    public void shuffle(String mode) {
        if (isSet) {
            off();
        }
        screen.shuffle(mode);
        music.shuffle(mode);
        this.isSet = true;
    }

    public String getMode() {
        String[] modes = {"chill", "focus", "pop"};
        int rnd = new Random().nextInt(modes.length);
        String mode = modes[rnd];
        return mode;
    }

}
