package DecorateWall;

import base.CustomImageView;
import javafx.scene.Group;


public abstract class WallDesign {
	
	Group group;
	String wallpaper = "pattern";
	CustomImageView customImageView;
	
	public WallDesign(Group group) {
		this.group = group;
	};

	public String getWallpaper() {
		return wallpaper;
	}
	
	public Group getGroup() {
		return this.group;
	}
	
	public abstract void render();
		
}