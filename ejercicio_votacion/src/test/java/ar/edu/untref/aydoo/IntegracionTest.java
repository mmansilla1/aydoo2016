package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {
	
	@Test
	public void elVotoEsValido() {
		
		boolean esVotoValido = false;
		List<Candidato> candidatosPosibles = crearListaConCandidatosDePrueba();
		JuntaElectoral juntaElectoral = new JuntaElectoral(candidatosPosibles, Provincia.BUENOSAIRES);
		Votante votante = new Votante("Juan", "Perez", "33333333");
		Candidato candidatoElegido = new Candidato("Pitrola", "Nestor", Partido.OBRERO);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoElegido(votoElegido);
	
		esVotoValido = juntaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertTrue(esVotoValido);
		
	}

	@Test
	public void elVotoEsInvalidoPorCandidatoQueNoExiste() {
		
		boolean esVotoValido = true;
		List<Candidato> candidatosPosibles = crearListaConCandidatosDePrueba();
		JuntaElectoral juntaElectoral = new JuntaElectoral(candidatosPosibles, Provincia.BUENOSAIRES);
		Votante votante = new Votante("Juan", "Perez", "33333333");
		Candidato candidatoElegido = new Candidato("Sanz", "Eduardo", Partido.CAMBIEMOS);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoElegido(votoElegido);
	
		esVotoValido = JuntaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertFalse(esVotoValido);
		
	}
	
	@Test
	public void elVotoEsValidoEnBlanco() {
		
		boolean esVotoValido = false;
		List<Candidato> candidatosPosibles = crearListaConCandidatosDePrueba();
		JuntaElectoral juntaElectoral = new JuntaElectoral(candidatosPosibles, Provincia.BUENOSAIRES);
		Votante votante = new Votante("Juan", "Perez", "33333333");
		Candidato candidatoElegido = new Candidato("", "", null);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoElegido(votoElegido);
	
		esVotoValido = juntaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertTrue(esVotoValido);
		
	}
	