package ar.edu.untref.aydoo;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ImpresorEnFormatos {

	public String imprimirEnFormatoQuietSegunSort(List<Integer> listaDeFactoresPrimos, String sort) {

		String impresionFormatoQuiet = "";

		ordenarLista(listaDeFactoresPrimos, sort);
		Iterator<Integer> itListaFactores = listaDeFactoresPrimos.iterator();
		while (itListaFactores.hasNext()) {
			impresionFormatoQuiet = impresionFormatoQuiet + Integer.toString(itListaFactores.next()) + "\n";
		}

		return impresionFormatoQuiet;
	}

	 public String imprimirEnFormatoPrettySegunSort(int numeroAFactorizar, List<Integer> listaDeFactoresPrimos, String sort){
			
		 String impresionFormatoPretty = "Factores primos " + Integer.toString(numeroAFactorizar) + ": ";
	
		 ordenarLista(listaDeFactoresPrimos, sort);
		 Iterator<Integer> itListaFactores = listaDeFactoresPrimos.iterator();
		 while(itListaFactores.hasNext()){
			 impresionFormatoPretty = impresionFormatoPretty +
			 Integer.toString(itListaFactores.next()) + ' ';
		 }
		
		 return impresionFormatoPretty;
	 }
	
	private List<Integer> ordenarLista(List<Integer> listaDeFactoresPrimos, String sort) {

		switch (sort.toUpperCase()) {
		case "--SORT:ASC":
			Collections.sort(listaDeFactoresPrimos);
			break;
		case "--SORT:DES":
			Comparator<Integer> comparador = Collections.reverseOrder();
			Collections.sort(listaDeFactoresPrimos, comparador);
			break;
		default:
			Collections.sort(listaDeFactoresPrimos);
			break;
		}

		return listaDeFactoresPrimos;
	}

}