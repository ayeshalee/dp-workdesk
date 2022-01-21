package DecorateWall;

import base.CustomImageView;
import base.Location;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class DecorateWall{
	
	Group backgroundGroup;
	ImageView backgroundImageView;
	HBox buttonMenu;
	String path = Location.path;
	WallDesign walldesign;
	
	public DecorateWall(HBox buttonMenu) {
		this.backgroundGroup = new Group();
		this.walldesign = new Default(this.backgroundGroup);
		this.walldesign.render();
		
		this.buttonMenu = buttonMenu;
		
		this.init();
	}
	

	public void init() {
		MenuItem marbleButton = new MenuItem("Marble");
		marbleButton.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        System.out.println("Marble");
		        setWallpaper("Marble");
		    }
         }));
		
		MenuItem stripeButton = new MenuItem("Stripe");
		stripeButton.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        System.out.println("Stripe");
		        setWallpaper("Stripe");
		    }
         }));
		
		MenuItem polkadotButton = new MenuItem("Polkadot");
		polkadotButton.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
     	        setWallpaper("Polkadot");
		    }
         }));
		
		MenuItem addclockButton = new MenuItem("Clock");
		addclockButton.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        addClock();
		    }
         }));
		
		MenuItem addFrameButton = new MenuItem("Frame");
		addFrameButton.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        addFrame();
		    }
         }));

		MenuItem addBoardButton = new MenuItem("Board");
		addBoardButton.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
				addBoard();
			}
		}));
		
		MenuItem addPinnedPaperButton = new MenuItem("Pinned Paper");
		addPinnedPaperButton.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
				addPinnedPaper();
			}
		}));
		
		MenuItem addBookButton = new MenuItem("Book");
		addBookButton.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
				addPinnedPaper();
			}
		}));
		
		MenuButton menuButton = new MenuButton("Decorate Wall", null, marbleButton, stripeButton,polkadotButton,
				addclockButton, addFrameButton, addBoardButton, addPinnedPaperButton, addBookButton);
		
        this.buttonMenu.getChildren().add(menuButton);
	}
	
	
    public void setWallpaper(String menuType) {
    	this.backgroundGroup.getChildren().clear();
    	
		if(menuType.equals("Marble")) {
			this.walldesign = new Marble(this.backgroundGroup);
		}else if (menuType.equals("Stripe")) {
			this.walldesign = new Stripe(this.backgroundGroup);
			
		}else if (menuType.equals("Polkadot")) {
			this.walldesign = new Polkadot(this.backgroundGroup);
		}
		this.walldesign.render();
	}
        
    public void addClock() {
    	this.walldesign = new Clock(this.walldesign);
    	System.out.println(this.walldesign.getWallpaper());
    	this.walldesign.render();
    }
        	 
	public void addFrame() {
		this.walldesign = new PictureFrame(this.walldesign);
		System.out.println(this.walldesign.getWallpaper());
		this.walldesign.render();
	}
	
	public void addBoard() {
		this.walldesign = new Board(this.walldesign);
		System.out.println(this.walldesign.getWallpaper());
		this.walldesign.render();
	}

	public void addPinnedPaper() {
		this.walldesign = new PinnedPaper(this.walldesign);
		System.out.println(this.walldesign.getWallpaper());
		this.walldesign.render();
	}
	
	public void addBook() {
		this.walldesign = new Books(this.walldesign);
		System.out.println(this.walldesign.getWallpaper());
		this.walldesign.render();
	}
             
    	
	public Group getGroup() {
		return this.backgroundGroup;
	}
}



