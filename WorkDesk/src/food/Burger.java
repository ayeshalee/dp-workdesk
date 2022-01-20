package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class Burger implements MainDish{

	String name = "Burger";
	FoodImageView imageView; 
	
	public Burger() {
		try {
			this.imageView = new FoodImageView(307, 411.3, "burger.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public ImageView getImageView() {
		return this.imageView.getImageView();
	}

	@Override
	public void setMainDish(MainDish mainDish) {
		this.imageView.getImageView().setImage(mainDish.getImageView().getImage());
		this.imageView.getImageView().setX(mainDish.getImageView().getX());
		this.imageView.getImageView().setY(mainDish.getImageView().getY());
	}

}
