
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio3
{
    public int invertirNumero(int numero){
        int res=0;
        while(numero>0){
            res=numero%10+(res*10);
            numero=numero/10;
        }
        return res;
    }
}
