
/**
 * 
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class RitmoCornio
{
    private String estado;
    private String cancionAct;
    private String cancion1;
    private String cancion2;
    private String cancion3;

    public RitmoCornio(String c1,String c2,String c3){
        estado="en pausa";
        cancionAct="";
        cancion1=c1;
        cancion2=c2;
        cancion3=c3;
    }

    public String reproducir(){
        String res="Ya esta sonando una cancion";
        if(cancionAct.equals(""))
            cancionAct=cancion1;
        if(estado.equals("en pausa")){
            estado="reproduciendo cancion";
            res="La Cancion se ha empezado a reproducir";

        }
        return res;
    }

    public String pausar(){
        String res="La cancion esta en pausa";
        if(estado.equals("reproduciendo cancion")){
            estado="en pausa";
            res="la cancion ha sido pausada";
        }
        return res;
    }

    public void cambiar(){
        String c1=cancion1;
        String c2=cancion2;
        String c3=cancion3;

        if(cancionAct.equals(c1)){
            cancionAct=c2;
        }else{
            if(cancionAct.equals(c2)){
                cancionAct=c3;
            }else{
                if(cancionAct.equals(c3)){
                    cancionAct=c1;
                }
            }
        }
    }

    public String getCancion(){
        return cancionAct;
    }
}
