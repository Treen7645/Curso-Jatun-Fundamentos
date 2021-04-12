
/**
 * Write a description of class UnicornioTron here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 */
public class UnicornioTron
{
    private int premio;
    private int ficha;
    protected int numeroSecreto;

    public UnicornioTron(int premio)
    {
        this.premio=premio;
        ficha=0;
        numeroSecreto=generarAleatorio();
    }

    public int getPremio(){
        return premio;
    }

    public String insertarFicha(int n ){
        String res;
        if(premio>0){
            ficha=n+ficha;
            res="Ficha(s) añadida correctamente";
        }else{
            res="Error,por favor, solicita que recarguen la maquina";}
        return res;
    }

    public int generarAleatorio(){
        int numero=(int)(Math.random()*premio);
        return numero;
    }

    public void setPremio(int valor){
        premio=valor;
    }

    public String Juego(int numero){
        String res="Intento Fallido";   
        if(ficha>0){
            if(premio<=0){
                res="Error,por favor, solicita que recarguen la maquina";
                ficha++;
            }else{

                if(numero==numeroSecreto){
                    res="Felicitaciones Ganaste";
                    premio=0;

                }
            }
            ficha=ficha-1;
        }

        return res;
    }
}
