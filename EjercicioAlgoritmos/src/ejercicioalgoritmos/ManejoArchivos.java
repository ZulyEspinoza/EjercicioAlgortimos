package ejercicioalgoritmos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {

	public String leerArchivo(String sNombreArchivo) {
		FileReader reader;
		BufferedReader bf;
		String cadena = "", aux="";
		try {
			reader = new FileReader(sNombreArchivo);
			bf = new BufferedReader(reader);
			while ((aux = bf.readLine()) != null) {
				cadena+=aux+"\n";

			}
		} catch (FileNotFoundException i) {
			cadena = "Error: Archivo no encontrado";
		} catch (IOException i) {
			cadena="Error: No se puede cerrar el archivo";
		}

		return cadena;
	}
	
	public void escribirArchivo(String sNombreArchivo, String sTexto) {
		FileWriter archivo;
		PrintWriter writer;
		try {
			archivo=new FileWriter(sNombreArchivo);
			writer=new PrintWriter(archivo);
			writer.print(sTexto);
			archivo.close();
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
