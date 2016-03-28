package ar.edu.untref.aydoo;

public class Cafetero {

	public Vaso prepararEnEsteVaso(Vaso vaso) {
		vaso.agregarContenido(Contenido.CAFE);
		return vaso;
	}

}