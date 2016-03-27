package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FactoresPrimos {

	public List<Integer> descomponerEnFactoresPrimos(int numero){
 
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		
		int factor = 2;
		while (factor <= numero){
			if((numero % factor) == 0){
				listaDeFactoresPrimos.add(factor); 
				numero = numero/factor;
			}
			else{
				factor++;
			}     
			
		}		
		return listaDeFactoresPrimos;	
	}

	public String imprimirEnFormatoPretty(int numero, List<Integer> listaDeFactoresPrimos){
		
		String impresionFormatoPretty = "Factores primos "  + Integer.toString(numero) + ": ";
		
		Iterator<Integer> itListaFactores = listaDeFactoresPrimos.iterator();
		while(itListaFactores.hasNext()){
			impresionFormatoPretty = impresionFormatoPretty + Integer.toString(itListaFactores.next()) + ' ';
		}
		
		return impresionFormatoPretty;
	}

	public String imprimirEnFormatoQuiet(List<Integer> listaDeFactoresPrimos) {

		String impresionFormatoQuiet = "";
		
		ListIterator<Integer> itListaFactores = listaDeFactoresPrimos.listIterator(listaDeFactoresPrimos.size());
			
		while (itListaFactores.hasPrevious()){
				impresionFormatoQuiet = impresionFormatoQuiet + Integer.toString(itListaFactores.previous()) + "\n"; 
		}
		
		return impresionFormatoQuiet;
	
	}


}
