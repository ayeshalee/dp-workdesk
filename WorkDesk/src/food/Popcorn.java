package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class Popcorn implements SideDish {

	String name = "Popcorn";
	FoodImageView imageView; 
	
	public Popcorn() {
		try {
			this.imageView = new FoodImageView(356.8, 404.2, "popcorn.png");
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