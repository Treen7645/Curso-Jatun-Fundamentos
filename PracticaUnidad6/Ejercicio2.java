
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio2
{
    public String verificadorNumeroPrimo( int numero  ){
        String res="";
        boolean bandera=true;
        for(int div=2;div<=numero/2&&bandera==true;div++){
            if(numero%div==0){ 
                res="Es un numero compuesto";
                bandera=false;
            }else{
                res="Es primo";
            }  
        }
        return res;
    }
}
