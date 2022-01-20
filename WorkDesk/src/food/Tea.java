package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class Tea extends AbstractDrink {
	
	public Tea() {
		this.name = "Tea";
		try {
			this.imageView = new FoodImageView(408.7, 429.4, "tea.png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
