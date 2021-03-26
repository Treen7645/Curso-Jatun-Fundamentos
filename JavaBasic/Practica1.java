
/**
 * Practica 1 en lenguaje Java
 * 
 * @Victor Sejas-Treen
 * @version 1.0
 */
public class Practica1
{
   public int CalcularLongitudTriang(){
       int longPunt=20;
       int longTot=longPunt*2;
     return longTot;
    }
    
   public int CalcLongHoras(){
        int horaDes=11;
        int minDes=25+(horaDes*60);
        int horaDor=2;
        int minDor=45+(horaDor*60);
            int res=minDes-minDor;  
     return res;
    }
   
   public int BateriaRestante(int uJugar,int uRedS,int uVideo){
        int batRes=100,res;
        int jugar=20,redS=10,video=15;
            if(uJugar>0)
                jugar=(uJugar/60)*jugar;
            
            if(uRedS>0)
                redS=(uRedS/60)*redS;
            
            if(uVideo>0)
                video=(uVideo/60)*video;
    
        batRes=batRes-jugar-redS-video;
    return batRes;
    }
    
   public int cantMaxCanc(){
        int canMin=150;
        int limite=(15*60),aux=0;
          while(limite>0){
            limite=limite-canMin;
            aux++;
            }
        return aux;   
    }
    
   public int maqVer(int numCarnet){
            int n=numCarnet,res;
            res=n/10;
            res=numCarnet-res*10;
            
    return res;
    } 
    
   public int reglas(){
   int numDia=3,sem=0;
   boolean b=false;
       while(b==false){
               numDia=numDia+2;
               if(numDia==3){
                    b=true;
                    }
               if(numDia==8){
                    numDia=1;
                    sem=sem+1;
                    }
                  }
          sem=(sem*7)+numDia;       
                  return sem;
    } 
}
