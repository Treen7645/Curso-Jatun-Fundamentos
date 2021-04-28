
/**
 * Write a description of class ElEmigmaDeTusVersos here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class ElEmigmaDeTusVersos
{
    private String password;
    private String verso;

    public ElEmigmaDeTusVersos(String password, String verso)
    {
        this.password=password;
        this.verso=verso;
    }

    public String  comparar(String clav,String fras){
        String res;
        if(existe(clav,fras)){
            res="Si es posible formar la palabra deseada";
        }else{
            res="No es posible formar la palabra deseada";
        }    
        return res; 
    }

    private boolean existe(String clave,String frase){
        boolean b=false;
        int pos=0;
        int fin=clave.length();
        if(frase.charAt(0)==clave.charAt(pos)){
            pos=pos+1;
        }
        for(int i=0;i<frase.length()&&!b;i++ ){
            if(frase.charAt(i)==' '){
                if(frase.charAt(i+1)==clave.charAt(pos)){
                    pos=pos+1;
                    if(pos==clave.length()){ 
                        b=true;
                    }
                }
            }

        }
        return b;
    }
}
