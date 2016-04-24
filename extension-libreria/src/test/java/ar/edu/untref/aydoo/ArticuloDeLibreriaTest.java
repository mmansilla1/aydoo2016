package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.productos.ArticuloDeLibreria;


public class ArticuloDeLibreriaTest {
	
	@Test
	public void queCalculeBienElIva() {
		
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 5);
		Assert.assertEquals(6.05, lapiz.calcularPrecioFinal(),0);
		
	}

}
