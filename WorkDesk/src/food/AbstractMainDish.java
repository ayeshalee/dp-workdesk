package food;

import javafx.scene.image.ImageView;

abstract class AbstractMainDish {

	String name;
	FoodImageView imageView; 
	
	public ImageView getImageView() {
		return this.imageView.getImageView();
	}
	
	public void setMainDish(AbstractMainDish mainDish) {
		this.imageView.getImageView().setImage(mainDish.getImageView().getImage());
		this.imageView.getImageView().setX(mainDish.getImageView().getX());
		this.imageView.getImageView().setY(mainDish.getImageView().getY());
	}
	
	public String getName() {
		return this.name;
	}
}
