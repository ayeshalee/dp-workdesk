package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CustomImageView extends Location {

    public CustomImageView(double x, double y, String filename) throws FileNotFoundException {
        super(x, y);

        Image image = new Image(new FileInputStream(this.path + filename));
        this.imageView = new ImageView(image);
        this.imageView.setX(this.x);
        this.imageView.setY(this.y);
        this.imageView.setPreserveRatio(true);
    }

    public void setNullImageView() {
        this.imageView.setImage(null);
    }
    
}
