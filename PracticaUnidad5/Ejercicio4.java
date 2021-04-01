
/**
 * Write a description of class Capicua here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 * 
 */
public class Ejercicio4

{
    public String verificarEstadoSemaforo(String color, int cambios){
        String res="";
        cambios=cambios%3;
        int estado=0;
        if(color.equals("verde"))
            estado=0;
        if(color.equals("amarillo"))
            estado=1;
        if(color.equals( "rojo"))
            estado=2;
        int estadoFinal=(estado+cambios)%3;
        if(estadoFinal==0)
            res="verde";
        if(estadoFinal==1)
            res="amarillo";
        else
            res="rojo";
        return res;
    }
}
