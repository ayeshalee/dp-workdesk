package light;

/**
 *
 * @author hanif
 */
public class LightColorEvent implements LightListener {
    
    Light light;
    
    public LightColorEvent(Light light){
        this.light=light;
    }
    
    
    @Override
    public void execute() {
        light.changeColor();
    }
    
}
