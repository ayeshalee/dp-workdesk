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
import javafx.scene.layout.HBox;

/**
 *
 * @author User
 */

interface CatBehaviour
{
    public void move();
}

class Sleep implements CatBehaviour
{
    Group catGroup;
    String catGIF;
    CustomImageView catView;
    
    public Sleep(Group group, String catType){
        this.catGroup = group;
        this.catGIF = catType + "_sleep.gif";
    }
    
    @Override
        public void move()
        {
            System.out.println("I am sleeping meow.");
            System.out.println("Setting " + catGIF + " screen");
            this.setGroup(catGIF);
        }
        
        public void setGroup(String catGIF) {
        try {
            this.catView = new CustomImageView(492.3, 530, catGIF);
            this.catGroup.getChildren().add(this.catView.getImageView());
        } catch (FileNotFoundException ex) {
            
        }
    }
}

class Eat implements CatBehaviour
{
    Group catGroup;
    String catGIF;
    CustomImageView catView;
    
    public Eat(Group group, String catType){
        this.catGroup = group;
        this.catGIF = catType + "_eat.gif";
        
    }
    
    @Override
        public void move()
        {
            System.out.println("I am sleeping meow.");
            System.out.println("Setting " + catGIF + " screen");
            this.setGroup(catGIF);
        }
        
        public void setGroup(String catGIF) {
        try {
            this.catView = new CustomImageView(492.3, 500, catGIF);
            this.catGroup.getChildren().add(this.catView.getImageView());
        } catch (FileNotFoundException ex) {
            
        }
    }
}

class Lick implements CatBehaviour
{
    Group catGroup;
    String catGIF;
    CustomImageView catView;
    
    public Lick(Group group, String catType){
        this.catGroup = group;
        this.catGIF = catType + "_lick.gif";
        
    }
    
    @Override
        public void move()
        {
            System.out.println("I am sleeping meow.");
            System.out.println("Setting " + catGIF + " screen");
            this.setGroup(catGIF);
        }
        
        public void setGroup(String catGIF) {
        try {
            this.catView = new CustomImageView(492.3, 530, catGIF);
            this.catGroup.getChildren().add(this.catView.getImageView());
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
    
    public final void setCatBehaviour(CatBehaviour ma) 
    //if do not put final, will get warning "overidable method calls in constructors"
    {
        moveBev = ma;
    }

    public void performMove() {
        moveBev.move();
    }

}

class blackCat extends Cat
{
    Group catGroup;
    
    public blackCat(Group group)
    {
        this.catGroup = group;
        setCatBehaviour(new Sleep(this.catGroup, "black"));
    }
    
    
}

class orangeCat extends Cat
{
    Group catGroup;
    
    public orangeCat()
    {
        setCatBehaviour(new Eat(this.catGroup, "orange"));
    }
}

class whiteCat extends Cat
{
    Group catGroup;
    
    whiteCat()
    {
        setCatBehaviour(new Lick(this.catGroup, "white"));
    }
}

//class CatMain {
//
//    public static void main(String[] args) {
//        Cat vArray[] = new Cat[3];
//        vArray[0] = new blackCat();
//        vArray[1] = new orangeCat();
//        vArray[2] = new whiteCat();
//        
//        Scanner scanner = new Scanner (System.in);
//        int option;
//        int optionDriveOrFly;
//        
//        while (true){
//            
//            System.out.println("Type 1 for Black Cat, 2 for Orange Cat, 3 for White Cat, 4 to exit: ");
//            if (scanner.hasNextInt()){
//                option = scanner.nextInt();
//                if (option > 0 && option < 4){
//                    
//                    displayAndMove(vArray[option-1]);
//                    
//                    while(true){
//                        System.out.println("    Type 1 if you want me to Sleep ZZZZ, 2 to Eat *burp*, 3 to lick *PuuRRRrr*, 4 to exit choosing my behaviour: ");
//                        if(scanner.hasNextInt()){
//                            
//                            optionDriveOrFly = scanner.nextInt();
//                            if (optionDriveOrFly==1){
//                                vArray[option-1].setCatBehaviour(new Sleep());
//                                displayAndMove(vArray[option-1]);
//                            }
//                            else if(optionDriveOrFly==2){
//                                vArray[option-1].setCatBehaviour(new Eat());
//                                displayAndMove(vArray[option-1]);
//                            }
//                            else if(optionDriveOrFly==3){
//                                vArray[option-1].setCatBehaviour(new Lick());
//                                displayAndMove(vArray[option-1]);
//                            }
//                            else if(optionDriveOrFly==4)
//                                break;
//                            else{
//                                    System.out.println("Invalid choice of cat behaviour. Try again");
//                            }
//                        }
//                        
//                    else if(scanner.hasNext()){
//                            scanner.next();
//                            System.out.println("Please enter an integer");
//                    }       
//                    }}
//                    else if (option ==4)
//                        break;
//                    else
//                        System.out.println("This type of cat does not exist. Try again");
//                }
//                else if(scanner.hasNext()){
//                    scanner.next();
//                    System.out.println("Please enter an integer");
//                }
//        }
//    }
//    static void displayAndMove(Cat v)
//    {
//            System.out.println("I am a "+ v.getClass().getName()+". ");
//            v.performMove();
//    }

//    public Cat(Group content, HBox buttonMenu) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//}
