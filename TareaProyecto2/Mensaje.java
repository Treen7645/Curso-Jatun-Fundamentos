
/**
 * Write a description of class Mensaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mensaje 
{
    //private Persona destinatario;
    private int numeroDest;
    //private Persona remitente;
    private int numeroRemit;
    private String estado;
    private String contenido;
    
    public Mensaje(int numeroDestino,int numRemit, String des)
    {   
       //destinatario=nuevo(numeroDestino);
       //numeroDest=destinatario.getNumero();
      // remitente=nuevo(numRemit);
       //numeroRemit=remitente.getNumero();
       numeroRemit=numRemit;
       numeroDest=numeroDestino;
       estado="enviado";
       contenido=des;
    }
    
    public String getEstado(){
    return estado;
    }
    
    public void setEstado(String esta){
    estado=esta;
    }
    
   // private Contacto nuevo(int numero){
    //Contacto temp= buscadorContactoPorNumero(numero);
    //return temp;
   // }
}
