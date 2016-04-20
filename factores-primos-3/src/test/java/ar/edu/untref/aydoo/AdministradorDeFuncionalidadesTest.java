package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class AdministradorDeFuncionalidadesTest {

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentos() {
		
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "--OUTPUT-FILE:ARCHIVOSALIDA.TXT";
		
		String[] args = {"360", formatoEsperado, sortEsperado, outputEsperado};
		AdministradorDeFuncionalidades administradorDeFuncionalidades = new AdministradorDeFuncionalidades(args);
		
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentosEnDistintoOrden1() {
		
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "--OUTPUT-FILE:ARCHIVOSALIDA.TXT";
		
		String[] args = {"360", sortEsperado, outputEsperado, formatoEsperado};
		AdministradorDeFuncionalidades administradorDeFuncionalidades = new AdministradorDeFuncionalidades(args);
		
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentosEnDistintoOrden2() {
		
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "--OUTPUT-FILE:ARCHIVOSALIDA.TXT";
		
		String[] args = {"360", outputEsperado, sortEsperado, formatoEsperado};
		AdministradorDeFuncionalidades administradorDeFuncionalidades = new AdministradorDeFuncionalidades(args);
		
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentosSinOutput() {
		
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "";
		
		String[] args = {"360", sortEsperado, formatoEsperado};
		AdministradorDeFuncionalidades administradorDeFuncionalidades = new AdministradorDeFuncionalidades(args);
		
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentosSinSort() {
		
		String formatoEsperado = "--FORMAT=PRETTY";
		String sortEsperado = "";
		String outputEsperado = "--OUTPUT-FILE:ARCHIVOSALIDA.TXT";
		
		String[] args = {"360", outputEsperado, formatoEsperado};
		AdministradorDeFuncionalidades administradorDeFuncionalidades = new AdministradorDeFuncionalidades(args);
		
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

	@Test
	public void obtenerFuncionalidadesDesdeArrayDeArgumentosSinFormat() {
		
		String formatoEsperado = "";
		String sortEsperado = "--SORT:ASC";
		String outputEsperado = "--OUTPUT-FILE:ARCHIVOSALIDA.TXT";
		
		String[] args = {"360", outputEsperado, sortEsperado};
		AdministradorDeFuncionalidades administradorDeFuncionalidades = new AdministradorDeFuncionalidades(args);
		
		String formatObtenido = administradorDeFuncionalidades.getFormat();
		String sortObtenido = administradorDeFuncionalidades.getSort();
		String outputObtenido = administradorDeFuncionalidades.getOutput();
		
		Assert.assertEquals(formatoEsperado, formatObtenido);
		Assert.assertEquals(sortEsperado, sortObtenido);
		Assert.assertEquals(outputEsperado, outputObtenido);
		
	}

}