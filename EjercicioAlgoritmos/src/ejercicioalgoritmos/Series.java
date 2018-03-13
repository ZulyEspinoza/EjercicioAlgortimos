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
	
    public int[] serie1(){
    	int[] arregloSerie=new int[100];
        for(int i=0;i<100;i++){
            arregloSerie[i]=i+1;
        }
        return arregloSerie;
    }
    
    public int[] serie2(){
    	int[] arregloSerie=new int[100];
    	int iNumAsig=100;
    	for(int i=0;i<100;i++){
            arregloSerie[i]=iNumAsig;
            iNumAsig=iNumAsig-1;
        }
    	return arregloSerie;
    }
    
    public int[] serie3(){
    	int[] arregloSerie=new int[1000];
        int cont=0;
        for(int i=0;i<1000;i++){
            cont=cont+2;
            arregloSerie[i]=cont;
        } 
        return arregloSerie;
    }
    
    public int[] serie4(){
    	int[] arregloSerie=new int[1000];
        int cont=2002;
        for(int i=0;i<1000;i++){
            cont=cont-2;
            arregloSerie[i]=cont;
        } 
        return arregloSerie;
    }
    
    public String serieFibonacci() {
    	int iNumImp=0, iNumAux1=0, iNumAux2=1, iCont=100;
    	String res="";
    	while(iCont>0){//mientras d sea mayor que 0 sumaremos b + c y despues reasignaremos valores a estas variables
            iNumImp=iNumAux1+iNumAux2;
            iNumAux1=iNumAux2;       //le asignamos a b el valor que contenia c
            iNumAux2=iNumImp; //le asignamos a c el valor que contiene a
            iCont--;   //decrementamos d
            res=res+iNumImp+"\n";
        }
    	return res;
    }
    
    public int[] serieLimites(int iMenor, int iMayor) {
		double iAux = iMayor - iMenor + 1;
		double iA = iAux;
		double iB = Math.ceil(iAux / 2);
		double iC = Math.ceil(iAux / 3);
		double iD = Math.ceil(iAux / 5);
		double iE = Math.ceil(iAux / 10);
		double iF = Math.ceil(iAux / 20);

		double iSizeArr = Math.ceil(iA + iB + iC + iD + iE + iF);
		int[] arrSeries = new int[(int) iSizeArr];
		int cont = 0;
		int n = 1;

		for (int i = 1; arrSeries.length != cont; i += n) {
			if (iA == cont/* && cont < iA + iB */) {
				n = 2;
				i = 1;
			} else if (iA + iB == cont /* && cont < iA + iB + iC */) {
				n = 3;
				i = 1;
			} else if (iA + iB + iC == cont /* && cont < iA + iB + iC + iD */) {
				n = 5;
				i = 1;
			} else if (iA + iB + iC + iD == cont /* && cont < iA + iB + iC + iD + iE */) {
				n = 10;
				i = 1;
			} else if (iA + iB + iC + iD + iE == cont /* && cont < iA + iB + iC + iD + iE + iF */) {
				n = 20;
				i = 1;
			} else if (iA + iB + iC + iD + iE + iF == cont) {
				continue;
			}
			arrSeries[cont] = i;
			cont++;
		}
		return arrSeries;
	}
}
