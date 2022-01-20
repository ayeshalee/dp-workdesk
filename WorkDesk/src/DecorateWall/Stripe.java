package DecorateWall;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import base.Location;
import javafx.scene.image.Image;

public class Stripe extends WallDesign {
	
	public Stripe() {
		try {
			this.image = new Image(new FileInputStream(Location.path + "stripe.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
