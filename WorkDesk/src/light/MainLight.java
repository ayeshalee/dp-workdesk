package light;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import base.Location;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainLight {

	Group group;
	ImageView lightImageView;
	
	public MainLight(Group content) {
		this.group = content;
		
		Image image;
		try {
			image = new Image(new FileInputStream(Location.path + "lamp.png"));
			this.lightImageView = new ImageView(image);
	        this.lightImageView.setX(591.1);
	        this.lightImageView.setY(0);
	        this.lightImageView.setPreserveRatio(true);
	        
	        this.group.getChildren().add(this.lightImageView);
	        
	        Light light = new Light(this.lightImageView);
	        
			LightListener switchC = new LightSwitchEvent(light);
			LightListener colorC = new LightColorEvent(light);
			
			LightMenu menu = new LightMenu(switchC, colorC);
			
			//Setting action to the context menu item
			menu.item1.setOnAction((ActionEvent e) -> {
		       switchC.execute();
		       if(light.switchStatus == false){
		    	   menu.item1.setText("Switch On");
		       }else{
		    	   menu.item1.setText("Switch Off");
		       }
		       System.out.println("Light on " + light.switchStatus);   
			});
			
			//Setting action to the context menu item
			menu.item2.setOnAction((ActionEvent e) -> {
				if(light.switchStatus){
			      colorC.execute();
			      System.out.println("Color change " + light.colorStatus);
				}else {
					System.out.println("Switch is Off, On the switch first");
				}
			});
			
			//Setting context menu to the image view
			lightImageView.setOnContextMenuRequested(event -> {
			    menu.contextMenu.show(lightImageView, event.getSceneX(), event.getSceneY());
			 });                         
	        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
