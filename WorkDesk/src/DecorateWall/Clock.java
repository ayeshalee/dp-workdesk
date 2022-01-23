package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;
import base.Location;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Clock extends WallDeco {
	
	WallDesign walldesign;
	
	public Clock(WallDesign walldesign) {
		super(walldesign.getGroup());
		this.walldesign = walldesign;
	}

	@Override
	public String getWallpaper() {
		return walldesign.getWallpaper() + ", with Clock";
	}

	@Override
	public void render() {
		this.walldesign.render();
		try {
			this.customImageView = new CustomImageView(905, 22.1, "clock.png");
			this.walldesign.getGroup().getChildren().add(this.customImageView.getImageView());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

 

  
