package ar.edu.untref.aydoo.productos;

public class Alquiler implements Comprable {

	private Libro libro;
	private TipoAlquiler tipo;
	private int duracion;
	
	public Alquiler(Libro libro, TipoAlquiler tipo, int duracion) {

		if (tipo.permitePeriodo(duracion)) {
			
			this.libro = libro;
			this.tipo = tipo;
			this.duracion = duracion;

		} else {
			throw new RuntimeException("No se puede crear un alquiler de ese Tipo con esa duracion");
		}
		
	}

	public Libro getLibro() {
		return libro;
	}

	@Override
	public double calcularPrecioFinal() {
		return this.tipo.obtenerCosto(this.duracion);
	}

}