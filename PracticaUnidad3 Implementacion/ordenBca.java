/**
 * Write a description of class a here.
 * 
 * @author (Treen) 
 * @version (1.0)
 */
public class ordenBca
{
    public int ordenador(int a,int b,int c)//1 ≤ a, b, c ≤ 9
    {
        c=c*10;
        b=b*100;
        int res=a+b+c;
        return res;
    }
}