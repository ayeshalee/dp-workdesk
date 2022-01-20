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
		
		MenuItem menu1 = new MenuItem("Fast Food");
        MenuItem menu2 = new MenuItem("Home Cooked Food");
        MenuItem menu3 = new MenuItem("Healthy Food");
        MenuButton menuButton = new MenuButton("Set Food", null, menu1, menu2, menu3);
        
		menu1.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        menuButton.setText(menu1.getText());
		        setFood(1);
		    }
         }));
        
        menu2.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
				menuButton.setText(menu2.getText());
		        setFood(2);
		    }
         }));
        
        menu3.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        menuButton.setText(menu3.getText());
		        setFood(3);
		    }
         }));
        this.buttonMenu.getChildren().add(menuButton);
        
        this.label = new Label("");
        this.label.setStyle("-fx-font-weight: bold;-fx-text-fill:#5E34B1;-fx-background-color:white;");
        this.label.setLayoutX(270.5);
        this.label.setLayoutY(350);
        this.label.setPadding(new Insets(5, 5, 5, 5));
        this.group.getChildren().add(this.label);
	}
	
	public void setFood(int menuType) {
		
		AbstractMainDish mainDish = null;
		AbstractDrink drink = null;
		AbstractSideDish sideDish = null;
		
		if(menuType == 1) {
			this.factory = new FastFoodFactory();
		}else if (menuType == 2) {
			this.factory = new HomeCookedFoodFactory();
		}else {
			this.factory = new HealthyFoodFactory();
		}
		
		this.factory.createFoodFamily();
		mainDish = this.factory.getMainDish();
		drink = this.factory.getDrink();
		sideDish = this.factory.getSideDish();
		
		this.setView(mainDish, drink, sideDish);
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
		
		String foodText = "Main Dish: " + mainDish.getName() + "\n"
				+ "Side Dish: " + sideDish.getName() + "\n"
				+ "Drink: " + drink.getName() + "\n";
		
		this.label.setText(foodText);
	}
	
}







