package ar.edu.untref.aydoo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosDAOTest {

	@Test
	public void persistirEnArchivoEnDirectorioDelProyecto() throws IOException {
		
		String impresionEsperada = "Factores primos 90: 2 2 2 3 3 5 \n";
		String path = "salida.txt";
		FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(path);
		factoresPrimosDAO.escribirFactorizacion(impresionEsperada);
		
		String impresionObtenida = factoresPrimosDAO.leerFactorizacion();
		
		Assert.assertEquals(impresionEsperada, impresionObtenida);
	
	}

	@Test
	public void persistirEnArchivoEnVariasLineasEnDirectorioDelProyecto() throws IOException {
		
		String impresionEsperada = "2\n2\n2\n3\n3\n5 \n";
		String path = "salida.txt";
		FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(path);
		factoresPrimosDAO.escribirFactorizacion(impresionEsperada);
		
		String impresionObtenida = factoresPrimosDAO.leerFactorizacion();
		
		Assert.assertEquals(impresionEsperada, impresionObtenida);
	
	}

}