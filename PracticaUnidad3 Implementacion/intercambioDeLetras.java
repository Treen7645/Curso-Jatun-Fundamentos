/**
 * Write a description of class a here.
 * 
 * @author (Treen) 
 * @version (1.0)
 */
public class IntercambioDeLetras
{
    public String intercambio(int a,int b,int c){
        int ax=a, bx=b, cx=c;
        String res="";
        b=a;
        ax=bx;
        a=c;
        c=ax;
        res= a+" "+b+" "+c;
        return res;
    }
}