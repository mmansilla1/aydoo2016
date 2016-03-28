package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class HacedorDeTeChinoTest {

	@Test
	public void testPrepararEnUnVaso() {

		HacedorDeTeChino hacedorDeTeChino = new HacedorDeTeChino();
		Vaso vaso = new Vaso();
		
		hacedorDeTeChino.prepararEnEsteVaso(vaso);
		
		Assert.assertEquals(Contenido.TECHINO, vaso.getContenido().get(0));
		
	}

}