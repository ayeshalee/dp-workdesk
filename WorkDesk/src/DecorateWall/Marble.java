package DecorateWall;

import java.io.FileNotFoundException;
import base.CustomImageView;
import javafx.scene.Group;

public class Marble extends WallDesign {
	
	public Marble(Group group) {
		super(group);
		this.wallpaper = "Marble";
	
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		try {
			this.customImageView = new CustomImageView(0, 0, "marble.jpg");
			CustomImageView floor1 = new CustomImageView(0, 640.4, "floor1.jpg");
			this.group.getChildren().addAll(this.customImageView.getImageView() , floor1.getImageView());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}

