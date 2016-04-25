package ar.edu.untref.aydoo.productos;

public class AlquilerDiario extends TipoAlquiler {

	private static final int CANTIDAD_MINIMA_DE_DIAS = 3;
	private static final int CANTIDAD_MAXIMA_DE_DIAS = 25;
	
	private static final double PRECIO_FIJO_POR_DIA = 10.0;

	@Override
	public boolean permitePeriodo(int duracion) {

		return duracion >= CANTIDAD_MINIMA_DE_DIAS && duracion <= CANTIDAD_MAXIMA_DE_DIAS;
	}

	@Override
	public double obtenerCosto(int duracion) {
		return duracion * PRECIO_FIJO_POR_DIA;
	}

}