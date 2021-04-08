
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio5
{
    public int contarAcarreros(int n1,int n2){
        int res=0;
        int suma;
        int aca=0;
        while(n1>0||n2>0){
            suma=n1%10+n2%10+aca;//agregar el acarreo
            n1=n1/10+aca;
            n2=n2/10;
            if(suma>=10){
                res=res+1;
                aca=1;
            }
            else
            aca=0;
        }
        return res;
    }
}
 