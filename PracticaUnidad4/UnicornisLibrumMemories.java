
/**
 * Write a description of class UnicornisLibrumMemories here.
 * 
 * @author Vcitor Sejas-Treen
 * @version 1.0
 */
public class UnicornisLibrumMemories
{
    private String tarea;
    private String estado;
    private int totalTareas;

    public UnicornisLibrumMemories(String tarea)
    {
        this.tarea=tarea;
        estado="sin concluir";
        totalTareas=1;
    }

    public String nuevaTarea(String nueva){
        String res="La tarea en curso no ha sido concluida";
        if(estado.equals("concluida")){
            tarea=nueva;
            totalTareas=totalTareas+1;
            res="Nueva tarea Asignada";
        }
        return res;
    }

    public void tareaConcluida(){
        estado="concluida";
    }

    public String getTarea(){
        return tarea;    
    }

}
