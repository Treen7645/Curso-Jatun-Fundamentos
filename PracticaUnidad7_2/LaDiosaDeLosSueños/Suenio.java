
/**
 * Write a description of class Sueño here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class Suenio
{
    private int prioridad;
    private String topico;
    private String descripcion;

    public Suenio(int prio,String top,String desc)
    {
        prioridad=prio;
        topico=top;
        descripcion=desc;
    }

    public int getPrio(){
        return prioridad;
    }

    public String getTop(){
        return topico;
    }     

    public String getDesc(){
        return descripcion;
    }  
    
    public Suenio obtenerCopia(){
        int valPrio=getPrio();
        String valTop=getTop();
        String valDesc=getDesc();
        Suenio copia=new Suenio(valPrio,valTop,valDesc);
        return copia;

    }

}
