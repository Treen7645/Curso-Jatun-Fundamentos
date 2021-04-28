
/**
 * Write a description of class LosFragmentosDeDhilva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LosFragmentosDeDhilva
{

    public String sampleMethod(String p1,String p2)
    {
        String res;  
        int num=p1.compareTo(p2);
        int num2=p2.compareTo(p1);
        int mayor;
        int menor;
        if(num==num2){
            res="Las palabras son lexicográficamente iguales";
        }else{
            if(num>num2){
                mayor=num;
                menor=num2;
            }else{
                mayor=num2;
                menor=num;
            }
            res="La palabra Aracne es menor lexicográficamente que Arcángel";
        }
        return res;
    }
}
