package ar.edu.untref.aydoo;

public class Program {
	public static final void main(String[] args) {

		int numeroAFactorizar = Integer.parseInt(args[0]);
		FactoresPrimos factoresPrimos = new FactoresPrimos();

		String factorizacion = factoresPrimos.descomponerEnFactoresPrimos(numeroAFactorizar);

		System.out.println("Factores primos de " + Integer.toString(numeroAFactorizar) + ": " + factorizacion);

	}
}
