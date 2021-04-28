
/**
 * Write a description of class ZenithYNadir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZenithYNadir
{
    private String frase;
    
    public ZenithYNadir(String frase)
    {
       this.frase=frase;
    }

   
    public String invertir(String fras)
    {  
        String res="";
        for(int i=0;i<fras.length();i++){
           res=fras.charAt(i)+res;
        }
        return res;
    }
}
