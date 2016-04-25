package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.productos.Periodico;
import ar.edu.untref.aydoo.productos.Libro;

public class ProductoTest {
	
	private Libro hobbit = new Libro("El Hobbit", 50);
	
	
	@Test
	public void queDosProductosDelMismoTipoConElMismoNombreSeanIguales() {

		Libro hobbit = new Libro("El Hobbit", 50);
		Assert.assertTrue(this.hobbit.equals(hobbit));
		
	}	
	
	@Test
	public void queDosProductosDelMismoTipoConDistintoNombreSeanDistintos() {
		
		Libro silmarillion = new Libro("El Silmarillion", 150);
		Assert.assertFalse(this.hobbit.equals(silmarillion));
		
	}
	
	@Test
	public void queDosProductosDeDistintoTipoSeanDistintos() {
		
		Periodico nyt = new Periodico("New York Times", 30, 40);
		Assert.assertFalse(this.hobbit.equals(nyt));
		
	}
}
