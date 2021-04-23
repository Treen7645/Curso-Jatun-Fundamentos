
/**
 * Write a description of class CajaMagica here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class CajaMagica
{
    private Suenio[]caja;
    private int posActual;

    public CajaMagica(int tam)
    {
        caja=new Suenio[tam];
        posActual=0;
    }

    public String guardarSuenio(Suenio nuevo){
        String res="No hay espacio";
        if(posActual<caja.length){
            caja[posActual]=nuevo;
            borrarEspacios();
            posActual=posActual+1;
            res="Guardado correctamente";
        }
        return res;
    }

    private void borrarEspacios(){
        for(int i=0;i<caja.length-2;i++){
            for(int pos=0;pos<caja.length-3;pos++){
                Suenio actual=caja[pos];
                Suenio vecino=caja[pos+1];
                Suenio vecino2=caja[pos+2];
                if(vecino==null&&vecino2!=null){
                    Suenio aux=vecino2.obtenerCopia();
                    caja[pos+1]=aux;
                    caja[pos+2]=null;
                }
            }
        }
    }
    
    public void ordenarPorDia(){
        borrarEspacios();
        for(int i=0; i<caja.length-1; i++){
            for(int pos = 0; pos<caja.length-1-i; pos++){
                Suenio actual = caja[pos];
                Suenio vecino = caja[pos+1];
                int PriosuenioActual = actual.getPrio();
                if(vecino!=null){
                    int PriosuenioVecino = vecino.getPrio();
                if(PriosuenioActual > PriosuenioVecino){
                    Suenio aux = actual.obtenerCopia();
                    caja[pos] = vecino.obtenerCopia();
                    caja[pos+1] = aux;
                }
              }
            }
        }
    }
   
    public String cumplirSueñoPorprioridad(){
        String res="Esa sueño no existe en la Caja";
        boolean b=false;
        int act=1;
        for(int i=0;i<caja.length&&b==false;i++){
            Suenio temp=caja[i];
            int prio=temp.getPrio();
            if(prio==act){
                Suenio aux=temp.obtenerCopia();
                String top=aux.getTop();
                String desc=aux.getDesc();
                res="Sueño "+top+" : "+ desc + " Cumplido";
                caja[i]=null;
                b=true;
                borrarEspacios();
                posActual=posActual-1;
            
            }else{
            act=act+1;
            }
        }
        return res;
    }
    
    public String cumplirSueñoAleatorio(String topic){
     String res="Ese topico no dirige aningun sueño";
        boolean b=false;
        for(int i=0;i<caja.length&&b==false;i++){
            Suenio temp=caja[i];
            String top=temp.getTop();
            if(top.equals(topic)){
                Suenio aux=temp.obtenerCopia();
                String topi=aux.getTop();
                String desc=aux.getDesc();
                res="Sueño "+topi+" : "+ desc + " Cumplido";
                caja[i]=null;
                b=true;
                borrarEspacios();
                posActual=posActual-1;
            }
        }
        return res;
    }
    
}
