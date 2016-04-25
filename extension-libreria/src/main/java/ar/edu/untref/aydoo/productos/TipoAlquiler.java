package ar.edu.untref.aydoo.productos;

public abstract class TipoAlquiler {

	public abstract boolean permitePeriodo(int duracion);
	
	public abstract double obtenerCosto(int duracion);
	
}