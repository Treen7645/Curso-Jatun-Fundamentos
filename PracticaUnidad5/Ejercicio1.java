
/**
 * Write a description of class Capicua here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 * 
 */
public class Ejercicio1
{
    public String verificarCapicua(int numero){
        String res="";
        int pDig=numero/100;
        int uDig=numero%100;
        if(pDig==uDig){
            res="Si";
        }else{
            res="No";
        }
        return res;
    }  
}
