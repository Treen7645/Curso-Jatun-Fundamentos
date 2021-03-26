/**
 * Write a description of class a here.
 * 
 * @author (Treen) 
 * @version (1.0)
 */
public class hojasUnicornioR
{
    public int numHojas(int pag)//N ≥ 1
    {
        int r=pag%2;    
        int num=pag/2+r;
        return num;
    }
}