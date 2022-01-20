package food;

import base.Location;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class Food {

	Group group;
	HBox buttonMenu;
	public static final String FOOD_ASSET_PATH = Location.BASIC_PATH + "food\\image\\";
	String menuType = "Default";
	
	MainDish mainDish = null;
	Drink drink = null;
	SideDish sideDish = null;
	
	FoodFactory factory;
	
	public Food(Group group, HBox buttonMenu) {
		this.group = group;
		this.buttonMenu = buttonMenu;
		this.init();
		
	}
	
	public void init() {
		MenuItem menu1 = new MenuItem("Menu 1");
		menu1.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        System.out.println("Menu 1");
		        setFood(1);
		    }
         }));
		 
        MenuItem menu2 = new MenuItem("Menu 2");
        menu2.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        System.out.println("Menu 2");
		        setFood(2);
		    }
         }));
        
        MenuItem menu3 = new MenuItem("Menu 3 ");
        menu3.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        System.out.println("Menu 3");
		        setFood(3);
		    }
         }));
        
        MenuButton menuButton = new MenuButton("Set Food", null, menu1, menu2, menu3);
        this.buttonMenu.getChildren().add(menuButton);
        
	}
	
	public void setFood(int menuType) {
		
		MainDish mainDish1 = null;
		Drink drink1 = null;
		SideDish sideDish1 = null;
		
		if(menuType == 1) {
			this.factory = new Set1FoodFactory();
		}else if (menuType == 2) {
			this.factory = new Set2FoodFactory();
		}else {
		
		}
		
		mainDish1 = this.factory.createMainDish();
		drink1 = this.factory.createDrink();
		sideDish1 = this.factory.createSideDish();
		
		this.setView(mainDish1, drink1, sideDish1);
		
	}
	
	public void setView(MainDish mainDish1, Drink drink1, SideDish sideDish1) {
		
		if(this.mainDish == null) {
			this.group.getChildren().add(mainDish1.getImageView());
			this.mainDish = mainDish1;
		}else {
			this.mainDish.setMainDish(mainDish1);
		}

		
		
		if(this.drink == null) {
			this.group.getChildren().add(drink1.getImageView());
			this.drink = drink1;
		}else {
			this.drink.setDrink(drink1);
		}
		
		
		if(this.sideDish == null) {
			this.group.getChildren().add(sideDish1.getImageView());
			this.sideDish = sideDish1;
		}else {
			this.sideDish.setSideDish(sideDish1);
		}
		
	}
	
}







