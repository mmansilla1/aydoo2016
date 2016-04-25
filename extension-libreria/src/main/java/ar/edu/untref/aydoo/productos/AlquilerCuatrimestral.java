package ar.edu.untref.aydoo.productos;

public class AlquilerCuatrimestral extends TipoAlquiler {

	private static final int UN_CUATRIMESTRE = 1;
	private static final int DOS_CUATRIMESTRES = 2;
	private static final int DESCUENTO_POR_CUATRIMESTRE = 10;
	private static final int MESES_EN_UN_CUATRIMESTRE = 4;

	@Override
	public boolean permitePeriodo(int duracion) {

		return duracion == UN_CUATRIMESTRE || duracion == DOS_CUATRIMESTRES;
	}

	@Override
	public double obtenerCosto(int duracion) {
		
		double costoMensual = calcularCostoMensual(duracion);
		
		return costoMensual - calcularDescuento(costoMensual, duracion);
	}

	private double calcularCostoMensual(int duracion) {
		return duracion * MESES_EN_UN_CUATRIMESTRE * AlquilerMensual.PRECIO_FIJO_POR_MES;
	}

	private double calcularDescuento(double costoMensual, int duracion) {
		
		double porcentajeADescontar = duracion * (DESCUENTO_POR_CUATRIMESTRE / 100.0);
		
		return costoMensual * porcentajeADescontar;
	}

}