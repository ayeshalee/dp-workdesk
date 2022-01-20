package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class Burger extends MainDish{

	public Burger() {
		this.name = "Burger";
		try {
			this.imageView = new FoodImageView(307, 411.3, "burger.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
