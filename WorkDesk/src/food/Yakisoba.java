package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class Yakisoba extends SideDish {

	public Yakisoba () {
		this.name = "Yakisoba ";
		
		try {
			this.imageView = new FoodImageView(356.8, 404.2, "japanese_food.png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}