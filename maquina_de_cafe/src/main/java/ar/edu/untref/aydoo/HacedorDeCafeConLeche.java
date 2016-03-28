package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {

	private Cafetero cafetero;
	private Lechero lechero;
	
	public Vaso prepararEnEsteVaso(Vaso vaso){
		this.cafetero.prepararEnEsteVaso(vaso);
		this.lechero.prepararEnEsteVaso(vaso);
		return vaso;
	}

}