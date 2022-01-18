package base;

import javafx.scene.image.ImageView;

public class Location {

    double x;
    double y;
    public static final String BASIC_PATH = "D:\\code\\1_NetBeans-Projects\\WIF3007 Design Patterns\\WorkDesk\\src\\";
    public static final String BASIC_URI = "D:/code/1_NetBeans-Projects/WIF3007 Design Patterns/WorkDesk/src/";
    public static String path = BASIC_PATH + "assets\\";
    ImageView imageView;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImageView getImageView() {
        return this.imageView;
    }

}
