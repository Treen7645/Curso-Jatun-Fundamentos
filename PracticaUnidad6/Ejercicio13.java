
public class Ejercicio13
{ 
    public String verificarSiSonAmigos(int num1,int num2){
        String res="NO son amigos";
        int r1=0,r2=0;
        for(int i=num1/2;i>=1;i--){
            if(num1%i==0){
                r1=r1+i;
            } 
        }
        for(int i=num2/2;i>=1;i--){
            if(num2%i==0){
                r2=r2+i;
            } 
        }
        if(r1==num2&&r2==num1)
            res="Son amigos";
        return res;
    }

}
