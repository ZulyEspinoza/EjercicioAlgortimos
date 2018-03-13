package ejercicioalgoritmos;

public class ManejoCadenas {
	public boolean palindromo(String cadena) {
		boolean isPalindromo=true;
		int iMitadCadena=Math.floorDiv(cadena.length(), 2);
		for(int i=0; i<iMitadCadena; i++) {
			if(cadena.charAt(i)!=cadena.charAt((cadena.length()-1)-i)) {
				isPalindromo=false;
			}
		}
		return isPalindromo;
	}

}
