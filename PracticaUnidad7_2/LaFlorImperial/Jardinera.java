
/**
 * Write a description of class FlorImperial here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class Jardinera
{

    private FlorImperial[]jardin;

    public Jardinera(int tam)
    {
        jardin=new FlorImperial[tam];

    }
    public void agregarFlor(int pos,FlorImperial aux){
     if(buscarVacio(pos)){
       jardin[pos]=aux;
        }
    }
    public String hacerCrecerFlor(int pos){
        boolean b=false;
        String res="La flor ha alcanzado su tamaño maximo";
        for(int i=0;i<jardin.length&&!b;i++){
            FlorImperial aux= jardin[i];
            if(i==pos&&buscarFlor(i)){    
                int tam=aux.getTam();
                aux.crecerFlor();
                b=true;
                res="La flor crecio";
            }else{
                res="No hay flor en esa posicion";
            }
        }
        return res;
    }

    private boolean buscarFlor(int posicion){
        boolean s=false;
        for(int i=0;i<jardin.length;i++){
            if(jardin[i]!=null){
                s=true;
            }
        }
        return s;
    }

    private boolean buscarVacio(int pos){
        boolean q=false;
        for(int i=0;i<jardin.length;i++){
            if(jardin[i]==null){
                q=true;
            }
        }
        return q;
    }
}
