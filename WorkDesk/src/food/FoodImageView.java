package food;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import base.Location;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FoodImageView extends Location {

	public FoodImageView(double x, double y, String filename) throws FileNotFoundException {
		super(x, y);
		
		Image image = new Image(new FileInputStream(Food.FOOD_ASSET_PATH + filename));
		this.imageView = new ImageView(image); 
		this.imageView.setX(this.x); 
		this.imageView.setY(this.y); 
		this.imageView.setPreserveRatio(true);
	}

}
