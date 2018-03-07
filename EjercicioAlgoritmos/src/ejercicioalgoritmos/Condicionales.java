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
public class Condicionales {	
    public String mensajeEdad(int edad){//OO
	String mensaje="";
	if(edad>0 && edad<12)
            mensaje="Eres un niño!";
	if(edad>=12 && edad<19)
            mensaje="Eres un adolescente!";
	if(edad>=19 && edad<35)
            mensaje ="Eres un chavorruco!";
        if(edad>=35)
            mensaje="Eres el macho!";
        return mensaje;
    }
    
    public String mensajeMeses(int mes){
        String mensaje="";
        switch(mes){
            case 1:
                mensaje="Enero";
                break;
            case 2:
                mensaje="Febrero";
                break;
            case 3:
                mensaje="Marzo";
                break;
            case 4:
                mensaje="Abril";
                break;
            case 5:
                mensaje="Mayo";
                break;
            case 6:
                mensaje="Junio";
                break;
            case 7:
                mensaje="Julio";
                break;
            case 8:
                mensaje="Agosto";
                break;
            case 9:
                mensaje="Septiembre";
                break;
            case 10:
                mensaje="Octubre";
                break;
            case 11:
                mensaje="Noviembre";
                break;
            case 12:
                mensaje="Diciembre";
                break;
            default:
                mensaje="Solo existen 12 meses no seas bruto/a";
                break;
        }
        return mensaje;
    }
    
    public String mensajeSalario(){
        String mensaje="";
        return mensaje;
    }
}
