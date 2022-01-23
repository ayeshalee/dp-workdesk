package light;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import base.Location;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author hanif
 */
public class Light {
	
    public boolean switchStatus=false;
    public String colorStatus="blue";
    ImageView lightImageView;
    
    public Light(ImageView lightImageView) {
    	this.lightImageView= lightImageView; 
    }
    
    public boolean switchOn(){
        if(switchStatus == false) {
        	try {
				lightImageView.setImage(new Image(new FileInputStream(Location.path + "light3.png")));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
        	lightImageView.setX(370.6);
        	switchStatus=true;
        }
        else {
        	try {
				lightImageView.setImage(new Image(new FileInputStream(Location.path + "lamp.png")));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}       
        	lightImageView.setX(591.1);
        	switchStatus=false;
        }
        return switchStatus;
    }
    
    public String changeColor(){
    	if(colorStatus.equals("blue")){
	          try {   
	        	  lightImageView.setImage(new Image(new FileInputStream(Location.path + "light2.png")));
	        	  lightImageView.setX(370.6);
	          } catch (FileNotFoundException ex) {
	              ex.printStackTrace();
	          }
	          colorStatus="yellow";
	      }
	      else{
	          try {                                             
	        	  lightImageView.setImage(new Image(new FileInputStream(Location.path + "light.png")));
	        	  lightImageView.setX(370.6);
	          } catch (FileNotFoundException ex) {
	              ex.printStackTrace();
	          }
	          colorStatus="blue";
	      }
        return colorStatus;
    }
    
}
