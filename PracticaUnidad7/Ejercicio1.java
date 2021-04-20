public class Ejercicio1{
    public String buscarVortice(int[] arreglo){
        String res = "El vortice esta formado por: ";
        int mayor = arreglo[0];
        int menor = arreglo[0];
        
        int posMayor = 0;
        int posMenor = 0;
        
        for(int pos=0; pos<arreglo.length; pos++){
            int actual = arreglo[pos];
            if(actual > mayor){
                mayor = actual;
                posMayor = pos;
            }
            if(actual < menor){
                menor = actual;
                posMenor = pos;
            }
        }
        
        int inicio = Math.min(posMayor, posMenor); 
        int fin    = Math.max(posMayor, posMenor);
        
        for(int pos=inicio; pos<=fin; pos++){
            int actual = arreglo[pos];
            res = res+actual+" ";
        }
        return res;
    }
}