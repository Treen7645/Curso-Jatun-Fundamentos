
/**
 * Write a description of class CuandoLasEstrellasDejenDeBrillar here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class CuandoLasEstrellasDejenDeBrillar
{
    private int inicio;
    private int fin;
    private int[]arreglo;
    private final int ESTRELLAOFF=0; 

    public CuandoLasEstrellasDejenDeBrillar(int[]arr,int inicio,int fin)
    { 
        arreglo=arr;  
        this.inicio=inicio;
        this.fin=fin;
    }

    public String contadorEstrellasOff(){
        String res="Hay un parametro que no es valido";
        int cont=0;
        if(inicio>=0&&fin<=arreglo.length-1){
            for(int i=inicio;i<=fin-1;i++){
                if(arreglo[i]==0){
                    cont=cont+1;
                }
            }
            res="Hay "+ cont + " estrella(s) que han dejado de brillar";
        }
        return res;
    }

    public void setIncio(int i){
        inicio=i;
    }

    public void setFinal(int f){
        fin=f;
    }

}
