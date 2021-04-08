
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio6
{
    public String evaluarNumeroPerfectoOabundante(int numero){
        String res="Numero perfecto";
        int r=0;
        for(int i=numero/2;i>=1;i--){
            if(numero%i==0){
                r=r+i;
            } 
        }
        if(r>numero){
            res="Numero Abundante";
        }
        if(r<numero){
            res="Numero Defectivo";
        }
        return res;
    }
}
