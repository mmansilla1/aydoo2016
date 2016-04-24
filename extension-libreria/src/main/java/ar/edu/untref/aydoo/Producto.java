package ar.edu.untref.aydoo;

public abstract class Producto implements Comprable {
	
	protected String nombre;
	protected double precio;
	
	public double calcularPrecioFinal() {
		
		return this.precio;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		Producto producto = (Producto) obj;
		return producto.getNombre() == this.getNombre() 
				&& producto.getClass().equals(this.getClass());
	}
	
	
	

}
