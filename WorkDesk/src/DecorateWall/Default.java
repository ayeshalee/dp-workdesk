package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;
import javafx.scene.Group;

public class Default extends WallDesign {
	
	public Default(Group group) {
		super(group);
		this.wallpaper = "Default";
	}

	@Override
	public void render() {
		try {
			this.customImageView = new CustomImageView(0, 0, "background.png");
			CustomImageView floor = new CustomImageView(0, 640.4, "floor.png");
			this.group.getChildren().addAll(this.customImageView.getImageView() , floor.getImageView());

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

