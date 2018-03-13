package ejercicioalgoritmos;

public class Operaciones {

	
	public double exponencial(double dBase, double dExponente) {
		
		return Math.pow(dBase, dExponente);
	}
	
	public String factorial(int iNum) {
		int iFact = 1, iAux = iNum;
		String result = "";
		for (int i = 1; i < iNum + 1; i++) {
			iFact = iFact * i;
			if (iAux == 1) {
				result = result + iAux + " = ";
			} else {
				result = result + iAux + " * ";
				iAux--;
			}
		}
		return result + iFact;
	}
	
	public int[] tablasMultiplicar(int iNumero) {
		int[] resultado=new int[21];
		for(int i=0;i<=20;i++) {
			resultado[i]=iNumero*i;
		}
		return resultado;
	}
	
	public int[][] tablasMultiplicarM(int iLimiteMultiplicador, int iLimiteTablas) {
		int[][] resultado=new int[iLimiteMultiplicador+1][iLimiteTablas+1];
		for(int i=0;i<=iLimiteMultiplicador;i++) {
			for(int j=0; j<=iLimiteTablas;j++) {
				resultado[i][j]=i*j;
			}
		}
		return resultado;
	}
}
