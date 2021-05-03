import java.util.ArrayList;
/**
 * Write a description of class Persona here.
 * 
 * @author Victor Sejas-Treen
 * @version 2.0
 */
public class Persona
{
    private String nombre;
    private int edad;
    private int celular;
    private ArrayList<Contacto>lista;
    private ArrayList<Mensaje>bandejaRecibidos;
    private ArrayList<Mensaje>bandejaEnviados;

    public Persona(String nombre, int edad,int celular)
    {
        this.edad    = edad;
        this.celular = celular;
        this.nombre  = nombre;
        lista            = new ArrayList<>();
        bandejaRecibidos = new ArrayList<>();
        bandejaEnviados  = new ArrayList<>();

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

    public void nuevoContacto(int n, int e, String name){
        Contacto nuevo= new Contacto(name,e,n);
        lista.add(nuevo);
    }

    public void mensajeNuevo(int num,int ed, String desc){
        Mensaje nuevo= new Mensaje(num, ed,desc);
        bandejaEnviados.add(nuevo);
    }

    public Contacto buscadorContactoPorNumero(int numero){
        boolean b=false;
        Contacto nuevo=null;
        for(int i=0;i<lista.size();i++){
            Contacto temp=lista.get(i);
            int n=temp.getNumero();
            if(n==numero){
                nuevo=temp;
                b=true;
            } 
        }
        return nuevo;
    }

    public Contacto buscadorContactoPorNombre(String name){
        boolean b=false;
        Contacto nuevo=null;
        for(int i=0;i<lista.size();i++){
            Contacto temp=lista.get(i);
            String n=temp.getNombre();
            if(n.equals(name)){
                nuevo=temp;
                b=true;
            } 
        }
        return nuevo;
    }

    public String revisarMensajesRecibidos(){
        String estat="leido";
        for(Mensaje e:bandejaRecibidos){
            e.setEstado(estat);
        }
        return "mensajes leidos";
    }
    
    public void revisarMensajesEnviados(){
    for(Mensaje e:bandejaEnviados){
       System.out.println(e.getEstado());
    }
    }
}
