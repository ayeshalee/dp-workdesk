/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import base.CustomImageView;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Group;

/**
 *
 * @author Ayesha
 */
public class Screen {

    Group screenGroup;
    CustomImageView screenView;

    Screen(Group group) {
        this.screenGroup = group;
    }

    public void setScreen(String screenName) {
        System.out.println("Setting " + screenName + " screen");
        try {
            this.screenView = new CustomImageView(513.9, 301.5, screenName);
            this.screenGroup.getChildren().add(this.screenView.getImageView());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void onScreen() {
        System.out.println("Starting up...");
        this.setScreen("screen2.png");
    }

    public void offScreen() {
        System.out.println("Shutting down..");
        this.screenView.setNullImageView();
    }

    public void shuffle(String mode) {
        System.out.println("Changing screen..");
        this.screenView.setNullImageView();
        String screenName = "screen-" + mode + ".gif";
        setScreen(screenName);
    }

}
