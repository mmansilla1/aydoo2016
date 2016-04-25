package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.productos.Alquiler;
import ar.edu.untref.aydoo.productos.AlquilerCuatrimestral;
import ar.edu.untref.aydoo.productos.AlquilerDiario;
import ar.edu.untref.aydoo.productos.AlquilerMensual;
import ar.edu.untref.aydoo.productos.Libro;

public class AlquilerTest {

	private Libro libroDePrueba = new Libro("Harry Potter II", 1000);
		
	@Test
	public void elAlquilerDiarioPermiteUnPeriodoDe3Dias() {
		
		 new Alquiler(libroDePrueba, new AlquilerDiario(), 3);
	}
	
	@Test
	public void elAlquilerDiarioPermiteUnPeriodoDe25Dias() {
		
		 new Alquiler(libroDePrueba, new AlquilerDiario(), 25);
	}
	
	@Test(expected = RuntimeException.class)
	public void elAlquilerDiarioNoPermiteUnPeriodoDeMasDe25Dias() {
		
		 new Alquiler(libroDePrueba, new AlquilerDiario(), 26);
	}

	@Test(expected = RuntimeException.class)
	public void elAlquilerDiarioNoPermiteUnPeriodoDeMenosDe3Dias() {
		
		 new Alquiler(libroDePrueba, new AlquilerDiario(), 2);
	}
	
		
	@Test
	public void elAlquilerMensualPermiteUnPeriodoDe1Mes() {
		
		 new Alquiler(libroDePrueba, new AlquilerMensual(), 1);
	}
	
	@Test
	public void elAlquilerMensualPermiteUnPeriodoDe3Meses() {
		
		 new Alquiler(libroDePrueba, new AlquilerMensual(), 3);
	}
	
	@Test
	public void elAlquilerMensualPermiteUnPeriodoDeMenosDe1Mes() {
		
		 new Alquiler(libroDePrueba, new AlquilerMensual(), 1);
	}
	
	@Test(expected = RuntimeException.class)
	public void elAlquilermensualNoPermiteUnPeriodoDeMasDe4Meses() {
		
		 new Alquiler(libroDePrueba, new AlquilerMensual(), 4);
	}
	
	@Test
	public void elAlquilerCuatrimestralPermiteUnPeriodoDe1Cuatrimestre() {
		
		 new Alquiler(libroDePrueba, new AlquilerCuatrimestral(), 1);
	}
	
	@Test
	public void elAlquilerCuatrimestralPermiteUnPeriodoDe2Cuatrimestres() {
		
		 new Alquiler(libroDePrueba, new AlquilerCuatrimestral(), 2);
	}
	
	@Test(expected = RuntimeException.class)
	public void elAlquilermensualNoPermiteUnPeriodoDeMasDe2Cuatrimestres() {
		
		 new Alquiler(libroDePrueba, new AlquilerCuatrimestral(), 3);
	}
	
	@Test
	public void unAlquilerDiarioDe5DiasTieneUnCostoFinalDe50() {
		
		Alquiler alquiler = new Alquiler(libroDePrueba, new AlquilerDiario(), 5);
		
		Assert.assertEquals(50, alquiler.calcularPrecioFinal(), 5);
	}
	
	@Test
	public void unAlquilerMensualDe2MesesTieneUnCostoFinalDe400() {
		
		Alquiler alquiler = new Alquiler(libroDePrueba, new AlquilerMensual(), 2);
		
		Assert.assertEquals(400, alquiler.calcularPrecioFinal(), 2);
	}
	
	@Test
	public void unAlquilerCuatrimestralDe1CuatrimestreTieneUnDescuentoDel10Porciento() {
		
		Alquiler alquiler = new Alquiler(libroDePrueba, new AlquilerCuatrimestral(), 1);
		
		Assert.assertEquals(720, alquiler.calcularPrecioFinal(), 1);
	}
	
	@Test
	public void unAlquilerCuatrimestralDe2CuatrimestresTieneUnDescuentoDel20Porciento() {
		
		Alquiler alquiler = new Alquiler(libroDePrueba, new AlquilerCuatrimestral(), 2);
		
		Assert.assertEquals(1280, alquiler.calcularPrecioFinal(), 2);
	}
	
}