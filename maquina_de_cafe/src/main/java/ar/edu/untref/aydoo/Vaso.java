package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Vaso {
	
	List<Contenido> contenido;	
	private int cantidadAzucar;

	public Vaso(){
		this.contenido = new ArrayList<Contenido>();
	}
	
	public List<Contenido> getContenido() {
		return contenido;
	}

	public void agregarContenido(Contenido contenido) {
		this.contenido.add(contenido);
	}
	
	public int getCantidadAzucar() {
		return cantidadAzucar;
	}

	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}

}