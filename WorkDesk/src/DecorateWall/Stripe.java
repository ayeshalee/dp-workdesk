package DecorateWall;

import java.io.FileNotFoundException;

import base.CustomImageView;
import javafx.scene.Group;

public class Stripe extends WallDesign {
	
	public Stripe(Group group) {
		super(group);
		this.wallpaper = "Stripe";
	}

	@Override
	public void render() {
		try {
			this.customImageView = new CustomImageView(0, 0, "stripe.png");
			CustomImageView floor2 = new CustomImageView(0, 640.4, "floor2.jpg");
			//this.group.getChildren().add(floor.getImageView());
			this.group.getChildren().addAll(this.customImageView.getImageView() , floor2.getImageView());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}


