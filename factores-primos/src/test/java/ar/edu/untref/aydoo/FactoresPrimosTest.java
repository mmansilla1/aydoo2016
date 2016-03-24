package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {

	@Test
	public void testFactorizacionDe120() {
		
		int numeroAFactorizar = 120;
		String factorizacionEsperada = "2 2 2 3 5 ";
		String factorizacion = "";
		boolean estaBienFactorizado;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		
		factorizacion = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);
		estaBienFactorizado = factorizacion.equals(factorizacionEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}

	@Test
	public void testFactorizacionDe360() {
		
		int numeroAFactorizar = 360;
		String factorizacionEsperada = "2 2 2 3 3 5 ";
		String factorizacion = "";
		boolean estaBienFactorizado;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		
		factorizacion = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);
		estaBienFactorizado = factorizacion.equals(factorizacionEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}
	
	@Test
	public void testFactorizacionDe150() {
		
		int numeroAFactorizar = 150;
		String factorizacionEsperada = "2 3 5 5 ";
		String factorizacion = "";
		boolean estaBienFactorizado;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		
		factorizacion = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);
		estaBienFactorizado = factorizacion.equals(factorizacionEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}


}