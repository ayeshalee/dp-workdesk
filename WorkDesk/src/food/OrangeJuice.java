package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class OrangeJuice implements Drink{

	String name = "Orange Juice";
	FoodImageView imageView; 
	public OrangeJuice() {
		try {
			this.imageView = new FoodImageView(409.5, 394.3, "orange_juice.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ImageView getImageView() {
		return this.imageView.getImageView();
	}

	@Override
	public void setDrink(Drink drink) {
		this.imageView.getImageView().setImage(drink.getImageView().getImage());
		this.imageView.getImageView().setX(drink.getImageView().getX());
		this.imageView.getImageView().setY(drink.getImageView().getY());
	}

}
