/**
 * Write a description of class UnicornioTron here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class UnicornioBaul
{
    private int clave;
    private boolean baulAbierto;
    public UnicornioBaul()
    {
        int clave= 1111;
        baulAbierto=false;
    }

    public String cambiarClave(int valor){
        String res="Clave cambiada con exito";
        if(baulAbierto){
            if(valor<10000&&valor>999)
                clave=valor;
        }else{
            res="El baul esta cerrado";
        }
        return res;   
    }

    public String abrirBaul(int numero){
        String res="la clave ingresada es incorrecta";
        if(baulAbierto)
            res="Error, el baul ya esta abierto";
        else
        if(numero==clave){
            res="Baul abierto";
            baulAbierto=true;
        }
        return res;
    }

    public String cerrarBaul(){
        String res="Error, el baul ya esta cerrado";
        if(baulAbierto){
            baulAbierto=false;
            res="Baul cerrado";
        }
        return res;
    }
}
