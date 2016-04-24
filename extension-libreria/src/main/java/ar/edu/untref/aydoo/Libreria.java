package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import ar.edu.untref.aydoo.productos.Comprable;
import ar.edu.untref.aydoo.productos.Producto;
import ar.edu.untref.aydoo.productos.ProductoSuscribible;
import ar.edu.untref.aydoo.productos.Suscripcion;

public class Libreria {

	private List<Cliente> clientes;
	private List<Comprable> stock;

	public Libreria() {

		this.clientes = new LinkedList<Cliente>();
		this.stock = new LinkedList<Comprable>();

	}

	public void agregarProducto(Producto producto) {

		stock.add(producto);
	}
	
	public void agregarProducto(ProductoSuscribible producto) {
	
		stock.add(producto);
		Suscripcion suscripcion = new Suscripcion((ProductoSuscribible)producto);
		stock.add(suscripcion);
	}


	public void registrarCliente(Cliente cliente) {

		this.clientes.add(cliente);
	}

	public boolean verificarSiEstaEnStock(Comprable articulo) {

		Iterator<Comprable> iteradorStock = this.stock.iterator();
		while (iteradorStock.hasNext()) {

			Comprable actual = iteradorStock.next();
			
			if (actual.getClass().equals(articulo.getClass())) { //Si los dos tienen la misma clase
				
				if (actual.getClass().equals(Suscripcion.class)) { //Si los dos son suscripciones los comparo con el equals de suscripciones
					
					if (((Suscripcion)actual).equals(articulo)) return true;

				}
				else { //Si los dos son iguales pero no son suscripciones, entonces son productos los dos
					
					if(((Producto)actual).equals(articulo)) return true;
					
				}
			}
		}

		return false;
	}

	public double calcularMontoACobrar(Mes mes, Cliente cliente) {

		this.validarCliente(cliente);
		cliente.getCuenta().agregarTodosLosProductosAdquiridosPorSuscripcion(mes);
		
		return cliente.getCuenta().sumarElMontoTotalDeTodosLosProductos();
	}

	private void validarCliente(Cliente cliente) {

		boolean estaEnLaLista = false;
		Iterator<Cliente> iteradorClientes = this.clientes.iterator();
		while (iteradorClientes.hasNext()) {

			Cliente actual = iteradorClientes.next();
			if(actual.equals(cliente)) {

				estaEnLaLista = true;

			}

		}
		if (!estaEnLaLista) {
			throw new RuntimeException ("El cliente no esta registrado");
		}

	}

}