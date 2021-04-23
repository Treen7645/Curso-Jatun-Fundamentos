
/**
 * Write a description of class Dream here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class Dream
{
   private String nombre;
   private String descripcion;
   
    public Dream(String name,String desc)
    {
       nombre=name;
       descripcion=desc;
    }

    public String getNombre(){
    return nombre;
    }
    
    public String getDescripcion(){
    return descripcion;
    }
}
