
/**
 * Write a description of class FlorImperial here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class FlorImperial
{
    private int tam;

    public FlorImperial(int tam)
    {
        this.tam=tam;
    }

    public void crecerFlor(){
        if(tam<=99999999){
            tam=tam*2;
        }
        
    }
    
    public int getTam(){
     return tam;
    }
}
