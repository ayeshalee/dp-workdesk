package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;
import javafx.scene.Group;

public class Default extends WallDesign {
	
	public Default(Group group) {
		super(group);
		this.wallpaper = "Stripe";
	}

	@Override
	public void render() {
		try {
			this.customImageView = new CustomImageView(0, 0, "background.png");
			this.group.getChildren().add(this.customImageView.getImageView());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

