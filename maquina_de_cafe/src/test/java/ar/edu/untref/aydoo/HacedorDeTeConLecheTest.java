package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class HacedorDeTeConLecheTest {

	@Test
	public void testPrepararEnUnVaso() {

		HacedorDeTeConLecheTest hacedorDeTeConLeche = new HacedorDeTeConLecheTest();
		Vaso vaso = new Vaso();
		
		hacedorDeTeConLeche.prepararEnEsteVaso(vaso);
		
		Assert.assertEquals(Contenido.TE, vaso.getContenido().get(0));
		Assert.assertEquals(Contenido.LECHE, vaso.getContenido().get(0));
		
	}

}