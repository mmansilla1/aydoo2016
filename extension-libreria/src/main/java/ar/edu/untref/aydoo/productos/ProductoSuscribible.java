package ar.edu.untref.aydoo.productos;

public abstract class ProductoSuscribible extends Producto {
	
	private int periodicidad;
	
	public ProductoSuscribible (String nombre, int periodicidad, double precio) {
		
		this.nombre = nombre;
		this.periodicidad = periodicidad;
		this.precio = precio;
		
	}
	
	public int getPeriodicidad() {
		
		return this.periodicidad;
	}
	
	public void aplicarDescuento(int descuento) {
		
		this.precio = (this.precio - (this.precio*descuento/100));
	}

}