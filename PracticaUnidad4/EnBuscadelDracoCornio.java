
/**
 * Write a description of class EnBuscadeelDracoCornio here.
 * 
 * @author Victor Sejas-treen 
 * @version 1.0
 */
public class EnBuscadelDracoCornio
{
    private int x;
    private int y;
    private int intentos;
    private boolean ganador;
    public EnBuscadelDracoCornio()
    { 
        x=generarAleatorio();
        y=generarAleatorio();
        intentos=3;
        ganador=false;
    }

    private int generarAleatorio(){
        int numero=(int)(Math.random()*10+1);
        return numero;
    } 

    public String jugar(int ax,int ay){
        String res="Lo siento perdiste me saludas a Megalodon";
        if(intentos>0&&!ganador){   
            res=distante(ax,ay);
            intentos=intentos-1;
        }else{
            if(ganador){
                res="Ya no hay tesoro,reinicia el Juego";
            } 
        }
        return res;    
    }

    private String distante(int bx,int by){
        String r="";
        String rx="esta lejos";
        String ry="esta lejos";
        if(bx==x&&by==y){
            r="Felicidades,acabas de encontrar el Tesoro Del DracoCornio";
            ganador=true;
        }else{
            if(bx==x){
                rx="esta en su pocision";    
            }else{
                if(bx+2==x||bx-2==x){
                    rx="esta cerca";
                }
            }
            if(by==y){
                ry="esta en su posicion";
            }else{
                if(by+2==y||by-2==y){
                    ry="esta cerca";
                }
            }
            r="X "+ rx + " , Y "+ry;
        } 
        return r;
    }

    public void reiniciar(){
        x=generarAleatorio();
        y=generarAleatorio();
        intentos=3;
        ganador=false;
    }

}
