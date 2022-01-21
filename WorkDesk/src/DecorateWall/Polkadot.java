package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;
import javafx.scene.Group;

public class Polkadot extends WallDesign{
	
	public Polkadot(Group group) {
		super(group);
		this.wallpaper = "Polkadot";
	}

	@Override
	public void render() {
		try {
			this.customImageView = new CustomImageView(0, 0, "polka.jpg");
			this.group.getChildren().add(this.customImageView.getImageView());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
