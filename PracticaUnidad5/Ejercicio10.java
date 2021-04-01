
/**
 * Write a description of class Ejercicio10 here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class Ejercicio10
{
   public String verificarNumeroEnCrecimiento(int num){
    String res="No es un numero es crecimiento";
    int mod1=num%10;
    num=num/10;
    int mod2=num%10;
    num=num/10;
    if(mod1>=mod2){
        if(mod2>=num){
        res="Es numero en crecimiento";
        }
    }
    return res;
    } 
    
}
