package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class LecheroTest {

	@Test
	public void testPrepararEnUnVaso() {

		Lechero lechero = new Lechero();
		Vaso vaso = new Vaso();
		
		lechero.prepararEnEsteVaso(vaso);
		
		Assert.assertEquals(Contenido.LECHE, vaso.getContenido().get(0));
		
	}

}