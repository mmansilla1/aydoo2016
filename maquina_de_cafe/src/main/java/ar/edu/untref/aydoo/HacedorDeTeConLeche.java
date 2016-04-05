package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {
	
	HacedorDeTe hacedorDeTe;
	Lechero lechero;

	public HacedorDeTeConLeche(){
		hacedorDeTe = new HacedorDeTe();
		lechero = new Lechero();
	}
	
	public Vaso prepararEnEsteVaso(Vaso vaso) {
		 this.hacedorDeTe.prepararEnEsteVaso(vaso);
		 this.lechero.prepararEnEsteVaso(vaso);
		 return vaso;
	}

}