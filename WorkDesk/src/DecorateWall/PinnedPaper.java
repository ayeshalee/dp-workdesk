package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;

public class PinnedPaper extends WallDeco {
	
	WallDesign walldesign;
	
	public PinnedPaper(WallDesign walldesign) {
		super(walldesign.getGroup());
		this.walldesign = walldesign;
	}

	@Override
	public String getWallpaper() {
		return walldesign.getWallpaper() + " with Pinned Paper";
	}

	@Override
	public void render() {
		this.walldesign.render();
		try {
			this.customImageView = new CustomImageView(686.6, 144, "pinned_paper.png");
			this.walldesign.getGroup().getChildren().add(this.customImageView.getImageView());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}