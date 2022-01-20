package food;

import java.io.FileNotFoundException;

import javafx.scene.image.ImageView;

public class NasiLemak extends AbstractMainDish {
	
	public NasiLemak() {
		this.name = "Nasi Lemak";
		
		try {
			this.imageView = new FoodImageView(270.5, 406.5, "nasi_lemak.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
