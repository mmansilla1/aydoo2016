package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {
	
	@Test
	public void elVotoEmitidoEsValido() {
		
		boolean esVotoValido = false;
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
		Votante votante = new Votante("Juan", "Perez", "33333333");
		Candidato candidatoElegido = new Candidato("Pitrola", "Nestor", Partido.OBRERO);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoEmitido(votoElegido);
	
		esVotoValido = mesaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertTrue(esVotoValido);
		
	}

	@Test
	public void elVotoEmitidoNoEsValidoPorCandidatoInexistente() {
		
		boolean esVotoValido = true;
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
		Votante votante = new Votante("Juan", "Perez","33333333");
		Candidato candidatoElegido = new Candidato("Carrio", "Elisa", Partido.CAMBIEMOS);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoEmitido(votoElegido);
	
		esVotoValido = mesaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertFalse(esVotoValido);
		
	}
	
	@Test
	public void elVotoEmitidoEsValidoEnBlanco() {
		
		boolean esVotoValido = false;
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
		Votante votante = new Votante("Juan", "Perez", "33333333");
		Candidato candidatoElegido = new Candidato("", "", null);
		Voto votoElegido = new Voto(candidatoElegido);
		votante.setVotoEmitido(votoElegido);
	
		esVotoValido = mesaElectoral.esVotoValido(votante.emitirVoto());
		
		Assert.assertTrue(esVotoValido);
		
	}
	
	@Test
	public void elCandidatoMasVotadoDeLaMesaEsScioli(){
		
		MesaElectoral mesaElectoral = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
		List<Votante> padronDeLaMesa = mesaElectoral.getPadronDeLaMesa();
		Candidato candidatoScioli = new Candidato("Scioli", "Daniel", Partido.FPV);
		Voto votoScioli = new Voto(candidatoScioli);
		Iterator<Votante> itVotantes = padronDeLaMesa.iterator();
		Votante votanteActual;
		while (itVotantes.hasNext()){
			votanteActual = itVotantes.next(); 
			votanteActual.setVotoEmitido(votoScioli);
			mesaElectoral.recibirVoto(votanteActual);
		}

		Candidato candidatoMasVotadoObtenido = mesaElectoral.getCandidatoMasVotado();
			
		Assert.assertEquals(candidatoScioli, candidatoMasVotadoObtenido);		
		
	}	
		
	@Test
	public void elCandidatoMasVotadoANivelNacionalEsMacri(){
		
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		MesaElectoral mesaElectoralBuenosAires = crearMesaElectoralConVotosScioliBuenosAires();
		MesaElectoral mesaElectoralCABA = crearMesaElectoralConVotosMacriCABA();		
		Candidato candidatoMacri = new Candidato("Mauricio", "Macri", Partido.CAMBIEMOS);
		centroDeComputos.setMesaElectoral(mesaElectoralBuenosAires);
		centroDeComputos.setMesaElectoral(mesaElectoralCABA);
		
		Candidato candidatoMasVotadoObtenido = centroDeComputos.getCandidatoMasVotadoANivelNacional();
			
		Assert.assertTrue(candidatoMacri.equals(candidatoMasVotadoObtenido));		
		
	}
	
	@Test
	public void elPartidoMasVotadoEnBuenosAiresEsCAMBIEMOS(){
		
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		MesaElectoral mesaElectoralBuenosAires = crearMesaElectoralConVotosMacriiBuenosAires();
		MesaElectoral mesaElectoralCABA = crearMesaElectoralConVotosMacriCABA();		
		centroDeComputos.setMesaElectoral(mesaElectoralBuenosAires);
		centroDeComputos.setMesaElectoral(mesaElectoralCABA);
		
		Partido partidoMasVotadoObtenido = centroDeComputos.getPartidoMasVotadoPorProvincia(Provincia.BUENOSAIRES);
			
		Assert.assertEquals(Partido.FPV, partidoMasVotadoObtenido);		
		
	}	
	
	@Test
	public void elPartidoMasVotadoEnBuenosAiresEsCambiemos(){
		
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		MesaElectoral mesaElectoralBuenosAires = crearMesaElectoralConVotosScioliBuenosAires();
		MesaElectoral mesaElectoralCABA = crearMesaElectoralConVotosMacriCABA();
		MesaElectoral mesaElectoralBuenosAires2 = crearMesaElectoralConVotosMacriBuenosAires();
		centroDeComputos.setMesaElectoral(mesaElectoralBuenosAires);
		centroDeComputos.setMesaElectoral(mesaElectoralCABA);
		centroDeComputos.setMesaElectoral(mesaElectoralBuenosAires2);
		
		Partido partidoMasVotadoObtenido = centroDeComputos.getPartidoMasVotadoPorProvincia(Provincia.BUENOSAIRES);
			
		Assert.assertEquals(Partido.CAMBIEMOS, partidoMasVotadoObtenido);		
		
	}
	
	private List<Candidato> crearListaConCandidatosDePrueba(){
		
		List<Candidato> candidatos = new ArrayList<>(); 
		Candidato candidatoFPV1 = new Candidato("Scioli", "Daniel", Partido.FPV);
		candidatos.add(candidatoFPV1);
		Candidato candidatoCambiemos1 = new Candidato("Macri", "Mauricio", Partido.CAMBIEMOS);
		candidatos.add(candidatoCambiemos1);
		Candidato candidatoObrero1 = new Candidato("DelCanio", "Nicolas", Partido.OBRERO);
		candidatos.add(candidatoObrero1);
		Candidato candidatoUna1 = new Candidato("Massa", "Sergio", Partido.UNA);
		candidatos.add(candidatoUna1);
		
		return candidatos;		
	}
	
	private List<Votante> crearListaConVotantesDePruebaBuenosAires() {
		
		List<Votante> padronDeLaMesa = new ArrayList<>();
		Votante votante1 = new Votante("Juan", "Perez", "33333333");
		padronDeLaMesa.add(votante1);
		Votante votante2 = new Votante("Jose", "Lopez", "44444444");
		padronDeLaMesa.add(votante2);
		Votante votante3 = new Votante("Mateo", "Gomez", "55555555");
		padronDeLaMesa.add(votante3);
		Votante votante4 = new Votante("Lucas", "Garcia", "66666666");
		padronDeLaMesa.add(votante4);
		Votante votante5 = new Votante("Gabriel", "Suarez", "77777777");
		padronDeLaMesa.add(votante5);

		return padronDeLaMesa;
	}
	
	private List<Votante> crearListaConVotantesDePruebaCABA() {
		
		List<Votante> padronDeLaMesa = new ArrayList<>();
		Votante votante1 = new Votante("Fernando", "Dorrego", "2900000");
		padronDeLaMesa.add(votante1);
		Votante votante2 = new Votante("Jose", "Vazquez","24000000");
		padronDeLaMesa.add(votante2);
		Votante votante3 = new Votante("Maribel", "Maisano", "22000000");
		padronDeLaMesa.add(votante3);
		Votante votante4 = new Votante("Pedro", "Palacios", "20000000");
		padronDeLaMesa.add(votante4);
		Votante votante5 = new Votante("Gaston", "Lopez", "18000000");
		padronDeLaMesa.add(votante5);
		Votante votante6 = new Votante("Hernan", "Ruiz", "36000000");
		padronDeLaMesa.add(votante6);
		Votante votante7 = new Votante("Facundo", "Rodriguez", "38000000");
		padronDeLaMesa.add(votante7);
		
		return padronDeLaMesa;
	}	

	private MesaElectoral crearMesaElectoralConVotosScioliBuenosAires(){ 
	
		MesaElectoral mesaElectoralBuenosAires = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires());
		List<Votante> padronDeLaMesaBuenosAires = mesaElectoralBuenosAires.getPadronDeLaMesa();
		Candidato candidatoScioli = new Candidato("Daniel", "Scioli", Partido.FPV);
		Voto votoScioli = new Voto(candidatoScioli);
		Iterator<Votante> itVotantesBuenosAires = padronDeLaMesaBuenosAires.iterator();
		Votante votanteActualBuenosAires;
		while (itVotantesBuenosAires.hasNext()){
			votanteActualBuenosAires = itVotantesBuenosAires.next(); 
			votanteActualBuenosAires.setVotoEmitido(votoScioli);
			mesaElectoralBuenosAires.recibirVoto(votanteActualBuenosAires);
		}
		
		return mesaElectoralBuenosAires;
	
	}
	
	private MesaElectoral crearMesaElectoralConVotosMacriCABA(){ 
		
		MesaElectoral mesaElectoralCABA = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.CABA, crearListaConVotantesDePruebaCABA());
		List<Votante> padronDeLaMesaCABA = mesaElectoralCABA.getPadronDeLaMesa();
		Candidato candidatoMacri = new Candidato("Mauricio", "Macri", Partido.CAMBIEMOS);
		Voto votoMacri = new Voto(candidatoMacri);
		Iterator<Votante> itVotantesCABA = padronDeLaMesaCABA.iterator();
		Votante votanteActualCABA;
		while (itVotantesCABA.hasNext()){
			votanteActualCABA = itVotantesCABA.next(); 
			votanteActualCABA.setVotoEmitido(votoMacri);
			mesaElectoralCABA.recibirVoto(votanteActualCABA);
		}

		return mesaElectoralCABA;
		
	}

	private MesaElectoral crearMesaElectoralConVotosMacriBuenosAires(){ 
		
		MesaElectoral mesaElectoralBuenosAires = new MesaElectoral(crearListaConCandidatosDePrueba(), Provincia.BUENOSAIRES, crearListaConVotantesDePruebaBuenosAires2());
		List<Votante> padronDeLaMesaBuenosAires = mesaElectoralBuenosAires.getPadronDeLaMesa();
		Candidato candidatoMacri = new Candidato("Mauricio", "Macri", Partido.CAMBIEMOS);
		Voto votoMacri = new Voto(candidatoMacri);
		Iterator<Votante> itVotantesBuenosAires = padronDeLaMesaBuenosAires.iterator();
		Votante votanteActualBuenosAires;
		while (itVotantesBuenosAires.hasNext()){
			votanteActualBuenosAires = itVotantesBuenosAires.next(); 
			votanteActualBuenosAires.setVotoEmitido(votoMacri);
			mesaElectoralBuenosAires.recibirVoto(votanteActualBuenosAires);
		}

		return mesaElectoralBuenosAires;
		
	}	
	
	private List<Votante> crearListaConVotantesDePruebaBuenosAires2() {
		
		List<Votante> padronDeLaMesa = new ArrayList<>();
		Votante votante1 = new Votante("Rosa", "Garcia", "5000000");
		padronDeLaMesa.add(votante1);
		Votante votante2 = new Votante("Jose", "Lopez", "31000000");
		padronDeLaMesa.add(votante2);
		Votante votante3 = new Votante("Mateo", "Gomez", "32000000");
		padronDeLaMesa.add(votante3);
		Votante votante4 = new Votante("Lucas", "Garcia", "33000000");
		padronDeLaMesa.add(votante4);
		Votante votante5 = new Votante("Gabriel", "Suarez", "34000000");
		padronDeLaMesa.add(votante5);
		Votante votante6 = new Votante("Juan", "Toloza", "38000000");
		padronDeLaMesa.add(votante6);
		
		return padronDeLaMesa;
	}

	
}