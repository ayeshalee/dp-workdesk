package DecorateWall;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import base.Location;
import javafx.scene.image.Image;

public class Polkadot extends WallDesign{
	
	public Polkadot() {
		try {
			this.image = new Image(new FileInputStream(Location.path + "polka.jpg"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
