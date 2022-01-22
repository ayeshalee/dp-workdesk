/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import base.Location;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    Label label;

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

        this.label = new Label("Volume: 50%");
        this.label.setStyle("-fx-font: 20 arial; -fx-font-weight: bold;-fx-text-fill:white;");
        this.label.setLayoutX(550);
        this.label.setLayoutY(270);
        this.group.getChildren().add(this.label);

        Image img_vol_up = new Image(Location.BASIC_PATH + "assets\\volume-up.png");
        ImageView view_vol_up = new ImageView(img_vol_up);
        view_vol_up.setFitHeight(15);
        view_vol_up.setPreserveRatio(true);
        this.increaseVol = new Button();
        this.increaseVol.setGraphic(view_vol_up);
        this.increaseVol.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String newVolume = music.increaseVolume();

                label.setText("Volume: " + newVolume);
            }
        }));

        Image img_vol_down = new Image(Location.BASIC_PATH + "assets\\volume-down.png");
        ImageView view_vol_down = new ImageView(img_vol_down);
        view_vol_down.setFitHeight(15);
        view_vol_down.setPreserveRatio(true);
        this.decreaseVol = new Button();
        this.decreaseVol.setGraphic(view_vol_down);
        this.decreaseVol.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String newVolume = music.decreaseVolume();
                label.setText("Volume: " + newVolume);
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
        this.label.setVisible(visible);
    }

}
