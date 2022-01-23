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
		
		Light light = new Light();
		
		Image image;
		try {
			image = new Image(new FileInputStream(Location.path + "light-1.png"));
			this.lightImageView = new ImageView(image);
	        this.lightImageView.setX(500);
	        this.lightImageView.setY(0);
	        this.lightImageView.setPreserveRatio(true);
	        
	        this.group.getChildren().add(this.lightImageView); 
	        
	        this.lightImageView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	               @Override
	               public void handle(MouseEvent event) {
                       LightListener switchC = new LightSwitchEvent(light);
                       LightListener colorC = new LightColorEvent(light);
                       LightMenu menu = new LightMenu(switchC,colorC);
                        //Setting action to the context menu item
                        menu.item1.setOnAction((ActionEvent e) -> {
                           try {
                               switchC.execute();
                               if(light.switchStatus==false){
                            	   lightImageView.setImage(new Image(new FileInputStream(Location.path + "light-2.png")));   
                               }
                               else{
                            	   lightImageView.setImage(new Image(new FileInputStream(Location.path + "light-1.png")));                                             
                               }
                               System.out.println("Light on " + light.switchStatus);   
                               event.consume();
                           } catch (FileNotFoundException ex) {
                               ex.printStackTrace();
                           }
                        });
                        //Setting action to the context menu item
                        menu.item2.setOnAction((ActionEvent e) -> {
                              colorC.execute();
                              if(light.colorStatus.equals("blue")){
                                  try {   
                                	  lightImageView.setImage(new Image(new FileInputStream(Location.path + "light-3.png")));
                                  } catch (FileNotFoundException ex) {
                                      ex.printStackTrace();
                                  }
                              }
                              else{
                                  try {                                             
                                	  lightImageView.setImage(new Image(new FileInputStream(Location.path + "light-4.png")));
                                  } catch (FileNotFoundException ex) {
                                      ex.printStackTrace();
                                  }
                              }
                              System.out.println("Color change "+light.colorStatus);
                              event.consume();
                        });
                        
                        //Setting context menu to the image view
                        lightImageView.setOnContextMenuRequested(new EventHandler<Event>() {
                            @Override
                            public void handle(Event t) {
                                menu.contextMenu.show(lightImageView, event.getSceneX(), event.getSceneY());                    
                            }
                         });                         
	                   
	                   
//	                   if(imageView.getId().indexOf("desk")>-1){
//	                        System.out.println("Desk Lamp on ");
//	                        event.consume();
//	                   } 
	              }
	        });
	        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
