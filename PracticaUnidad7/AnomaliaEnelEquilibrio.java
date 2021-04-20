/**
 * Write a description of class CuandoLasEstrellasDejenDeBrillar here.
 * 
 * @author Victor Sejas-Treen
 * @version 2.0
 */
public class AnomaliaEnelEquilibrio
{

    private int[]arreglo;
    private int ini;
    private int fin;
    private int iniR;
    private int finR;
    private int finL;
    private int iniL;
    private int sumL;
    private int sumR;
    private String temp;
    public AnomaliaEnelEquilibrio(int arr[])
    {

        arreglo = new int[]{4,6,11,2,21,9,15,3,13,7};
        ini=0;
        fin=arreglo.length-1;
        iniL=ini;
        finL=(fin/2);
        iniR=finL+1;
        finR=fin;
        sumL=recorrerYSumarArreglo(iniL,finL);
        sumR=recorrerYSumarArreglo(iniR,finR);
        temp="";
    }

    public String prueba(){
        return " el tamaño es "+ finR+" inicia en "+iniL+" hasta " +finL +" y luego "+iniR;
    }

    private int recorrerYSumarArreglo(int i,int f){
        int suma=0;
        for(int x=i;x<=f;x++){
            suma=arreglo[x]+suma;
        }
        return suma;  
    } 

    public String respuesta(){
        boolean b=false;
        String res="";
        int num=0;
        int pot=1;
        if(sumR==sumL){
            res="No existe desequilibrio";
        }else{
            while(!b){
                if(sumR>sumL){
                    int x=iniR;
                    int y=finR;
                    if(x==y){
                        num=sumR;
                        b=true;
                    }

                    iniL=iniR;
                    finL=iniR+finR/(int)Math.pow(2,pot);
                    iniR=finL+1;
                    finR=finR;

                }else{
                    int a=iniL;
                    int c=finL;
                    if(a==c){
                        num=sumL;
                        b=true;
                    }

                    iniL=iniL;
                    finL=iniL+finL/(int)Math.pow(2,pot);
                    iniR=finL/2+1;     
                    finR=finL;
                }
                sumL=recorrerYSumarArreglo(iniL,finL);
                sumR=recorrerYSumarArreglo(iniR,finR);
                pot=pot+1;
                temp= "el tamaño es "+ finR+"inicia en "+iniL+"hasta " +finL +"y luego "+iniR;
            }

            res="el numero desequilibrado es: "+num;
        }
        return res;
    }   
}
