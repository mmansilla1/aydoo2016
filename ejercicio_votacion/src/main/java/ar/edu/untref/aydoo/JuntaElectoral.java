package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class JuntaElectoral {

	private List<Voto> urnaElectoral;
	private List<Candidato> candidatos;
	private Provincia provincia;
	private List<Votante> padron;

	public JuntaElectoral(List<Candidato> candidatos, Provincia provincia){
		Candidato candidatoEnBlanco = new Candidato("", "",null);
		this.urnaElectoral = new ArrayList<Voto>();
		this.candidatos = candidatos;
		this.candidatos.add(candidatoEnBlanco);
		this.provincia = provincia;
		this.padron = padron;
	}

	public List<Candidato> getCandidatos(){
		return this.candidatos;
	}
	
	public void recibirVoto(Votante votante){
		urnaElectoral.add(votante.emitirVoto());
	}
	
	public Candidato getCandidatoMasVotado(){
		
		Candidato candidatoMasVotado = null;
		HashMap<Candidato, Integer> recuentoVotosPorCandidato = getRecuentoDeVotosTotal();		
		return candidatoMasVotado;
	}
	
	private HashMap<Candidato, Integer> getRecuentoDeVotosTotal() {
		
		HashMap<Candidato, Integer> recuentoVotosPorCandidato = new HashMap<Candidato, Integer>();
		Candidato candidatoVotado;
		
		int cantidadDeVotos;
		Iterator<Voto> iteracionUrna = urnaElectoral.iterator();
		while (iteracionUrna.hasNext()){
			candidatoVotado = iteracionUrna.next().getCandidato();
			if (recuentoVotosPorCandidato.get(candidatoVotado) == null){
				cantidadDeVotos = 1;
			}else{
				cantidadDeVotos = recuentoVotosPorCandidato.get(candidatoVotado) + 1;
			}
			recuentoVotosPorCandidato.put(candidatoVotado, cantidadDeVotos);	
		}		
		return recuentoVotosPorCandidato;
	}

	public boolean elVotoEsValido(Voto voto) {
		
		boolean encontrado = false;
		Iterator<Candidato> iteracionDeCandidatos = Candidatos.iterator();
		while (iteracionDeCandidatos.hasNext() && !encontrado){
			if (voto.getCandidato().equals(iteracionDeCandidatos.next())){
				encontrado = true;
			}
		}
		return encontrado;
	}	
}