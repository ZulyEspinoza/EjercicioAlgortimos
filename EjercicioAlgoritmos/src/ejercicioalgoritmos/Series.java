/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalgoritmos;

/**
 *
 * @author 130536
 */
public class Series {
    int[] arregloSerie1=new int[100];
    int[] arregloSerie2=new int[100];
    int[] arregloSerie3=new int[1000];
    int[] arregloSerie4=new int[1000];
    public void serie1(){  
        for(int i=0;i<100;i++){
            arregloSerie1[i]=i+1;
        }
    }
    public void serie2(){
        for(int i=99;i>=0;i--){
           arregloSerie2[i]=i+1;
        }
    }
    
    public void serie3(){
        int cont=0;
        for(int i=0;i<1000;i++){
            cont=cont+2;
            arregloSerie3[i]=cont;
        } 
    }
    public void serie4(){
        int cont=2002;
        for(int i=0;i<1000;i++){
            cont=cont-2;
            arregloSerie4[i]=cont;
        } 
    }
}
