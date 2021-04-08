/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Ejercicio11
{
    public int producto(int multiplicando,int multiplicador){
        int res=0;
        if(multiplicando>0||multiplicador>0){
            for(int i=0;i<multiplicador;i++){
                res=res+multiplicando;
            }
        }
        return res;
    }

}
