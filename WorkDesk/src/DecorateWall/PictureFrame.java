package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;
import base.Location;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PictureFrame extends WallDeco{
	
	
	CustomImageView imageView;
	WallDesign walldesign;
	
	public PictureFrame(WallDesign walldesign) {
		this.walldesign = walldesign;
	}
	
	public String getWallpaper() {
		return walldesign.getWallpaper();
	}
	
	public ImageView getImageView() {
		try {
			this.imageView = new CustomImageView(528.6, 53.5, "frame.png");
			this.imageView = new CustomImageView(535.8, 91.6, "picture_in_frame.png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return this.imageView.getImageView() + walldesign.getImageview(); 
	 }
	}



