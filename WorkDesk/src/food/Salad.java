package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class Salad extends AbstractMainDish {
	
	public Salad() {
		this.name = "Salad";
		
		try {
			this.imageView = new FoodImageView(270.5, 406.5, "Salad.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
