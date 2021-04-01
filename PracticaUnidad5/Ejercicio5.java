
/**
 * Write a description of class Capicua here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 * 
 */
public class Ejercicio5
{
    public String verfificadorNumeroPariente(int a,int b){
        String res="no son parientes";   
        boolean e=false;
        int mod;
        if(a>b){
            e=true;
        }   
        if(e){
            mod=a%b; 
        }else{
            mod=b%a;
        }
        if(mod==0){
            res="son parientes";
        }
        return res;
    }
}
