
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio9
{
    public int convertirAbinario(int numero){
        int res=0;int c=0;

        while(numero!=0){
            res=(numero%2*(int)Math.pow(10,c))+res;
            numero=numero/2;c++;
        }
        return res;
    }
}
