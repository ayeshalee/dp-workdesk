package food;

import java.io.FileNotFoundException;

import base.CustomImageView;
import javafx.scene.image.ImageView;

public class Burger implements MainDish{

	String name = "Burger";
	CustomImageView imageView; 
	
	public Burger() {
		try {
			this.imageView = new CustomImageView(307, 411.3, "burger.png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public ImageView getImageView() {
		return this.imageView.getImageView();
	}

}
