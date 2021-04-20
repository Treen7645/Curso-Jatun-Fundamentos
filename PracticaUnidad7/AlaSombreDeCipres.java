
/**
 * Write a description of class AlaSombreDeCipres here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class AlaSombreDeCipres
{ 
    private int sombraIni;
    private int[]arr;
    private int horasP;
    
    public AlaSombreDeCipres(int inicio, int horas)
    { 
        sombraIni=inicio;
        horasP=horas;
        arr=new int[horas];
        arr[0]=inicio;
    }

    public void predictorMagnitudesDeSombra(){
       int aux=1;
        for(int i=1;i<=horasP-1;i++){
         if(arr[i-1]%2==0){
            arr[i]=arr[i-1]/2;
            }else{
            arr[i]=arr[i-1]+aux;
            aux=aux+1;
            }
        }
    
    }
}
