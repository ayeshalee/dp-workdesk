package food;

import base.Location;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class Food {

    Group group;
    HBox buttonMenu;
    String path = Location.path;
    String menuType = "Default";

    MainDish mainDish;
    Drink drink;
    SideDish sideDish;

    public Food(Group group, HBox buttonMenu) {
        this.group = group;
        this.buttonMenu = buttonMenu;
        // nanti add default
        // since malas nak dump semo dale constuctor
        this.init();

    }

    public void init() {
        MenuItem westernButton = new MenuItem("Menu 1 (Western Meals)");
        westernButton.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("Western Mels");
                setFood("Western");
            }
        }));

        MenuItem malaysianButton = new MenuItem("Menu 2 (Malaysian Meals)");
        malaysianButton.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("Malaysian Meals");
            }
        }));

        MenuItem kejarDeadlineButton = new MenuItem("Menu 3 (Kejar Deadline Meals)");
        kejarDeadlineButton.setOnAction((new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("Kejar Deadline Meals");
            }
        }));

        MenuButton menuButton = new MenuButton("Set Food", null, westernButton, malaysianButton, kejarDeadlineButton);
        this.buttonMenu.getChildren().add(menuButton);

    }

    public void setFood(String menuType) {
        if (menuType.equals("Western")) {
            FoodFactory westernFoodFactory = new WesternFoodFactory();

            this.mainDish = westernFoodFactory.createMainDish();
            this.drink = westernFoodFactory.createDrink();
            this.sideDish = westernFoodFactory.createSideDish();

            this.group.getChildren().addAll(this.mainDish.getImageView(), this.drink.getImageView(), this.sideDish.getImageView());
//			this.westernFood();
        } else if (menuType.equals("Malaysian")) {
//			this
        } else {
//			
        }
    }

//	public void westernFood() {
//		FoodFactory westernFoodFactory = new WesternFoodFactory();
//		this.mainDish = westernFoodFactory.createMainDish();
//		
//		this.drink = westernFoodFactory.createDrink();
//		this.group.getChildren().add(this.drink.getImageView());
//		
//		this.sideDish = westernFoodFactory.createSideDish();
//	}
}
