package food;

import base.Location;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class Food {

	Group group;
	HBox buttonMenu;
	Stage stage;
	Label label;
	
	public static final String FOOD_ASSET_PATH = Location.BASIC_PATH + "food\\image\\";
	String menuType = "Default";
	
	AbstractMainDish mainDish = null;
	AbstractDrink drink = null;
	AbstractSideDish sideDish = null;
	
	FoodFactory factory;
	
	public Food(Group group, HBox buttonMenu, Stage primaryStage) {
		this.group = group;
		this.buttonMenu = buttonMenu;
		this.stage = primaryStage;
		this.init();
		
	}
	
	public void init() {
		
		MenuItem fastFoodMenu = new MenuItem("Fast Food");
        MenuItem homeCookedFoodMenu = new MenuItem("Home Cooked Food");
        MenuItem healthyFoodMenu = new MenuItem("Healthy Food");
        MenuButton menuButton = new MenuButton("Set Food", null, fastFoodMenu, homeCookedFoodMenu, healthyFoodMenu);
        
        fastFoodMenu.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        menuButton.setText(fastFoodMenu.getText());
		        setFood(fastFoodMenu.getText());
		    }
         }));
        
        homeCookedFoodMenu.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
				menuButton.setText(homeCookedFoodMenu.getText());
		        setFood(homeCookedFoodMenu.getText());
		    }
         }));
        
        healthyFoodMenu.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        menuButton.setText(healthyFoodMenu.getText());
		        setFood(healthyFoodMenu.getText());
		    }
         }));
        this.buttonMenu.getChildren().add(menuButton);
        
        this.label = new Label("");
        this.label.setStyle("-fx-font-weight: bold;-fx-text-fill:#5E34B1;-fx-background-color:white;");
        this.label.setLayoutX(270.5);
        this.label.setLayoutY(300);
        this.label.setPadding(new Insets(5, 5, 5, 5));
        this.group.getChildren().add(this.label);
	}
	
	public void setFood(String foodFamily) {
		
		
		if(foodFamily.equalsIgnoreCase("Fast Food")) {
			this.factory = new FastFoodFactory();
		}else if (foodFamily.equalsIgnoreCase("Home Cooked Food")) {
			this.factory = new HomeCookedFoodFactory();
		}else if (foodFamily.equalsIgnoreCase("Healthy Food")) {
			this.factory = new HealthyFoodFactory();
		}else {
			return ;
		}
		
		this.factory.createFoodFamily();
		
		
		this.setView(this.factory.getMainDish(), this.factory.getDrink(), this.factory.getSideDish());
	}
	
	public void setView(AbstractMainDish mainDish, AbstractDrink drink, AbstractSideDish sideDish) {
		
		if(this.mainDish == null) {
			this.group.getChildren().add(mainDish.getImageView());
			this.mainDish = mainDish;
		}else {
			this.mainDish.setMainDish(mainDish);
		}
		
		if(this.drink == null) {
			this.group.getChildren().add(drink.getImageView());
			this.drink = drink;
		}else {
			this.drink.setDrink(drink);
		}
		
		if(this.sideDish == null) {
			this.group.getChildren().add(sideDish.getImageView());
			this.sideDish = sideDish;
		}else {
			this.sideDish.setSideDish(sideDish);
		}
		
		String foodText = "Family: " + this.factory.getName() + "\n"
				+ "Main Dish: " + mainDish.getName() + "\n"
				+ "Side Dish: " + sideDish.getName() + "\n"
				+ "Drink: " + drink.getName() + "\n";
		
		this.label.setText(foodText);
	}
	
}







