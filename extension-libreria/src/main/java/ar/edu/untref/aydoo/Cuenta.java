package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import ar.edu.untref.aydoo.productos.Comprable;
import ar.edu.untref.aydoo.productos.ProductoSuscribible;

public class Cuenta {

	//Se asume que las cuentas se renuevan cada mes. Esto lo hace la libreria
	private List<Compra> compras;

	public Cuenta () {

		this.compras = new LinkedList<Compra>();
	}

	public void agregarCompra(Compra compra) {

		this.compras.add(compra);
	}

	public boolean contiene(Compra compra) {

		boolean encontrado = false;
		
		for(int i = 0 ; i < this.compras.size() && !encontrado ; i++) {
			
			Compra unaCompra = this.compras.get(i);
			encontrado = compra.equals(unaCompra);
		}
		
		return encontrado;
	}

	public void agregarTodosLosProductosAdquiridosPorSuscripcion(Mes mes) {

		Compra compraDeTodosLosArticulosSuscriptos = new Compra(mes);
		List<ProductoSuscribible> listaDeArticulosSuscriptos = this.obtenerListaDeArticulosSuscriptosEnLaCuenta(mes);
		Iterator<ProductoSuscribible> iteradorDeArticulosSuscriptos = listaDeArticulosSuscriptos.iterator();
		while (iteradorDeArticulosSuscriptos.hasNext()) {

			ProductoSuscribible actual = iteradorDeArticulosSuscriptos.next();
			actual.aplicarDescuento(20);
			for(int i=0; i < actual.getPeriodicidad(); i++) { //Lo agrego tantas veces como se haya comprado por la suscripcion
				
				compraDeTodosLosArticulosSuscriptos.agregarArticulo((Comprable)actual); //Podria evitar este casteo haciendo que Suscribible herede de COmprable pero es una relacion que queda como innecesaria
			
			}
			
		}
		
		this.compras.add(compraDeTodosLosArticulosSuscriptos);
	}

	private List<ProductoSuscribible> obtenerListaDeArticulosSuscriptosEnLaCuenta(Mes mes) {

		List<ProductoSuscribible> articulosSuscriptos = new LinkedList<ProductoSuscribible>();
		Iterator<Compra> iteradorCompras = this.compras.iterator();
		while (iteradorCompras.hasNext()) {

			Compra actual = iteradorCompras.next();
			//Filtro por mes
			if (actual.getMes().equals(mes)) {
				
				//Pido la lista de articulos suscriptos a cada compra y las concateno en una sola lista
				articulosSuscriptos.addAll(actual.obtenerListaDeArticulosSuscribibles());
			
			}
		}

		return articulosSuscriptos;
	}

	public double sumarElMontoTotalDeTodosLosProductos() {
		
		double montoAcumulado=0;
		
		Iterator<Compra> iteradorCompras = this.compras.iterator();
		while(iteradorCompras.hasNext()) {
			
			Compra actual = iteradorCompras.next();
			montoAcumulado += actual.obtenerMontoTotal();
			
		}
		return montoAcumulado;
		
	}

}