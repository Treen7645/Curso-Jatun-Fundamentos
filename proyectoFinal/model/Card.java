
package model;

import java.awt.*;

public class Card  implements UnoCard{
    String valor;
    Color c;
    Card(String v, Color c){
       valor=v;
       this.c=c;
    }
    @Override
    public String getValue() {
        return valor;
    }

    @Override
    public Color getColor(){
        
        return c;
    }
    
    public void setColor(Color n){
     c=n;
    }
    
    public void setValue(String val){
     valor=val;
    }
    
    public Card copia(){
        String val=getValue();
        Color valC=getColor();
        Card copia=new Card(val,valC);
        return copia;

    }
}
