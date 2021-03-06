package base;

import javafx.scene.image.ImageView;

public class Location {

    public double x;
    public double y;
    
//    public static final String BASIC_PATH = "C:\\Users\\User\\OneDrive - 365.um.edu.my\\BCS SE\\WIF3007 DP\\dp-workdesk\\WorkDesk\\src\\";
//    public static final String BASIC_URI = "C:/Users/User/OneDrive - 365.um.edu.my/BCS SE/WIF3007 DP/dp-workdesk/WorkDesk/src/";
    
//    public static final String BASIC_PATH = "D:\\code\\dp-workdesk\\WorkDesk\\src\\";
//    public static final String BASIC_URI = "D:/code/dp-workdesk/WorkDesk/src/";
    
    public static final String BASIC_PATH = "C:\\Users\\RaihanSatar\\git\\dp-workdesk\\WorkDesk\\src\\";
    public static final String BASIC_URI = "C:/Users/RaihanSatar/git/dp-workdesk/WorkDesk/src/";
    
//    public static final String BASIC_PATH = "C:\\Users\\RaihanSatar\\eclipse-workspace\\WorkDesk\\src\\";
    public static String path = BASIC_PATH + "assets\\";
    public ImageView imageView;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImageView getImageView() {
        return this.imageView;
    }

}
