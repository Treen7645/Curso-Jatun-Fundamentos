
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio12
{
   public int division(int dividendo,int divisor){
        int res=0;
        while(dividendo>=divisor){
        dividendo=dividendo-divisor;
        res++;
        
        }
        return res;
    }
}
