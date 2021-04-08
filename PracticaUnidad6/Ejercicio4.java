
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio4
{
    public int factorialDeUnNumero(int numero){
        int res=1;
        if(numero!=0)
            for(int i=numero;i>=1;i--){
                res=i*res;
            } 
        return res; 
    }
}
