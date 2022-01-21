package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;

public class Board extends WallDeco {
	
	WallDesign walldesign;
	
	public Board(WallDesign walldesign) {
		super(walldesign.getGroup());
		this.walldesign = walldesign;
	}

	@Override
	public String getWallpaper() {
		return walldesign.getWallpaper() + ", with Board";
	}

	@Override
	public void render() {
		try {
			this.customImageView = new CustomImageView(319, 140, "board.png");
			this.walldesign.getGroup().getChildren().add(this.customImageView.getImageView());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}