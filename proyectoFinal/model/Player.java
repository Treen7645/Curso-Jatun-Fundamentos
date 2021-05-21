package model;
import java.util.ArrayList;
public class Player{
    private String name;
    private ArrayList<UnoCard>mano;
    public Player(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o){
        boolean b=false;
        Player temp=(Player)o;
        String n=temp.getName();
        if(n.equals(name)){
            b=true;
        }

        return b;
    }

    public void addMano(UnoCard x){
        mano.add(x);
    }

    public boolean ganador(){
        boolean b=mano.isEmpty();
        return b;
    }

    public void dejarCarta(UnoCard y){
        mano.remove(y); 
    }

    public Player copia(){
        String n=getName();
        Player x=new Player(n);
        return x;
    }
}
