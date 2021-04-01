
/**
 * Write a description of class Ejercicio9 here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class Ejercicio9
{
    public String verificadorAñoBisiesto(int año){
        String res="No es bisiesto";
        int mod=año%4;
        if(año%100!=0||año%400==0){
            if(mod==0){
             res="Es bisiesto";
            }  
        }

        return res;
    }
}

