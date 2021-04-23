
/**
 * Write a description of class Taberna here.
 * 
 * @author Victor Sejas
 * @version 1.0
 */
public class Taberna
{
    private Dream[]memoria;
    private int posLibre;
    private int posBuscada;

    public Taberna(int tam)
    {
        memoria    = new Dream[tam];
        posLibre   = 0;
        posBuscada = 0;
    }

    public String almacenarDream(Dream nuevo){
        String res="";
        if(posLibre < memoria.length&&buscarPosLibre()){
            memoria[posLibre] = nuevo;
            //posLibre++;
            buscarPosLibre();
            res="Se guardo el elemnto correctamente";
        }else{
            res="No se puede guardar el elemento, no hay espacio disponible";
        }
        return res;
    }

    private boolean buscarPosLibre(){
        boolean b=false;
        for(int i=0;i < memoria.length&&!b;i++){
            if(memoria[i]==null){
                b=true;
                int pos=i;
                posLibre=pos;
            }

        }
        return b;
    }

    public String generarReporte(){
        String res="";
        for(int pos=0;pos<memoria.length;pos++){
            Dream aux=memoria[pos];
            if(aux!=null){
                String nombre=aux.getNombre();
                String desc  =aux.getDescripcion();
                res=res+nombre+" "+ desc+"\n";
            }
        }
        return res;
    }
    
    public String eliminarDream(String dreamAborrar){
       String res="";
       if(existeEsteSueño(dreamAborrar)){
         memoria[posBuscada]=null;
         res="borrado con exito de la posicion; "+posBuscada ;
         buscarPosLibre();
        }else{
        res="el sueño que deseas borra no existe";
        }
    return res;
    
    }
    
    public boolean existeEsteSueño(String d){
       boolean res=false;;
        for(int pos=0;pos<memoria.length&&!res;pos++){
            Dream aux=memoria[pos];
            if(aux!=null){
                String nombre=aux.getNombre();
                if(nombre.equals(d)){
                    res=true;
                    posBuscada=pos;
                }
            }
        }
        return res;
    }
}
