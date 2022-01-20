package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;
import base.Location;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Clock extends WallDeco {
	
	
	CustomImageView imageView;
	WallDesign walldesign;
	
	public Clock(WallDesign walldesign) {
		this.walldesign = walldesign;
		this.walldesign.getChildren().add(this.imageView.getImageView());
	}
	
	public String getWallpaper() {
		return walldesign.getWallpaper();
	}
	
	public ImageView getImageView() {
		try {
			this.imageView = new CustomImageView(528.6, 53.5, "clock.png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return null;
//		return this.imageView.getImageView() + walldesign.getImageview(); 
	 }
	
}

 

  
