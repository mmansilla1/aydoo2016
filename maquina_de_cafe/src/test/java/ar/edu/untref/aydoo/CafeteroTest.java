package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class CafeteroTest {

	@Test
	public void testPrepararEnUnVaso() {

		Cafetero cafetero = new Cafetero();
		Vaso vaso = new Vaso();
		
		cafetero.prepararEnEsteVaso(vaso);
		
		Assert.assertEquals(Contenido.CAFE, vaso.getContenido().get(0));
		
	}

}