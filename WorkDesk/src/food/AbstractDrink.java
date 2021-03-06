package food;

import javafx.scene.image.ImageView;

abstract class AbstractDrink {
	String name;
	FoodImageView imageView; 
	
	public ImageView getImageView() {
		return this.imageView.getImageView();
		
	}
	
	public void setDrink(AbstractDrink drink) {
		this.imageView.getImageView().setImage(drink.getImageView().getImage());
		this.imageView.getImageView().setX(drink.getImageView().getX());
		this.imageView.getImageView().setY(drink.getImageView().getY());
	}
	
	public String getName() {
		return this.name;
	}
}
