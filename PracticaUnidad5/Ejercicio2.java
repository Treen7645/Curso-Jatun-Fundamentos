
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class Ejercicio2
{
    public int calcularMenorCosto(int a,int b,int c){
        int res=0;
        int c1=a+b;
        int c2=b+c;
        int c3=a+c;
        if(c1>c2){
            if(c2>c3){
                res=c3;
            }
            res=c2;
        }else{           
            res=c1;
        }
        return res;
    }
}
