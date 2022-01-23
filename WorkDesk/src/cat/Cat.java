package cat;

import base.CustomImageView;
import base.Location;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 *
 * @author Faiz
 */

interface CatBehaviour
{
    public void move(String name, ImageView catImageView);
}

class Sleep implements CatBehaviour
{
    String catGIF;
    
    public Sleep(){
    }
    
    @Override
    public void move(String catType, ImageView catImageView)
    {
    	this.catGIF = catType + "_sleep.gif";
        System.out.println("I am sleeping meow.");
        System.out.println("Setting " + catGIF + " screen");
        try {
        	CustomImageView catView = new CustomImageView(492.3, 530, catGIF);
            catImageView.setImage(catView.getImageView().getImage());
        } catch (FileNotFoundException ex) {
            
        }
    }
}

class Eat implements CatBehaviour
{
    String catGIF;
    
    public Eat(){
    }
    
    @Override
    public void move(String catType, ImageView catImageView)
    {
    	this.catGIF = catType + "_eat.gif";
        System.out.println("I am sleeping meow.");
        System.out.println("Setting " + catGIF + " screen");
        try {
        	CustomImageView catView = new CustomImageView(492.3, 500, catGIF);
	        catImageView.setImage(catView.getImageView().getImage());
	    } catch (FileNotFoundException ex) {
	        
	    }
        
    }
    
}

class Lick implements CatBehaviour
{
    String catGIF;
    
    public Lick(){
    }
    
    @Override
    public void move(String catType, ImageView catImageView)
    {
    	System.out.println("I am Licking now");
        this.catGIF = catType + "_lick.gif";
        System.out.println("Setting " + catGIF + " screen");
        try {
        	CustomImageView catView = new CustomImageView(492.3, 530, this.catGIF);
            catImageView.setImage(catView.getImageView().getImage());
        } catch (FileNotFoundException ex) {
            
        }
    }
        
}

abstract class Cat {

    Group group;
    HBox buttonMenu;
    String path = Location.path;
    String menuType = "Default";
    CatBehaviour moveBev;
    String name;
    ImageView catImageView;
    
    public final void setCatBehaviour(CatBehaviour ma) 
    //if do not put final, will get warning "overidable method calls in constructors"
    {
        moveBev = ma;
    }

    public void performMove() {
        moveBev.move(this.name, this.catImageView);
    }

}

class blackCat extends Cat
{
    
    public blackCat(ImageView imageView)
    {
    	this.catImageView = imageView;
    	this.name = "black";
    }
    
    
}

class orangeCat extends Cat
{
    
    public orangeCat(ImageView imageView)
    {
    	this.catImageView = imageView;
    	this.name = "orange";
    }
}

class whiteCat extends Cat
{
    
    whiteCat(ImageView imageView)
    {
    	this.catImageView = imageView;
    	this.name = "white";
    }
}

