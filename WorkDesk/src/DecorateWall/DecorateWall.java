package DecorateWall;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import base.CustomImageView;
import base.Location;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class DecorateWall{
	
	Group group;
	Group backgroundGroup;
	ImageView backgroundImageView;
	
	HBox buttonMenu;
	String path = Location.path;
	String menuType = "Default";
	CustomImageView ImageView;
	//CustomImageView background;
	WallDesign walldesign;
	WallDesign Pattern;
	
	public DecorateWall(Group group, HBox buttonMenu) {
		this.backgroundGroup = new Group();
		
		try {
			Image image = new Image(new FileInputStream(Location.path + "background.png"));
	        this.backgroundImageView = new ImageView(image);
	        this.backgroundImageView.setX(0);
	        this.backgroundImageView.setY(0);
	        this.backgroundImageView.setPreserveRatio(true);
	        
			this.backgroundGroup.getChildren().add(this.backgroundImageView);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		this.group = group;
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
		        System.out.println("Polkadot");
     	        setWallpaper("Polkadot");
		    }
         }));
		
		MenuItem addclockButton = new MenuItem("Clock");
		addclockButton.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        System.out.println("Clock");
     	        setClock("Clock");
		    }
         }));
		
		MenuItem addFrameButton = new MenuItem("Frame");
		addFrameButton.setOnAction((new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent t) {
		        System.out.println("Frame");
//		        setFrame("Frame");
		    }
         }));
		
		MenuButton menuButton = new MenuButton("Decorate Wall", null, marbleButton, stripeButton, polkadotButton, addclockButton, addFrameButton);
        this.buttonMenu.getChildren().add(menuButton);
	}
	
	
	//Wallpaper w/o decorator
        public void setWallpaper(String menuType) {
        	this.backgroundGroup.getChildren().clear();
        	
    		if(menuType.equals("Marble")) {
    			this.walldesign = new Marble();
    		
    		}else if (menuType.equals("Stripe")) {
    			this.walldesign  = new Stripe();
    			
    		}else if (menuType.equals("Polkadot")) {
    			this.walldesign = new Polkadot();
			}
    		
    		this.backgroundImageView.setImage(this.walldesign.getImage());
			this.backgroundGroup.getChildren().add(this.backgroundImageView);
    		
    	}
        
        
        
//Wallpaper with decorator
        
      public void setClock(String pattern) {
        
    	  if(menuType.equals("Clock")) {
    		  this.walldesign = new Clock(this.walldesign);
    		  
        
//         if (menuType.equals("Marble"))
//    		  {
//	        	WallDesign walldesign1 = new Marble();
//	         	walldesign1 = new Clock(walldesign1);
////	        	System.out.println(walldesign1.getWallpaper() + walldesign1.getImageView());
//	           this.group.getChildren().add(clock.getImageView());
//	          
//	        }
//        
//          else if (menuType.equals("Stripe"))
//             {
//		       	Walldesign walldesign2 = new Stripe();
//		       	walldesign2 = new Clock(walldesign2);
////		       	System.out.println(walldesign2.getWallpaper() + walldesign2.getImageView());
//				this.group.getChildren().add(clock.getImageView());        
//       	    }
//         
//        
//        else if (menuType.equals("Polkadot"))
//        	{
//		        WallDesign walldesign3 = new Polkadot();
//	        	walldesign3 = new Clock(walldesign3);
////		      	System.out.println(walldesign3.getWallpaper() + walldesign3.getImageView());
//		        this.group.getChildren().add(clock.getImageView());
//       	    }
		  }
      }

			       
        	 
//	public void setFrame(String pattern) {
//        
//    	    if(menuType.equals("Frame")) 
//     {
//    		   
//    	    if (menuType.equals("Marble"))
//    	       	{
//			  	  WallDesign walldesign1 = new Marble();
//			  	  walldesign1 = new PictureFrame(walldesign1);
////			  	  System.out.println(walldesign1.getWallpaper() + walldesign1.getImageView());
//			  	  this.group.getChildren().add(frame.getImageView());
//  		     }
//    	    
//       	   else if (menuType.equals("Stripe"))
//       	     {
//		    	Walldesign walldesign2 = new Stripe();
//		   		walldesign2 = new PictureFrame(walldesign2);
////		  		System.out.println(walldesign2.getWallpaper() + walldesign2.getImageView());
//				this.group.getChildren().add(frame.getImageView());        
//    		}
//    
//    	 else if (menuType.equals("Polkadot"))
//    	  {
//  		      WallDesign walldesign3 = new Polkadot();
//  		      walldesign3 = new PictureFrame(walldesign3);
////   		      System.out.println(walldesign3.getWallpaper() + walldesign3.getImageView());
//     	     this.group.getChildren().add(frame.getImageView());
//   	     }
//     }
//             
//    	
//   }
//	
	public Group getGroup() {
		return this.backgroundGroup;
	}
}



