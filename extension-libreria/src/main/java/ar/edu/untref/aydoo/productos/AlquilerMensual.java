package ar.edu.untref.aydoo.productos;

public class AlquilerMensual extends TipoAlquiler {

	private static final int CANTIDAD_MINIMA_DE_MESES = 1;
	private static final int CANTIDAD_MAXIMA_DE_MESES = 3;
	
	public static final double PRECIO_FIJO_POR_MES = 200.0;


	@Override
	public boolean permitePeriodo(int duracion) {

		return duracion >= CANTIDAD_MINIMA_DE_MESES && duracion <= CANTIDAD_MAXIMA_DE_MESES;
	}


	@Override
	public double obtenerCosto(int duracion) {
		return duracion * PRECIO_FIJO_POR_MES;
	}

}