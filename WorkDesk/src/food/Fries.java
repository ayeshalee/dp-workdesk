package food;

import java.io.FileNotFoundException;

import base.CustomImageView;
import javafx.scene.image.ImageView;

public class Fries extends AbstractSideDish {

	public Fries() {
		this.name = "Fries";
		
		try {
			this.imageView = new FoodImageView(361.9, 415.1, "fries.png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
