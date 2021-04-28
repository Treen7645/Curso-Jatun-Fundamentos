
/**
 * Write a description of class LaProclamacionDeMiAnhelo here.
 * 
 * @author Victor Sejas-Treen 
 * @version 1.0
 */
public class LaProclamacionDeMiAnhelo
{
    private int contador;
    private String verso;
    public LaProclamacionDeMiAnhelo(String vers)
    {
        contador=0;
        vers=verso;
    }
    
    public String analizarVerso(String versou){
        String res="No hay signos de puntuacion";
        contarSignos(versou);
        if(contador>0){
            res="Existen "+ contador+" signos de puntuacion";
        }
        return res;
    }

    private void contarSignos(String verso){
        for(int i=0;i<verso.length();i++){
            int temp=verso.charAt(i);
            if(temp=='.'||temp==','||temp==';'||temp=='¿'||temp=='?'||temp=='¡'||temp=='!'){
                contador=contador+1;
            }
        }
    }
}
