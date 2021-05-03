
/**
 * Write a description of class Contacto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contacto
{
    private String nombre;
    private int edad;
    private int celular;

    public Contacto(String nombre, int edad, int celular){
        this.nombre=nombre;
        this.edad=edad;
        this.celular=celular;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void setEdad(int nuevaEdad){
        edad   = nuevaEdad;
    }

    public void setNumero(int nuevoNumero){
        celular = nuevoNumero;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumero(){
        return celular;
    }

    public int getEdad(){
        return edad;
    }

}
