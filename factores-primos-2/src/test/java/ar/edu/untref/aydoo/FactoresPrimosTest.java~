package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {

	@Test 
	public void testFactorizacionDe90() {
		
		
		boolean estaBienFactorizado;
		int numero = 90;
		List<Integer> listaDeFactoresPrimosEsperada = new ArrayList<Integer>();
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(5);
		List<Integer> listaDeFactoresPrimosObtenida = new ArrayList<Integer>();		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		
		listaDeFactoresPrimosObtenida = factoresPrimos.descomponerEnFactoresPrimos(numero);
		estaBienFactorizado = listaDeFactoresPrimosObtenida.equals(listaDeFactoresPrimosEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}

	@Test
	public void testFactorizacionDe360() {
		
		boolean estaBienFactorizado;
		int numero = 360;
		List<Integer> listaDeFactoresPrimosEsperada = new ArrayList<Integer>();
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(5);
		List<Integer> listaDeFactoresPrimosObtenida = new ArrayList<Integer>();		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		
		listaDeFactoresPrimosObtenida = factoresPrimos.descomponerEnFactoresPrimos(numero);
		estaBienFactorizado = listaDeFactoresPrimosObtenida.equals(listaDeFactoresPrimosEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}

	@Test 
	public void testImprimirEnFormatoPrettyDe360() {
		
		boolean estaBienImpreso;
		int numero = 360;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		List<Integer> listaDeFactoresPrimosObtenida = factoresPrimos.descomponerEnFactoresPrimos(numero);
		String impresionEsperada = "Factores primos " + Integer.toString(numero) + ": 2 2 2 3 3 5 ";
		
		String impresionObtenida = factoresPrimos.imprimirEnFormatoPretty(numero, listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void testImprimirEnFormatoPrettyDe90() {
		
		boolean estaBienImpreso;
		int numero = 90;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		List<Integer> listaDeFactoresPrimosObtenida = factoresPrimos.descomponerEnFactoresPrimos(numero);
		String impresionEsperada = "Factores primos " + Integer.toString(numero) + ": 2 3 3 5 ";
		
		String impresionObtenida = factoresPrimos.imprimirEnFormatoPretty(numero, listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void testImprimirEnFormatoQuietDe90() {
		
		boolean estaBienImpreso;
		int numero = 90;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		List<Integer> listaDeFactoresPrimosObtenida = factoresPrimos.descomponerEnFactoresPrimos(numero);
		String impresionEsperada = "5\n3\n3\n2\n";
		
		String impresionObtenida = factoresPrimos.imprimirEnFormatoQuiet(listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void testImprimirEnFormatoQuietDe360() {
		
		boolean estaBienImpreso;
		int numero = 360;
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		List<Integer> listaDeFactoresPrimosObtenida = factoresPrimos.descomponerEnFactoresPrimos(numero);
		String impresionEsperada = "5\n3\n3\n2\n2\n2\n";
		
		String impresionObtenida = factoresPrimos.imprimirEnFormatoQuiet(listaDeFactoresPrimosObtenida);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
}
