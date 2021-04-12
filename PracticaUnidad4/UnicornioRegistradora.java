/**
 * Caja registradora de El Unicornio Feliz
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */

public class UnicornioRegistradora
{
    private int total;
    private int cambio;

    public UnicornioRegistradora()
    {
        total=0; 
        cambio=0;
    }

    public int getTotal(){
        return total;
    }

    public int sumaTotal(int costo,int cant){
        int prod=costo*cant;
        total=total+prod;
        return total;
    }

    public String mostrarRespuesta(int pago){

        String res="Error:El dinero indicado no cubre la compra";
        if(pago>total){
            cambio=pago-total;
            res="Cobro exitoso, el cambio a devolver es: "+cambio;
        }
        return res;
    }

}
