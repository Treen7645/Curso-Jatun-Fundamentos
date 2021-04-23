
/**
 * Write a description of class PiedraHelitz here.
 * 
 * @author Victor Sejas-Treem
 * @version 1.0
 */
public class PiedraH
{
    private String nombreCancion;
    private String autorCancion;

    public PiedraH(String nombre,String autor)
    {
        nombreCancion=nombre;
        autorCancion=autor;
    }

    public String getNombre(){
        return nombreCancion;
    }

    public String getAutor(){
        return autorCancion;
    }

    public int lic(){
        int res=nombreCancion.charAt(0);
        return res;
    }

    public int lia(){
        int res=autorCancion.charAt(0);
        return res;
    }

    public PiedraH obtenerCopia(){
        String valNombre=getNombre();
        String valAutor=getAutor();
        PiedraH copia=new PiedraH(valNombre,valAutor);
        return copia;

    }
}
