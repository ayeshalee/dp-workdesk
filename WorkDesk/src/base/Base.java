package base;

import java.io.FileNotFoundException;
import javafx.scene.Group;
import javafx.scene.image.ImageView;

public class Base {

    public Group group;

    public Base() {
        this.group = new Group();
        this.init();
    }

    public void init() {
        try {

            CustomImageView table = new CustomImageView(283.4, 461, "table.png");
            this.group.getChildren().add(table.getImageView());

            CustomImageView mat = new CustomImageView(497.8, 630.7, "mat.png");
            this.group.getChildren().add(mat.getImageView());

            CustomImageView window = new CustomImageView(38, 24.8, "window.png");
            this.group.getChildren().add(window.getImageView());

            CustomImageView plug = new CustomImageView(603.3, 540.7, "plug.png");
            this.group.getChildren().add(plug.getImageView());

            CustomImageView cable = new CustomImageView(613.5, 493.8, "cable.png");
            this.group.getChildren().add(cable.getImageView());

            CustomImageView file = new CustomImageView(313.6, 504.1, "file.png");
            this.group.getChildren().add(file.getImageView());

            CustomImageView pc = new CustomImageView(777.5, 492.8, "pc.png");
            this.group.getChildren().add(pc.getImageView());

            CustomImageView basket = new CustomImageView(189.6, 561.4, "basket.png");
            this.group.getChildren().add(basket.getImageView());

            CustomImageView desklamp = new CustomImageView(773.7, 306.6, "desklamp.png");
            this.group.getChildren().add(desklamp.getImageView());

            CustomImageView cactus = new CustomImageView(46.3, 328, "cactus.png");
            this.group.getChildren().add(cactus.getImageView());

            CustomImageView monitor = new CustomImageView(503.1, 291, "monitor.png");
            this.group.getChildren().add(monitor.getImageView());

            CustomImageView right_speaker = new CustomImageView(716.5, 395.4, "right_speaker.png");
            this.group.getChildren().add(right_speaker.getImageView());

            CustomImageView left_speaker = new CustomImageView(472.2, 395.4, "left_speaker.png");
            this.group.getChildren().add(left_speaker.getImageView());
            
            CustomImageView spiderman = new CustomImageView(115.2, 170.4, "spiderman.gif");
			this.group.getChildren().add(spiderman.getImageView());

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Group getGroup() {
        return group;
    }

}
