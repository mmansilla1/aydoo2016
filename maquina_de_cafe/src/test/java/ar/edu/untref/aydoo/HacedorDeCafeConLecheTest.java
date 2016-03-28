package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class HacedorDeCafeConLecheTest {

	@Test
	public void testPrepararEnUnVaso() {

		HacedorDeCafeConLeche hacedorDeCafeConLeche = new HacedorDeCafeConLeche();
		Vaso vaso = new Vaso();
		
		hacedorDeCafeConLeche.prepararEnEsteVaso(vaso);
		
		Assert.assertEquals(Contenido.CAFE, vaso.getContenido().get(0));
		Assert.assertEquals(Contenido.LECHE, vaso.getContenido().get(0));
		
	}

}