
/**
 * Write a description of class Capicua here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 * 
 */ class Ejercicio6
{
    public String recordarHijoMayor(String h1,int eh1,String h2,int eh2,String h3,int eh3){
        int mayor;
        int menor;
        int medio;
        String may=h3;
        String med=h2;
        String men=h1;
        String res;    
        if(eh1>eh2){
            if(eh2>eh3){
                may=h1;
                med=h2;
                men=h3;
            }
            if(eh3>eh1){
                may=h3;
                med=h1;
                men=h2;
            }
        }else{ if(eh1>eh3){
                may=h2; 
                med=h1;
                men=h3;
            }

        }
        res="El hermano mayor es " + may+" \nEl hermano de el medio es "+med+
        " \nEl hermano menor es "+men ;

        return res;
    }
}
