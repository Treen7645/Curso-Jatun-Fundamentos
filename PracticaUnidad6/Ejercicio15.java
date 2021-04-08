
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio15
{
    public String numeroUnicornio(int numero){
        String res="Numero normal";
        int c=0;
        int re;
        int mod=0;
        while(numero>0){
            numero=numero/10;
            c++;
        }
        if(c%2==0){
            for(int i=c;i>=1;i--){
                re=numero/10;
                if(i==c/2){
                    mod=mod+numero%(int)Math.pow(10,c-1)+numero%(int)Math.pow(10,c);
                }else{
                    mod=mod+numero%(int)Math.pow(10,c-1);
                }
            }
        }
        if(mod%3==0){
            res="Numero Unicornio";
        }
        return res; 
    }
}
