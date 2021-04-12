
/**
 * 
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class SylvanoCornio{
    private int cantidadSavia;
    private int cantidadComponente;
    private String estado;
    public SylvanoCornio(){
        cantidadSavia       = 0;
        cantidadComponente  = 0;
        estado              = "Apagado";         
    }

    public String encender(){
        estado = "Encendido";
        return estado;
    }

    public String apagar(){
        estado = "Apagado";
        return estado;
    }

    public String crearReflejoLagrima(){
        String res;
        if(estado.equals("Encendido")){
            if(cantidadComponente < 20){
                if(cantidadSavia >= 50){
                    cantidadComponente++;
                    cantidadSavia = cantidadSavia - 50;
                    res = "Reflejo de Lagrima creado Exitosamente";
                }else{
                    res = "Savia insuficiente para crear Componente";
                }
            }else{
                res = "Espacio insuficiente";
            }
        }else{
            res = "El SylvanoCornio esta apagado";
        }
        return res;
    }

    public String agregarSavia(int cantidad){
        String res;
        if(estado.equals("Encendido")){
            if(cantidadSavia+cantidad <= 90){
                cantidadSavia = cantidadSavia+cantidad;
                res = "Savia agregada exitosamente";
            }else{
                res = "Error: No se puede agregar la cantidad, espacio insuficiente";
            }
        }else{
            res = "El SylvanoCornio esta Apagado";
        }
        return res;
    }
}