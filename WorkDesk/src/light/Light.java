package light;

/**
 *
 * @author hanif
 */
public class Light {
	
    public boolean switchStatus=false;
    public String colorStatus="blue";

    
    public boolean switchOn(){
        if(switchStatus==false)switchStatus=true;
        else switchStatus=false;
        return switchStatus;
    }
    
    public String changeColor(){
        if(colorStatus.equals("blue"))colorStatus="red";
        else colorStatus="blue";
        return colorStatus;
    }
    
}
