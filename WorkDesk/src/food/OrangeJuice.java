package food;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//import base.CustomImageView;
import base.Location;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class OrangeJuice implements Drink{

	String name = "Orange Juice";
//	CustomImageView imageView; 
	ImageView imageView; 
	public OrangeJuice() {
		// TODO Auto-generated constructor stub
		try {
//			this.imageView = new CustomImageView(409.5, 394.3, "orange_juice.png");
			
			Image image = new Image(new FileInputStream(Location.path + "orange_juice.png"));
			this.imageView = new ImageView(image); 
			this.imageView.setX(409.5); 
			this.imageView.setY(394.3); 
			this.imageView.setPreserveRatio(true);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ImageView getImageView() {
//		return this.imageView.getImageView();
		return this.imageView;
	}

}
