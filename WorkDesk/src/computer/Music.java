/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.io.File;
import java.util.ArrayList;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author Ayesha
 */
public class Music {

//    tak boleh guna Location.path sbb File kena guna forward slash
    String BASIC_PATH = "D:/code/dp-workdesk/WorkDesk/src/";
    String path = BASIC_PATH + "computer/music/";
    String musicName;
    ArrayList musicList = new ArrayList<String>();

    Media media;
    MediaPlayer mediaPlayer;

    public void playMusic() {
        this.setMusic("startup.mp3");
    }

    public void stopMusic() {
        System.out.println("stop music");
        this.mediaPlayer.stop();
    }

    public void setMusic(String name) {
//        this.musicName = name;
        System.out.println("Playing " + name);
        String musicPath = path + name;
        System.out.println("Starting music");
        this.media = new Media(new File(musicPath).toURI().toString());
        this.mediaPlayer = new MediaPlayer(this.media);
        this.mediaPlayer.setAutoPlay(true);
    }

    public void shuffle(String mode) {
        String musicName = mode + ".mp3";
//        System.out.println(musicName);
        setMusic(musicName);
    }

}
