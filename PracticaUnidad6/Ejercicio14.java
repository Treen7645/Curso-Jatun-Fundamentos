
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio14
{
 public String sonOnoSonNovios(int num1,int num2){
   String res="No pasa nada";
        int r1=0,r2=0;
        for(int i=num1/2;i>=1;i--){
            if(num1%i==0){
                r1=r1+i;
            } 
        }
        for(int i=num2/2;i>=1;i--){
            if(num2%i==0){
                r2=r2+i;
            } 
        }
        if(r1-1==num2&&r2-1==num1)
            res="Son novios";
        return res;  
    
    }
}
