package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class OrangeJuice extends Drink{

	public OrangeJuice() {
		this.name = "Orange Juice";
		try {
			this.imageView = new FoodImageView(409.5, 394.3, "orange_juice.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
