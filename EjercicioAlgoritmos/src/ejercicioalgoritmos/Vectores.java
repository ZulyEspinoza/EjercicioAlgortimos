package ejercicioalgoritmos;

import java.util.Random;

public class Vectores {

	public int[] aleatorios(int cantidad) {
		int[] aleatorios=new int[cantidad];
		Random rndm=new Random(System.nanoTime());
		int iNumAleGen=0;
		int cont=0;
		while(cont<cantidad) {
			aleatorios[cont]=rndm.nextInt(10);
			cont++;
		}
		return aleatorios;
	}
	
	public int[] sumaDe2Vectores(int[] vector1, int[] vector2) {
		int[] resultadoSuma=new int[vector1.length];
		int cont=0;
		while(cont<vector1.length) {
			resultadoSuma[cont]=vector1[cont]+vector2[cont];
			cont++;
		}
		return resultadoSuma;
		
	}
}
