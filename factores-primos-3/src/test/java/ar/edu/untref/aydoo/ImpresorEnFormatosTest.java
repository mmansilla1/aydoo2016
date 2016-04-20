package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ImpresorEnFormatosTest {

	private final String sortASC = "--SORT:ASC";
	private final String sortDES = "--SORT:DES";


	@Test 
	public void imprimirEnFormatoPrettyConElNumero360SinSort() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(5);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 2 2 2 3 3 5 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, "");
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}

	@Test 
	public void imprimirEnFormatoQuietConElNumero360SinSort() {
		
		boolean estaBienImpreso;
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(5);
		String impresionEsperada = "2\n2\n2\n3\n3\n5\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimos, "");
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}	
	
	@Test 
	public void imprimirEnFormatoQuietConElNumero360Ascendente() {
		
		boolean estaBienImpreso;
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(5);
		String impresionEsperada = "2\n2\n2\n3\n3\n5\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimos, sortASC);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoQuietConElNumero90Ascendente() {
		
		boolean estaBienImpreso;
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>(); 
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(5);		
		String impresionEsperada = "2\n3\n3\n5\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimos, sortASC);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoQuietConElNumero360Descendente() {
		
		boolean estaBienImpreso;
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		listaDeFactoresPrimos.add(5);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);		
		String impresionEsperada = "5\n3\n3\n2\n2\n2\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimos, sortDES);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoQuietConElNumero90Descendente() {
		
		boolean estaBienImpreso;
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		listaDeFactoresPrimos.add(5);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(2);
		String impresionEsperada = "5\n3\n3\n2\n";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimos, sortDES);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoPrettyConElNumero360Ascendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(5);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 2 2 2 3 3 5 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sortASC);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoPrettyConElNumero90Ascendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 90;
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(5);	
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 2 3 3 5 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sortASC);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}

	@Test 
	public void imprimirEnFormatoPrettyConElNumero360Descendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 360;
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		listaDeFactoresPrimos.add(5);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		listaDeFactoresPrimos.add(2);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 5 3 3 2 2 2 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sortDES);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}
	
	@Test 
	public void imprimirEnFormatoPrettyConElNumero90Descendente() {
		
		boolean estaBienImpreso;
		int numeroAFactorizar = 90;
		ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		listaDeFactoresPrimos.add(5);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(3);
		listaDeFactoresPrimos.add(2);
		String impresionEsperada = "Factores primos " + Integer.toString(numeroAFactorizar) + ": 5 3 3 2 ";
		
		String impresionObtenida = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sortDES);
		estaBienImpreso = impresionObtenida.equals(impresionEsperada);
		
		Assert.assertTrue(estaBienImpreso);
		
	}	

}