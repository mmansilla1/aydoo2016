package ar.edu.untref.aydoo;

import org.junit.BeforeClass;
import org.junit.Test;

import ar.edu.untref.aydoo.productos.ArticuloDeLibreria;
import ar.edu.untref.aydoo.productos.Diario;
import ar.edu.untref.aydoo.productos.Libro;
import ar.edu.untref.aydoo.productos.Revista;
import ar.edu.untref.aydoo.productos.Suscripcion;

import org.junit.Assert;

public class IntegracionTest {
	
	private static Libreria libreria;
	
	@BeforeClass
	public static void prepararDatosDePrueba() {
		
		//Armo el stock
		libreria = new Libreria();
		Revista barcelona = new Revista("Barcelona", 2, 20);
		Revista grafico = new Revista("El Grafico", 1, 30);
		Libro hobbit = new Libro("El Hobbit", 50);
		ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Lapicera", 5);
		Diario pagina12 = new Diario("Pagina12", 30, 12);
		Diario clarin = new Diario("Clarin", 30, 13);
		libreria.agregarProducto(barcelona);
		libreria.agregarProducto(grafico);
		libreria.agregarProducto(hobbit);
		libreria.agregarProducto(lapicera);
		libreria.agregarProducto(pagina12);
		libreria.agregarProducto(clarin);
		
		//Creo a los clientes
		Cliente juan = new Cliente(libreria, "Juan", "Perez", "Rivadavia 9921" );
		Cliente maria = new Cliente(libreria, "Maria", "Dominguez", "Urquiza 245");
		libreria.registrarCliente(juan);
		libreria.registrarCliente(maria);
		
	}
	
	@Test
	public void compraDeJuan() {
		
		Cliente juan = new Cliente(libreria, "Juan", "Perez", "Rivadavia 9921" );
		Libro hobbit = new Libro("El Hobbit", 50);
		ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Lapicera", 5);
		Revista grafico = new Revista("El Grafico", 1, 30);
		
		juan.agregarALaCanasta(hobbit);
		juan.agregarALaCanasta(lapicera);
		juan.agregarALaCanasta(lapicera);
		juan.agregarALaCanasta(grafico);
		
		juan.efectuarCompra(Mes.AGOSTO);
		
		Assert.assertEquals(92.1, libreria.calcularMontoACobrar(Mes.AGOSTO, juan),0);
		
	}
	
	@Test
	public void compraDeMaria() {
		
		Cliente maria = new Cliente(libreria, "Maria", "Dominguez", "Urquiza 245");
		Revista barcelona = new Revista("Barcelona", 2, 20);
		Suscripcion suscripcionABarcelona = new Suscripcion(barcelona);
		Diario pagina12 = new Diario("Pagina12", 30, 12);
		
		maria.agregarALaCanasta(suscripcionABarcelona);
		maria.agregarALaCanasta(pagina12);
		
		maria.efectuarCompra(Mes.ENERO);
		
		Assert.assertEquals(44, libreria.calcularMontoACobrar(Mes.ENERO, maria),0);
		
	}
	
}
