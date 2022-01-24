package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;
import base.Location;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PictureFrame extends WallDeco {
	
	public PictureFrame(WallDesign walldesign) {
		super(walldesign.getGroup());
		this.walldesign = walldesign;
		
	}
	
	@Override
	public String getWallpaper() {
		return walldesign.getWallpaper() + ", with Frame";
	}

	@Override
	public void render() {
		this.walldesign.render();
		try {
			this.customImageView = new CustomImageView(528.6, 53.5, "frame.png");
			CustomImageView picture = new CustomImageView(535.8, 91.6, "picture_in_frame.png"); // special case since both at once
			this.walldesign.getGroup().getChildren().addAll(this.customImageView.getImageView(), picture.getImageView());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}


