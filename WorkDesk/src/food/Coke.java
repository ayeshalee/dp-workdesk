package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class Coke extends AbstractDrink{

	public Coke() {
		this.name = "Coke";
		try {
			this.imageView = new FoodImageView(409.5, 394.3, "coke.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
