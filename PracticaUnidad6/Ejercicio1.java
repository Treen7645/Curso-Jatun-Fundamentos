
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author Victor Sejas
 * @version 1.0
 */
public class Ejercicio1
{
    public int contarDigitos(int numero){
    int res=0;
    while(numero>0){
    numero=numero/10;
    res++;
    }
    
    return res;
    }
}
