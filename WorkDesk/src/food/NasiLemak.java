package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class NasiLemak implements MainDish {
	
	String name = "Nasi Lemak";
	FoodImageView imageView; 

	public NasiLemak() {
		try {
			this.imageView = new FoodImageView(270.5, 406.5, "nasi_lemak.png");
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
