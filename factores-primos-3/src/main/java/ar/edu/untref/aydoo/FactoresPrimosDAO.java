package ar.edu.untref.aydoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FactoresPrimosDAO {

	private FileWriter archivoSalida;
	private String path;
	private Scanner scanner;
	
	public FactoresPrimosDAO(String path) throws IOException {
		archivoSalida = new FileWriter(path);
		this.path = path;
	}
	
	public void escribirFactorizacion(String factorizacion) throws IOException {
		archivoSalida.write(factorizacion);
		archivoSalida.close();
	}
	
	public String leerFactorizacion() throws FileNotFoundException {
		
		String factorizacion = "";
		File archivoSalidaParaLeer = new File(this.path);
		scanner = new Scanner(archivoSalidaParaLeer);
		
		while (scanner.hasNextLine()) {
			factorizacion = factorizacion + scanner.nextLine() + "\n";
		}
		
		return factorizacion;
	}
	
}