package ar.edu.untref.aydoo.productos;

public abstract class ProductoConIVA extends Producto {

	private final int iva = 21; //Se guarda la tasa en porcentaje: por ej. 21
	
	@Override
	public double calcularPrecioFinal() {
		
		double precioFinal = this.precio + ((this.precio)*(this.iva)/100);
		return precioFinal;
		
	}

	
}