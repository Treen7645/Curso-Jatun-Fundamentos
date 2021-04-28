
/**
 * Write a description of class RebeldiasYDistinciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RebeldiasYDistinciones
{   
    private String fras;
    private int contador;

    public RebeldiasYDistinciones(String frase)
    {
        fras=frase;
        contador=0;
    }

    public String evaluar(String verso){
        String res;
        contarVocales(verso);
        res="Existen "+ contador + " vocales";
        return res;
    }

    private void contarVocales(String frase){
        for(int i=0;i<frase.length();i++){
            int temp=frase.charAt(i);
            if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'||temp=='A'||temp=='E'||temp=='O'||temp=='U'||temp=='I'){
                contador=contador+1;
            }else{
                if(temp=='á'||temp=='é'||temp=='í'||temp=='ó'||temp=='ú')
                contador=contador+1;                          
            }
        }
    } 
}
