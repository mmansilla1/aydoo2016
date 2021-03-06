package ar.edu.untref.aydoo;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ar.edu.untref.aydoo.productos.ArticuloDeLibreria;
import ar.edu.untref.aydoo.productos.Libro;
import ar.edu.untref.aydoo.productos.Revista;
import ar.edu.untref.aydoo.productos.Suscripcion;

public class CompraTest {
	
	private static Compra compra;
	
	@BeforeClass
	public static void crearCompra() {
		
		compra = new Compra(Mes.MARZO);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 2);
		Revista paparazzi = new Revista ("Paparazzi", 4, 20);
		Suscripcion suscripcionAPaparazzi = new Suscripcion (paparazzi);
		compra.agregarArticulo(lapiz);
		compra.agregarArticulo(paparazzi);
		compra.agregarArticulo(suscripcionAPaparazzi);
		
	}
	
	@Test
	public void queEstenLosArticulosQueVoyAComprar() {
		
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 2);
		Revista paparazzi = new Revista ("Paparazzi", 4, 20);
		Suscripcion suscripcionAPaparazzi = new Suscripcion (paparazzi);
		
		Assert.assertTrue(compra.contiene(lapiz));
		Assert.assertTrue(compra.contiene(paparazzi));
		Assert.assertTrue(compra.contiene(suscripcionAPaparazzi));
		
	}
	
	@Test
	public void queNoEsteUnArticuloQueNoVoyAComprar() {
		
		ArticuloDeLibreria goma = new ArticuloDeLibreria("goma", 2);

		Assert.assertFalse(compra.contiene(goma));
		
	}
	
	@Test
	public void queDosComprasIgualesSeanIguales() {
		
		Compra otraCompra = new Compra(Mes.MARZO);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 2);
		Revista paparazzi = new Revista ("Paparazzi", 4, 20);
		Suscripcion suscripcionAPaparazzi = new Suscripcion (paparazzi);
		otraCompra.agregarArticulo(lapiz);
		otraCompra.agregarArticulo(paparazzi);
		otraCompra.agregarArticulo(suscripcionAPaparazzi);
		
	}
	
	@Test
	public void queDosComprasDeDistintosArticulosSeanDistintas() {
		
		Compra otraCompra = new Compra(Mes.MARZO);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 2);
		Libro fisicaConceptual = new Libro ("Fisica Conceptual", 250);
		otraCompra.agregarArticulo(lapiz);
		otraCompra.agregarArticulo(fisicaConceptual);
		
		Assert.assertFalse(compra.equals(otraCompra));
		
	}
	
	@Test
	public void queDosComprasDeDistintosMesesSeanDistintas() {
		
		Compra otraCompra = new Compra(Mes.ABRIL);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 2);
		Revista paparazzi = new Revista ("Paparazzi", 4, 20);
		Suscripcion suscripcionAPaparazzi = new Suscripcion (paparazzi);
		otraCompra.agregarArticulo(lapiz);
		otraCompra.agregarArticulo(paparazzi);
		otraCompra.agregarArticulo(suscripcionAPaparazzi);
		
		Assert.assertFalse(compra.equals(otraCompra));
		
	}

}
