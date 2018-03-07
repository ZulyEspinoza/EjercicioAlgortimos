/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalgoritmos;

import java.util.Scanner;

/**
 *
 * @author 130536
 */
public class EjercicioAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        String sDecision;
        boolean youContinue=false;
    /*-------------------------------------------------------------------------*/
        
        Condicionales pruebaCondicionales = new Condicionales();
        Series pruebaSeries = new Series();
        
    /*-------------------------------------------------------------------------*/
    
        do{
            System.out.println("Elige una de las siguientes opciones:\n"
                    + "1.-   Edad y rango\n"
                    + "2.-   Meses\n"
                    + "3.-   Salario\n"
                    + "4.-   Serie del 1 al 100\n"
                    + "5.-   Serie del al 100 inversa\n"
                    + "6.-   Serie del 2 al 2000\n"
                    + "7.-   Serie del 2 al 2000 inversa\n"
                    + "8.-   Serie de Fibonacci\n"
                    + "9.-   Exponenciales\n"
                    + "10.-  Serie con limite inferior y superior\n"
                    + "11.-  Factorial\n"
                    + "12.-  Tabla de Multiplicar(hasta el 20)\n"
                    + "13.-  Tabla de multiplicar(Matriz)\n"
                    + "14.-  Menu\n"
                    + "15.-  Día de la semana\n"
                    + "16.-  Hola´s mundo");
            sDecision=lector.next();
            switch(sDecision){
                case "1":
                    int edad;
                    String respuesta;
                    System.out.println("Introduce tu edad:");
                    edad=lector.nextInt();		
                    respuesta=pruebaCondicionales.mensajeEdad(edad);	
                    System.out.println(respuesta);
                    lector.close();
                break;
                case "2":
                    int mes;
                    System.out.println("Introduce un número");
                    mes=lector.nextInt();
                    respuesta=pruebaCondicionales.mensajeMeses(mes);
                    System.out.println(respuesta);
                    lector.close();
                break;
                case "3":
                    
                break;
                case "4":
                    pruebaSeries.serie1();
                    for(int i=0;i<100;i++){
                        System.out.println(pruebaSeries.arregloSerie1[i]);
                    }
                break;
                case "5":
                    pruebaSeries.serie2();
                    for(int i=99;i>=0;i--){
                        System.out.println(pruebaSeries.arregloSerie2[i]);
                    }
                    
                break;
                case "6":
                    pruebaSeries.serie3();
                    for(int i=0;i<1000;i++){
                        System.out.println(pruebaSeries.arregloSerie3[i]);
                    }
                break;
                case "7":
                    pruebaSeries.serie4();
                    for(int i=0;i<1000;i++){
                        System.out.println(pruebaSeries.arregloSerie4[i]);
                    }
                break;
                case "8":
                    
                break;
                case "9":
                    
                break;
                case "10":
                    
                break;
                case "11":
                    
                break;
                case "12":
                    
                break;
                case "13":
                    
                break;
                case "14":
                    
                break;
                case "15":
                    
                break;
                case "16":
                    
                break;
                default:
                    System.out.println("Elige una opcion del 1 al 16");
                    youContinue=true;
                break;
            }
        }while(youContinue==true);
    }
    
}
