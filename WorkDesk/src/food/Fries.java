package food;

import java.io.FileNotFoundException;

import base.CustomImageView;
import javafx.scene.image.ImageView;

public class Fries implements SideDish {

	String name = "Fries";
	FoodImageView imageView; 
	
	public Fries() {
		try {
			this.imageView = new FoodImageView(361.9, 415.1, "fries.png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public ImageView getImageView() {
		return this.imageView.getImageView();
	}

	@Override
	public void setSideDish(SideDish sideDish) {
		this.imageView.getImageView().setImage(sideDish.getImageView().getImage());
		this.imageView.getImageView().setX(sideDish.getImageView().getX());
		this.imageView.getImageView().setY(sideDish.getImageView().getY());
	}

}
