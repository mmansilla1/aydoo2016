package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DescomponedorEnFactoresTest {


	@Test
	public void descomponerEnFactoresPrimosElNumero2() {
		
		boolean estaBienFactorizado;
		int numeroAFactorizar = 2;
		List<Integer> listaDeFactoresPrimosEsperada = new ArrayList<Integer>();
		listaDeFactoresPrimosEsperada.add(2);
		List<Integer> listaDeFactoresPrimosObtenida = new ArrayList<Integer>();		
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		
		listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		estaBienFactorizado = listaDeFactoresPrimosObtenida.equals(listaDeFactoresPrimosEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}
	
	@Test 
	public void descomponerEnFactoresPrimosElNumero90() {
		
		boolean estaBienFactorizado;
		int numeroAFactorizar = 90;
		List<Integer> listaDeFactoresPrimosEsperada = new ArrayList<Integer>();
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(5);
		List<Integer> listaDeFactoresPrimosObtenida = new ArrayList<Integer>();		
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		
		listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		estaBienFactorizado = listaDeFactoresPrimosObtenida.equals(listaDeFactoresPrimosEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}

	@Test
	public void descomponerEnFactoresPrimosElNumero360() {
		
		boolean estaBienFactorizado;
		int numeroAFactorizar = 360;
		List<Integer> listaDeFactoresPrimosEsperada = new ArrayList<Integer>();
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(2);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(3);
		listaDeFactoresPrimosEsperada.add(5);
		List<Integer> listaDeFactoresPrimosObtenida = new ArrayList<Integer>();		
		DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
		
		listaDeFactoresPrimosObtenida = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
		estaBienFactorizado = listaDeFactoresPrimosObtenida.equals(listaDeFactoresPrimosEsperada);
		
		Assert.assertTrue(estaBienFactorizado);
		
	}

}