package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class DescomponedorEnFactores {

	public List<Integer> descomponerEnFactoresPrimos(int numeroAFactorizar){
 
		List<Integer> listaDeFactoresPrimos = new ArrayList<Integer>();
		
		int factor = 2;
		while (factor <= numeroAFactorizar){
			if((numeroAFactorizar % factor) == 0){
				listaDeFactoresPrimos.add(factor); 
				numeroAFactorizar = numeroAFactorizar/factor;
			}
			else{
				factor++;
			}     	
		}		
		
		return listaDeFactoresPrimos;	
	}

}