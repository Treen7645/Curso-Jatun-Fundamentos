
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio7
{
    public String buscadorNarcicista(int numero){
        String res="Normal";
        int p=0,pot;
        int suma=0;
        int aux=numero,aux2=aux;
        while(aux>0){
            aux=aux/10;
            p++;
        }
        for(int i=0;i<p;i++){
            int mod=aux2%10;
            aux2=aux2/10;
            suma=suma+(int)Math.pow(mod,p);
        }
        if(suma==numero){
        res="Narcicista";
        }
        return res;
    }
}
