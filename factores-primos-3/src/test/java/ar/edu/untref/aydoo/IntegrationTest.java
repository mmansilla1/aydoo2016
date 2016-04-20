package ar.edu.untref.aydoo;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

	@Test 
	public void persistirEnArchivoEnDirectorioDelProyectoConElNumero360() throws IOException {

		int numeroAFactorizar = 360;
		String formato = "--FORMAT=PRETTY";
		String sort = "--SORT:DES";
		String output = "--OUTPUT-FILE:salida.txt";
		String path = output.substring(14);

		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(path);

		List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		
		String impresionAPersistir;
		
    	switch (formato.toUpperCase()) {
	        case "":
	        	impresionAPersistir = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sort);
	        	break;
	    	case "--FORMAT=PRETTY":
	    		impresionAPersistir = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sort);
	        	break;
	        case "--FORMAT=QUIET":
	        	impresionAPersistir = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimos, sort);
	        	break;
	        default:
	        	impresionAPersistir = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
	    		break;
    	}    	
		
		factoresPrimosDAO.escribirFactorizacion(impresionAPersistir);
		String impresionLeida = factoresPrimosDAO.leerFactorizacion() ;
		
		Assert.assertEquals(impresionAPersistir.trim(), impresionLeida.trim());		

	}



}