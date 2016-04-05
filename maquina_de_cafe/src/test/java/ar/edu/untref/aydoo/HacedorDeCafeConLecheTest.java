package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class HacedorDeCafeConLecheTest {

	@Test
	public void testPrepararEnEsteVaso() {
		
		HacedorDeCafeConLeche hacedorDeCafeConLeche = new HacedorDeCafeConLeche();
		Vaso vaso1 = new Vaso();
		vaso1.agregarContenido(Contenido.CAFE);
		vaso1.agregarContenido(Contenido.LECHE);
		Vaso vaso2 = new Vaso();
		
		vaso2 = hacedorDeCafeConLeche.prepararEnEsteVaso(vaso1);
		
		Assert.assertEquals(vaso1.getContenido(), vaso2.getContenido());
		
	}

}