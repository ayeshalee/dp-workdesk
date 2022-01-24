package DecorateWall;

import javafx.scene.Group;

public abstract class WallDeco extends WallDesign {
	WallDesign walldesign;

	public WallDeco(Group group) {
		super(group);
		// TODO Auto-generated constructor stub
	}

	public abstract String getWallpaper();
}



