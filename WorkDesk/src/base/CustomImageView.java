package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import light.Light;
import light.LightColorEvent;
import light.LightListener;
import light.LightMenu;
import light.LightSwitchEvent;

public class CustomImageView extends Location {

    public CustomImageView(double x, double y, String filename) throws FileNotFoundException {
        super(x, y);

        Image image = new Image(new FileInputStream(Location.path + filename));
        this.imageView = new ImageView(image);
        this.imageView.setX(this.x);
        this.imageView.setY(this.y);
        this.imageView.setPreserveRatio(true);
        
    }

    public void setNullImageView() {
        this.imageView.setImage(null);
    }
    
}
