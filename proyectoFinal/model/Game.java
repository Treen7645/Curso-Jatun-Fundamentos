  package model;

import java.awt.*;
import java.util.ArrayList;

public class Game implements UnoGame {
    private ArrayList<UnoCard>baraja;
    private ArrayList<UnoCard>descartados;
    private ArrayList<Player>listaJ;
    public Game(){
       baraja=new ArrayList<>();
       descartados=new ArrayList<>();
    }
    @Override
    public Player whoWin() {
       Player temp=null;
        for(Player e:listaJ){
            if(e.ganador()){
            temp=e.copia();
            }
        }
        return temp;
    }

    @Override
    public ArrayList<UnoCard> getCardsCurrentPlayer() {
        return null;
    }

    @Override
    public ArrayList<Player> getPlayers() {
        return null;
    }

    @Override
    public UnoCard getCurrentCard() {
        return null;
    }

    @Override
    public Player getCurrentTurn() {
        return null;
    }

    @Override
    public boolean dropCard(UnoCard card) {
        return false;
    }

    @Override
    public void loadCard() {
        
    }

    @Override
    public boolean nextTurn() {
        return false;
    }


    @Override
    public int sizeDeck() {
        return 0;
    }

    /*
    * 0 -> Izquierda
    * 1 -> Derecha
     */
    @Override
    public int getDirection() {
        return 0;
    }

    @Override
    public void shuffle() {

    }
}
