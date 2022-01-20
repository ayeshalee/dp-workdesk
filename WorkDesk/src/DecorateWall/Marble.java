package DecorateWall;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import base.Location;
import javafx.scene.image.Image;

public class Marble extends WallDesign {
	
	public Marble() {
		try {
			this.image = new Image(new FileInputStream(Location.path + "marble.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
