package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class Tea implements Drink {
	
	String name = "Tea";
	FoodImageView imageView; 

	public Tea() {
		// TODO Auto-generated constructor stub
		try {
			this.imageView = new FoodImageView(408.7, 429.4, "cocoa.gif");
//			this.imageView = new FoodImageView(408.7, 429.4, "tea.png");
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
	public void setDrink(Drink drink) {
		this.imageView.getImageView().setImage(drink.getImageView().getImage());
		this.imageView.getImageView().setX(drink.getImageView().getX());
		this.imageView.getImageView().setY(drink.getImageView().getY());
	}

}
