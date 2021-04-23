
/**
 * Write a description of class CajaDeMusica here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class CajaDeMusica
{
    private PiedraH[]cancion;
    private String estado;
    private int pos;

    public CajaDeMusica(int tam)
    {
        cancion=new PiedraH[tam];
        estado="en pausa";
        pos=0;
    }

    public String agregarCancion(String name,String autor){
        String res="";
        if(pos<cancion.length){
            PiedraH aux=new PiedraH(name,autor);
            cancion[pos]=aux;
            res="cancion Agregada correctamente";
            pos=pos+1;
            borrarEspacios();
        }
        return res;
    }

    public String agregarCan(PiedraH nueva){
        String res="No hay espacio disponible";
        if(pos<cancion.length){cancion[pos]=nueva;
            pos=pos+1;
            res="cancion Agregada correctamente ";
        }
        return res;
    }

    public String eliminarCancion(String nameCancion){
        String res="Esa cancion no existe en la caja";
        boolean b=false;
        for(int i=0;i<cancion.length&&!b;i++){
            PiedraH temp=cancion[i];
            String nomb=temp.getNombre();
            if(nomb.equals(nameCancion)){
                cancion[i]=null;
                b=true;
                borrarEspacios();
                pos=pos-1;
                res="cancion eliminada";
            }
        }
        return res;
    }

    public void escucharCancion(){
        estado="resproduciendo";
    }

    public void ordenarPorName(){
        borrarEspacios();
        for(int i=0; i<cancion.length-1; i++){
            for(int pos = 0; pos<cancion.length-1-i; pos++){
                PiedraH actual = cancion[pos];
                PiedraH vecino = cancion[pos+1];
                int nombreCanActual = actual.lic();
                if(vecino!=null){
                    int nombreCanVecino = vecino.lic();
                    if(nombreCanActual > nombreCanVecino){
                        PiedraH aux = actual.obtenerCopia();
                        cancion[pos] = vecino.obtenerCopia();
                        cancion[pos+1] = aux;
                    }
                }
            }
        }

    }

    public void ordenarPorAutor(){
        borrarEspacios();
        for(int i=0; i<cancion.length-1; i++){
            for(int pos = 0; pos<cancion.length-1-i; pos++){
                PiedraH actual = cancion[pos];
                PiedraH vecino = cancion[pos+1];
                int autorCanActual = actual.lia();
                if(vecino!=null){
                    int autorCanVecino = vecino.lia();
                    if(autorCanActual > autorCanVecino){
                        PiedraH aux = actual.obtenerCopia();
                        cancion[pos] = vecino.obtenerCopia();
                        cancion[pos+1] = aux;
                    }
                }
            }
        }
    }

    private void borrarEspacios(){
        for(int i=0;i<cancion.length-2;i++){
            for(int pos=0;pos<cancion.length-3;pos++){
                PiedraH actual=cancion[pos];
                PiedraH vecino=cancion[pos+1];
                PiedraH vecino2=cancion[pos+2];
                if(vecino==null&&vecino2!=null){
                    PiedraH aux=vecino2.obtenerCopia();
                    cancion[pos+1]=aux;
                    cancion[pos+2]=null;
                }
            }
        }
    }
}
