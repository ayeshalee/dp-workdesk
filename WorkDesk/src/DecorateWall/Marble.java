package DecorateWall;

import java.io.FileNotFoundException;
import base.CustomImageView;
import javafx.scene.Group;

public class Marble extends WallDesign {
	
	public Marble(Group group) {
		super(group);
		this.wallpaper = "Marble";
		try {
			CustomImageView customImageView = new CustomImageView(0, 0, "marble.png");
			this.group.getChildren().add(customImageView.getImageView());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
	
}
