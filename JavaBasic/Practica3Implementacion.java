
/**
 * Write a description of class Practica3Implementacion here.
 * 
 * @author (Victor Sejas-Treen) 
 * @version (1.0)
 */
public class Practica3Implementacion
{   //Ej1
    public int horasInPrimavera(int z){
        int resultado=24+(24-z);
        return resultado;
    }
    //Ej2
    public int areDodecaedro(int r)//1 ≤ r ≤ 15445
    {        
        int res= 3*r*r;
        return res;
    }
    //Ej3
    public double circunferencia(int radio){
        int d=radio*2;
        double pi=3.14159;
        double res=d*pi;
        return res;
    }
    //Ej4
    public int numHojas(int pag)//N ≥ 1
    {
        int r=pag%2;    
        int num=pag/2+r;
        return num;
    }
    //Ej5
    public int ordenBca(int a,int b,int c)//1 ≤ a, b, c ≤ 9
    {
        c=c*10;
        b=b*100;
        int res=a+b+c;
        return res;
    }
    //Ej6
    public String intercambio(int a,int b,int c){
        int ax=a, bx=b, cx=c;
        String res="";
        b=a;
        ax=bx;
        a=c;
        c=ax;
        res= a+" "+b+" "+c;
        return res;
    }

    //Ej7
    public int bonoPoder(int p,int x,int n)//0 ≤ P ≤ 9,N ≤ X
    {
        int res=p+(x*n);

        return res;
    }

    public char sigLetra(char l){
        String alf="abcdefghijklmopqrstuxyz";
        int n=0;char car=alf.charAt(n);
        if(l!='z')
            while(l!=car){
                n++; 
                car=alf.charAt(n);
            }
        char res=alf.charAt(n+1);
        return res;
    }  

    public char sigLetra2(char letra){
        char res=(char)(letra+1);
        return res;
    }

    public int maxSeguidos(int numSeguidores,int numSeguidos){
        int res=(numSeguidores*3)-numSeguidos;
        return res;
    }

    public int aguaEnGotero(int aguaEnGotero, int tiempoPorGota){
        int res=aguaEnGotero-tiempoPorGota;
        return res;
    }
}