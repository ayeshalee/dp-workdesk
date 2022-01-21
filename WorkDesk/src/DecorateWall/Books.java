package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;

public class Books extends WallDeco {
	
	WallDesign walldesign;
	
	public Books(WallDesign walldesign) {
		super(walldesign.getGroup());
		this.walldesign = walldesign;
	}

	@Override
	public String getWallpaper() {
		return walldesign.getWallpaper() + ", with Books";
	}

	@Override
	public void render() {
		try {
			this.customImageView = new CustomImageView(784.3, 168.3, "book.png");
			CustomImageView camera = new CustomImageView(1007.6, 280.1, "camera.png");
			this.walldesign.getGroup().getChildren().addAll(this.customImageView.getImageView(), camera.getImageView());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}