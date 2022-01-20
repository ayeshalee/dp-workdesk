package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class Apple extends AbstractSideDish {

	public Apple () {
		this.name = "Apple ";
		try {
			this.imageView = new FoodImageView(356.8, 404.2, "apple.png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}