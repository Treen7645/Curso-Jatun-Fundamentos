
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio10
{
    public String verificarNumOdiodoOmalvado(int numero){
        String respuesta="Odioso";
        int res=0;
        int c=0;
        int cont=0;
        while(numero!=0){
            res=(numero%2*(int)Math.pow(10,c))+res;
            if(numero%2==1)
                cont++;
            numero=numero/2;
            c++;
        }
        if(cont%2==0)
            respuesta="Malvado";
        return respuesta;
    }
}
