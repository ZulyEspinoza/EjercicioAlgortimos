/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalgoritmos;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;
import javax.sound.midi.Soundbank;

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
        
        Condicionales condicionales = new Condicionales();
        Series series = new Series();
        Operaciones operaciones = new Operaciones();
        ManejoCadenas manejoCadenas=new ManejoCadenas();
        Vectores vectores=new Vectores();
        ManejoArchivos manejoArchivos=new ManejoArchivos();
        
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
                    + "15.-  Dia de la semana\n"
                    + "16.-  Hola´s mundo\n"
                    + "17.-  Numeros primos\n"
                    + "18.-  Palindromos\n"
                    + "19.-  Numeros aleatorios\n"
                    + "20.-  Suma de 2 vectores de numeros aleatorios\n"
                    + "21.-  Lectura de archivos\n"
                    + "22.-  Escritura de archivos");
            sDecision=lector.next();
            switch(sDecision){
                case "1":
                    int edad;
                    String respuesta;
                    System.out.println("Introduce tu edad:");
                    edad=lector.nextInt();		
                    respuesta=condicionales.mensajeEdad(edad);	
                    System.out.println(respuesta);
                    lector.close();
                    youContinue=false;
                break;
                case "2":
                    int mes;
                    System.out.println("Introduce un numero");
                    mes=lector.nextInt();
                    respuesta=condicionales.mensajeMeses(mes);
                    System.out.println(respuesta);
                    lector.close();
                    youContinue=false;
                break;
                case "3":
                	double dSalario, dHoras;
                	String sCiudad, sHijos;
                	System.out.println("Cuantas horas trabajaste?");
                	dHoras=lector.nextDouble();
                	System.out.println("Cual es tu salario por hora?");
                	dSalario=lector.nextDouble();
                	System.out.println("Tienes hijos? s/n");
                	sHijos=lector.next();
                	System.out.println("Donde vives?");
                    sCiudad=lector.next();
                    System.out.println(condicionales.mensajeSalario(dHoras, dSalario, sCiudad, sHijos));
                break;
                case "4":
                    int[] arreglo=new int[100];
                    arreglo=series.serie1();
                    for(int i=0;i<100;i++){
                        System.out.println(arreglo[i]);
                    }
                    youContinue=false;
                break;
                case "5":
                	int[] arregloInverso=new int[100];
                    arregloInverso=series.serie2();
                    for(int i=0;i<100;i++){
                        System.out.println(arregloInverso[i]);
                    }
                    youContinue=false;
                break;
                case "6":
                	int[] arreglo2000=new int[1000];
                    arreglo2000=series.serie3();
                    for(int i=0;i<1000;i++){
                        System.out.println(arreglo2000[i]);
                    }
                    youContinue=false;
                break;
                case "7":
                	int[] arreglo2000Inv=new int[1000];
                    arreglo2000Inv=series.serie4();
                    for(int i=0;i<1000;i++){
                        System.out.println(arreglo2000Inv[i]);
                    }
                    youContinue=false;
                break;
                case "8":
                	String fibonacci;
                	fibonacci=series.serieFibonacci();
                	System.out.println(fibonacci);
                	youContinue=false;
                break;
                case "9":
                	double dBase, dExp;
                	System.out.println("Introduce la base");
                	dBase=lector.nextDouble();
                	System.out.println("Introduce el exponente");
                	dExp=lector.nextDouble();
                	System.out.println(operaciones.exponencial(dBase, dExp));
                	lector.close();
                	youContinue=false;
                break;
                case "10":
                	int iNumeroMenor = 0, iNumeroMayor = 0;
					double dTamanioArreglo = iNumeroMayor - iNumeroMenor + 1;
					dTamanioArreglo = Math.ceil(dTamanioArreglo + (dTamanioArreglo / 2) + (dTamanioArreglo / 3) + (dTamanioArreglo / 5) + 
							(dTamanioArreglo / 10) + (dTamanioArreglo / 20));
					int[] arrTable2 = new int[(int) dTamanioArreglo];
					System.out.print("Introduce el número menor");
					iNumeroMenor = lector.nextInt();
					System.out.print("Introduce el número mayor");
					iNumeroMayor = lector.nextInt();

					arrTable2 = series.serieLimites(iNumeroMenor, iNumeroMayor);
					
					for(int i = 0; i < arrTable2.length; i++) {
						if(arrTable2[i] == 1) {
							System.out.println();
						}
						System.out.print(arrTable2[i]+"|");
					}
                break;
                case "11":
                	int iNumF;
                	System.out.println("Introduce el numero del que desees conocer el factorial");
                	iNumF=lector.nextInt();
                	System.out.println(operaciones.factorial(iNumF));
                    
                break;
                case "12":
                    int iNumMul20;
                    int[] resMul20=new int[21];
                    System.out.println("Introduce el numero del que quieres conocer su tabla de multiplicar");
                    iNumMul20=lector.nextInt();
                    resMul20=operaciones.tablasMultiplicar(iNumMul20);
                    for(int i=0;i<=20;i++) {
                    	System.err.println(iNumMul20+" * "+i+" = "+resMul20[i]);
                    }
                break;
                case "13":
                	int iLimiteTablas, iLimiteMult;
                	System.out.println("Introduce el numero hasta el que quieras multiplicar");
                	iLimiteMult=lector.nextInt();
                	System.out.println("Introduce el numero hasta el que deseas conocer las tablas de multiplicar");
                    iLimiteTablas=lector.nextInt();
                    int[][] result=new int[iLimiteMult+1][iLimiteTablas+1];
                    result=operaciones.tablasMultiplicarM(iLimiteMult, iLimiteTablas);
                    for(int i=0;i<=iLimiteMult;i++) {
                    	System.out.println("\n");
            			for(int j=0; j<=iLimiteTablas;j++) {
            				System.out.print(j+" * "+i+" = "+result[i][j]+"    ");
            			}
            		}
                    
                break;
                case "14":
                    
                break;
                case "15":
                    
                break;
                case "16":
                    
                break;
                case "17":
                	
                break;
                case "18":
                	String cadenaPalindromo;
                	System.out.println("Introduce una palabra o frase");
                	cadenaPalindromo=lector.next();
                	System.out.println(manejoCadenas.palindromo(cadenaPalindromo));
                break;
                case "19":
                	int numAleatorio;
                	System.out.println("Cuantos numeros aleatorios deseas generar?");
                	numAleatorio=lector.nextInt();
                	int[] nAleatorios=new int[numAleatorio];
                	nAleatorios=vectores.aleatorios(numAleatorio);
                	for(int i=0; i<numAleatorio;i++) {
                		System.out.println("Aleatorio No.: "+(i+1)+" : "+nAleatorios[i]);
                	}
                break;
                case "20":
                	int numero;
                	System.out.println("Introduce cuantos numeros aleatorios deseas generar");
                	numero=lector.nextInt();
                	int[] vec1=new int[numero];
                	int[] vec2=new int[numero];
                	int[] vecSuma=new int[numero];
                	vec1=vectores.aleatorios(numero);
                	vec2=vectores.aleatorios(numero);
                	vecSuma=vectores.sumaDe2Vectores(vec1, vec2);
                	System.out.println("Vector1  Vector2  Resultado");
                	for(int i=0;i<numero;i++) {
                		System.out.println(vec1[i]+"        "+vec2[i]+"        "+vecSuma[i]);
                	}
                break;
                case "21":
                	String sNombreArchivo;
                	System.out.println("Introduce el nombre del archivo");
                	sNombreArchivo=lector.next();
                	System.out.println(manejoArchivos.leerArchivo("C:\\Users\\130536\\Documents\\Generation 2018A\\Proyectos"
                			+ "\\EjercicioAlgoritmos\\Archivos\\"+sNombreArchivo+".txt"));
                break;
                case "22":
                String sNomArchivo, sTexto;
                System.out.println("Escribe el nombre del archivo");
                sNomArchivo=lector.next();
                System.out.println("Escribe el contenido del archivo");
                sTexto=lector.next();
                manejoArchivos.escribirArchivo("C:\\Users\\130536\\Documents\\Generation 2018A\\Proyectos\\EjercicioAlgoritmos"
                		+ "\\Archivos\\"+sNomArchivo+".txt", sTexto);
                break;
                default:
                    System.out.println("Elige una opcion del 1 al 20");
                    youContinue=true;
                break;
            }
        }while(youContinue==true);
        
//        int num1=0, num2=0;
//    	char respuesta=' ';
//    	
//    	do {
//    		System.out.println("Dame un numero");
//    		num1=lector.nextInt();
//    		System.out.println("Dame un numero");
//    		num2=lector.nextInt();
//    		System.out.println("Resultado: "+(num1+num2));
//    	}while(respuesta=='s'||respuesta=='S');
    }
  
}
