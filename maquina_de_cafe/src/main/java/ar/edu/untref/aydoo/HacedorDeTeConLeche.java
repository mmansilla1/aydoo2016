package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {
	
	HacedorDeTe hacedorDeTe;
	Lechero lechero;

	public Vaso prepararEnEsteVaso(Vaso vaso) {
		 this.hacedorDeTe.prepararEnEsteVaso(vaso);
		 this.lechero.prepararEnEsteVaso(vaso);
		 return vaso;
	}

}