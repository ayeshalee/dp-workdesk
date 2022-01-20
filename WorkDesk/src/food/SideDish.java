package food;

import javafx.scene.image.ImageView;

abstract class SideDish {
	
	String name;
	FoodImageView imageView; 
	
	public ImageView getImageView() {
		return this.imageView.getImageView();
	}

	public void setSideDish(SideDish sideDish) {
		this.imageView.getImageView().setImage(sideDish.getImageView().getImage());
		this.imageView.getImageView().setX(sideDish.getImageView().getX());
		this.imageView.getImageView().setY(sideDish.getImageView().getY());
	}
	
	public String getName() {
		return this.name;
	}
}
