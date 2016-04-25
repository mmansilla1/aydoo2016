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
	public double calcularPrecioFinal() {
		
		/* No ses debe tener en cuenta el precio de las Suscripciones dado que, en este modelo,
		 * la Cuenta se encarga de generar tantos Productos para el Mes como resulten de la Suscripción,
		 * teniendo en cuenta el precio final de cada uno de esos productos por separado.
		 */
		
		return 0;
	}	
	
	@Override
	public boolean equals(Object obj) {
		
		Suscripcion suscripcion = (Suscripcion) obj;
		return suscripcion.getArticulo().equals(this.getArticulo());
	}

}