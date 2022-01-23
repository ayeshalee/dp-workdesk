package light;

import javafx.event.ActionEvent;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

/**
 *
 * @author hanif
 */
public class LightMenu {
    
    private LightListener switchCommand;
    private LightListener colorCommand;
    //Creating a context menu
    public ContextMenu contextMenu = new ContextMenu();
    //Creating the menu Items for the context menu
    public MenuItem item1 = new MenuItem("Switch On");
    public MenuItem item2 = new MenuItem("Change Color");
    public LightMenu(LightListener switchCom, LightListener colorCom ){       
        contextMenu.getItems().addAll(item1, item2);             
    }
    
    public void toggleSwitch(){
        switchCommand.execute();
    }
    
    public void toggleColor(){
        colorCommand.execute();
    }
    
    
}
