
/**
 * Write a description of class Capicua here.
 * 
 * @author Victor Sejas-Treen
 * @version 1.0
 * 
 */ 
public class Ejercicio8
{
    public String mostrarFechaLiteralSwitch(int d,int m, int a){
        int mes=m;
        String resultado="";
        switch(mes){
            case 1:
            {
                resultado=d+" de Enero "+a;
                break;
            }
            case 2:
            {
                resultado=d+ "de Febrero "+a;
                break;
            }
            case 3:
            {
                resultado=d+ " de Marzo "+a;
                break;
            }
            case 4:
            {
                resultado=d+" de Abril "+ a;
                break;
            }
            case 5:
            {
                resultado=d+ " de Mayo "+ a;
                break;
            }
            case 6:
            {
                resultado=d+" de Junio "+a;
                break;
            }
            case 7:
            {
                resultado=d+" de Julio "+a;
                break;
            }
            case 8:
            {
                resultado=d+" de Agosto "+a;
                break;
            }
            case 9:
            {
                resultado=d+" de Septiembre "+a;
                break;
            }
            case 10 :
            {
                resultado=d+" de Octubre "+a;
                break;
            }
            case 11:
            {
                resultado=d+" de Noviembre "+a;
                break;
            }
            case 12:
            {
                resultado=d+" de Diciembre "+a;
                break;
            }

        }
        return resultado;
    }

    public String MostrarFechaLiteralIf(int d,int m,int a){
        String res="";
        String mes="";
        if(m==1)
            mes="enero";

        if(m==2)
            mes="febrero";

        if(m==3)
            mes="marzo";

        if(m==4)
            mes="abril";

        if(m==5)
            mes="mayo";

        if(m==6)
            mes="junio";

        if(m==7)
            mes="julio";

        if(m==8)
            mes="agosto";

        if(m==9)
            mes="septiembre";

        if(m==10)
            mes="octubre";

        if(m==11)
            mes="noviembre";

        if(m==12)
            mes="diciembre";
        res=d+ " de "+ mes + " de "  + a;
        return res;
    }

}
