
/**
 * Write a description of class ElLegadoDeLosAncestros here.
 * 
 * @author Victor Sejas
 * @version 1.0
 */
public class ElLegadoDeLosAncestros
{
    public String comparar(String palabra,String prefijo)
    {   String res="El nombre de "+palabra+" no tiene el prefijo "+prefijo;
        if(palabra.contains(prefijo)){
            res="El nombre de "+palabra+" no tiene el prefijo "+prefijo;
        }
        return res;
    }
}
