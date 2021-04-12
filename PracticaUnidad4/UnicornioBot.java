/**
 *
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */

public class UnicornioBot{
    private String nombreUsuario;

    public UnicornioBot(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    public String saludar(){
        return "Hola "+nombreUsuario;
    }

    public void setNombreUsuario(String valor){
        nombreUsuario = valor;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }
}