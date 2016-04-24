package ar.edu.untref.aydoo.productos;

public class Suscripcion implements Comprable {
	
	private ProductoSuscribible articulo;
	//Se asume que las suscripciones solo pueden ser anuales, ya que el enunciado no lo especifica

	public Suscripcion(ProductoSuscribible articulo) {
		
		this.articulo = articulo;
	}
	
	public ProductoSuscribible getArticulo() {
		
		return this.articulo;
	}

	@Override
	public boolean equals(Object obj) {
		
		Suscripcion suscripcion = (Suscripcion) obj;
		return suscripcion.getArticulo().equals(this.getArticulo());
	}
	
}