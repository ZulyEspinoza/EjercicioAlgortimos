package ejercicioalgoritmos;

public class Ciclos {
	public boolean numerosPrimos(int numero) {
		boolean isPrimo=true;
		for(int i=2; i<numero;i++) {
			if(numero%i==0) {
					isPrimo=false;
					break;
			}
		}
		if(isPrimo==true) {
			
		}
		return true;
	}

}
