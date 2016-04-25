package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import ar.edu.untref.aydoo.productos.Comprable;
import ar.edu.untref.aydoo.productos.Producto;
import ar.edu.untref.aydoo.productos.ProductoSuscribible;
import ar.edu.untref.aydoo.productos.Suscripcion;

public class Compra {

	private List<Comprable> articulosComprados;
	private Mes mes;
	
	public Compra(Mes mes) {
		
		this.articulosComprados = new LinkedList<Comprable>();
		this.mes = mes;
	}
	
	//Sobrecargo el constructor para poder crear compras ficticias que luego ire llenando. Esas nunca se guardan en ningun lado
	public Compra() {
		
		this.articulosComprados = new LinkedList<Comprable>();
	}

	public void agregarArticulo(Comprable articulo) {
		
		this.articulosComprados.add(articulo);
	}
	
	public boolean contiene(Comprable articulo) {
		
		Iterator<Comprable> iteradorArticulosComprados = articulosComprados.iterator();
		while(iteradorArticulosComprados.hasNext()) {
		
			Comprable actual = iteradorArticulosComprados.next();
			if(actual.getClass().equals(articulo.getClass())) {
				
				if ((actual.getClass().equals(Suscripcion.class)) && (articulo.getClass().equals(Suscripcion.class))) { 
					
					//Si los dos son suscripciones y son iguales (utiliza el equals de la suscripcion)
					if( ((Suscripcion)actual).equals((Suscripcion)articulo)) return true;
					
				} 
				else {
					
					//Si los dos son productos y son iguales
					if( ((Producto)actual).equals((Producto)articulo)) return true;
					
				}
				
			}
		
		}
		
		//Si se termino de recorrer y no se encontraron coincidencias
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		
		Compra otraCompra = (Compra) obj;
		
		boolean sonIguales = this.mes.equals(otraCompra.getMes());

		for(int i = 0; i < this.articulosComprados.size() && sonIguales; i++) {
			
			Comprable unaCompra = this.articulosComprados.get(i);
			sonIguales = otraCompra.contiene(unaCompra);
			
		}
		
		return sonIguales;
	}

	public List<ProductoSuscribible> obtenerListaDeArticulosSuscribibles() {
		
		List<ProductoSuscribible> articulosSuscribibles = new LinkedList<ProductoSuscribible>();
		
		Iterator<Comprable> iteradorArticulos = this.articulosComprados.iterator();
		while (iteradorArticulos.hasNext()) {
			
			Comprable actual = iteradorArticulos.next();
			if(actual.getClass().equals(Suscripcion.class)) {
				
				articulosSuscribibles.add(((Suscripcion)actual).getArticulo());
				
			}
			
		}
		
		return articulosSuscribibles;
	}

	public double obtenerMontoTotal() {
		
		double montoAcumulado = 0;
		
		for(Comprable articuloComprado : this.articulosComprados) {
			
			montoAcumulado += articuloComprado.calcularPrecioFinal();
		}

		return montoAcumulado;
	}
	
	public Mes getMes() {
		
		return this.mes;
	}

	public void setMes(Mes mes) {
		
		this.mes = mes;
	}
	
}