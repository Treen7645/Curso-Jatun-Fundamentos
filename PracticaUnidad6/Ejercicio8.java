
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio8
{
    public int cambiarPreferencias(int numero){
        int res=0;
        int sum=(numero%10)*10;
        while(numero>10){
            numero=numero/10;
        }
        res=numero+sum;
        return res;
    }
}
