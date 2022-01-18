/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.util.ArrayList;
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
public class ComputerFacade {

    Group group;
    HBox buttonMenu;
    Screen screen;
    Music music;
    Button increaseVol;
    Button decreaseVol;
    boolean screenOn = false;

    ArrayList<String> modes = new ArrayList<>();

    public ComputerFacade(Group group, HBox buttonMenu) {
        this.group = group;
        this.buttonMenu = buttonMenu;
        this.screen = new Screen(this.group);
        this.music = new Music();
        this.modes.add("relax");
        this.modes.add("code");
        this.modes.add("youtube");

        this.init();
    }

    private void init() {

        MenuItem mode1 = new MenuItem("Relax Mode");
        mode1.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                shuffle("relax");
            }
        }));

        MenuItem mode2 = new MenuItem("Work Mode");
        mode2.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                select("code");
            }
        }));

        MenuItem mode3 = new MenuItem("Fun Mode");
        mode3.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                select("youtube");
            }
        }));

        MenuItem start = new MenuItem("Start");
        start.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                on();
            }
        }));

        MenuItem shutdown = new MenuItem("Shut Down");
        shutdown.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                off();
            }
        }));

        MenuButton menuButton = new MenuButton("Monitor", null, start, mode1, mode2, mode3, shutdown);
        this.buttonMenu.getChildren().add(menuButton);

        this.increaseVol = new Button("+");
        this.increaseVol.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                music.increaseVolume();
            }
        }));

        this.decreaseVol = new Button("-");
        this.decreaseVol.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                music.decreaseVolume();
            }
        }));
        this.buttonMenu.getChildren().add(this.decreaseVol);
        this.buttonMenu.getChildren().add(this.increaseVol);
        this.setVisible(false);
    }

    public void on() {
        screen.onScreen();
        music.playMusic();
        this.screenOn = true;
    }

    public void off() {
        screen.offScreen();
        music.stopMusic();
        this.setVisible(false);
        this.screenOn = false;
    }

    public void shuffle(String mode) {
        if (!this.screenOn) {
            this.on();
        }
        screen.shuffle(mode);
        music.shuffle(mode);
        this.setVisible(true);
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

    public String getMode() {
        String mode = "";
        System.out.println(this.modes);
        mode = modes.get(0);

        System.out.println(mode);

        ArrayList<String> newList = this.modes;
        newList.remove(mode);
        newList.add(mode);
        this.modes = newList;
        return mode;
    }

    public void setVisible(boolean visible) {
        this.increaseVol.setVisible(visible);
        this.decreaseVol.setVisible(visible);
    }

}
