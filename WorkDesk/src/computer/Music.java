/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import base.Location;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

/**
 *
 * @author Ayesha
 */
public class Music {

    String uri = Location.BASIC_URI;
    String path = uri + "computer/music/";
    String musicName;
    double musicVolume = 0.5;

    Media media;
    MediaPlayer mediaPlayer;

    public void setMusic() {
    	System.out.println("Playing " + this.musicName);
        String musicPath = path + this.musicName;
        this.media = new Media(new File(musicPath).toURI().toString());
        this.mediaPlayer = new MediaPlayer(this.media);
        this.mediaPlayer.setVolume(this.musicVolume);
        this.mediaPlayer.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                mediaPlayer.seek(Duration.ZERO);
            }
        });
        this.mediaPlayer.setAutoPlay(true);
    }

    public void playMusic() {
        this.musicName = "startup.mp3";
        this.setMusic();
    }

    public void stopMusic() {
        this.mediaPlayer.stop();
    }

    public void shuffle(String mode) {
        this.mediaPlayer.stop();
        this.musicName = mode + ".mp3";
        setMusic();
    }

    public String increaseVolume() {
        if (this.musicVolume < 0.9) {
            this.musicVolume += 0.1;
            this.mediaPlayer.setVolume(this.musicVolume);
            System.out.println((int) Math.round(this.musicVolume * 100) + "%");
        }
        return (int) Math.round(this.musicVolume * 100) + "%";
    }

    public String decreaseVolume() {
        if (musicVolume >= 0.1) {
            musicVolume = this.musicVolume - 0.1;
            this.mediaPlayer.setVolume(this.musicVolume);
            System.out.println((int) Math.round(this.musicVolume * 100) + "%");
        }
        return (int) Math.round(this.musicVolume * 100) + "%";
    }

}
