
/**
 * Write a description of class Capicua here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 * 
 */
public class Ejercicio3
{
    public String verificadorEstadoDiaDariel(int dia){
        String res="Dia Normal";
        int mod=dia%3;
        if(mod==0)
            res="Cruz Dariel(Modo sad)";
        return res;
    }

}
