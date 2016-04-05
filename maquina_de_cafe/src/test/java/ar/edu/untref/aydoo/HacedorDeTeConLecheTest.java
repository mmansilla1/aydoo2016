package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class HacedorDeTeConLecheTest {

	@Test
	public void testPrepararEnEsteVaso() {
		
		HacedorDeTeConLeche hacedorDeTeConLeche = new HacedorDeTeConLeche();
		Vaso vaso1 = new Vaso();
		vaso1.agregarContenido(Contenido.TE);
		vaso1.agregarContenido(Contenido.LECHE);
		Vaso vaso2 = new Vaso();
		
		vaso2 = hacedorDeTeConLeche.prepararEnEsteVaso(vaso2);
		
		Assert.assertEquals(vaso1.getContenido(), vaso2.getContenido());
		
	}
		

}