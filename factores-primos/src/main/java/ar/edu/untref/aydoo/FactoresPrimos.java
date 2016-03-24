package ar.edu.untref.aydoo;

public class FactoresPrimos {

	public String descomponerEnFactoresPrimos(int numero) {
		String factorizacion = "";

		int factor = 2;
		while (factor <= numero) {
			if ((numero % factor) == 0) {
				factorizacion = factorizacion + Integer.toString(factor) + " ";
				numero = numero / factor;
			} else {
				factor++;
			}

		}
		return factorizacion;
	}
}
