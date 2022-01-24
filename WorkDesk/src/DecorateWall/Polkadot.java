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
			CustomImageView floor3 = new CustomImageView(0, 640.4, "floor3.jpg");
			this.group.getChildren().addAll(this.customImageView.getImageView() , floor3.getImageView());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

