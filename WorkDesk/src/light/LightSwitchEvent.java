package light;

/**
 *
 * @author hanif
 */
public class LightSwitchEvent implements LightListener {
    
    Light light;
    
    public LightSwitchEvent(Light light){
        this.light = light;
    }
    
       
    @Override
    public void execute() {
        light.switchOn();
    }
    
}
