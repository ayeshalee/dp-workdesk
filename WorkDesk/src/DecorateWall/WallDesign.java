package DecorateWall;

import javafx.scene.Group;
import javafx.scene.image.Image;


public abstract class WallDesign extends Group {
	
	String wallpaper = "pattern";
	Image image;

	public String getWallpaper() {
		return wallpaper;
	
	}
	
	public Image getImage() {
		return this.image;
	}
		
}