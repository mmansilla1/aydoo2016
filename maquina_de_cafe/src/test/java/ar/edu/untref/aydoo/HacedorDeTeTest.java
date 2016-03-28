package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class HacedorDeTeTest {

	@Test
	public void testPrepararEnUnVaso() {

		HacedorDeTe hacedorDeTe = new HacedorDeTe();
		Vaso vaso = new Vaso();
		
		hacedorDeTe.prepararEnEsteVaso(vaso);
		
		Assert.assertEquals(Contenido.TE, vaso.getContenido().get(0));
		
	}

}