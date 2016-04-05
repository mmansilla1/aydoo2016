package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class MesaElectoral {

	private List<Voto> urna;
	private List<Candidato> listaDeCandidatos;
	private Provincia provincia;
	private List<Votante> padronDeLaMesa;

	public MesaElectoral(List<Candidato> candidatos, Provincia provincia, List<Votante> padronDeLaMesa){
		Candidato candidatoEnBlanco = new Candidato("", "",null);
		this.urna = new ArrayList<Voto>();
		this.listaDeCandidatos = candidatos;
		this.listaDeCandidatos.add(candidatoEnBlanco);
		this.setProvincia(provincia);
		this.padronDeLaMesa = padronDeLaMesa;
	}

	public List<Candidato> getListaDeCandidatos(){
		return this.listaDeCandidatos;
	}
	
	public void recibirVoto(Votante votante){
		urna.add(votante.emitirVoto());
	}
	
	public Candidato getCandidatoMasVotado(){
		
		Candidato candidatoMasVotado = null;
		HashMap<Candidato, Integer> recuentoVotosPorCandidato = getRecuentoDeVotosTotal();		
		Entry<Candidato, Integer> candidatoYVotos;
		int cantidadDeVotos = 0;

		Iterator<Entry<Candidato, Integer>> itRecuentoVotosPorCandidato = recuentoVotosPorCandidato.entrySet().iterator();
        while(itRecuentoVotosPorCandidato.hasNext()) {
        	candidatoYVotos = itRecuentoVotosPorCandidato.next();
        	if (candidatoYVotos.getValue() > cantidadDeVotos){
        		cantidadDeVotos = candidatoYVotos.getValue();
        		candidatoMasVotado = (Candidato)candidatoYVotos.getKey(); 
        	}
        }
		
		return candidatoMasVotado;
	}
	
	public HashMap<Candidato, Integer> getRecuentoDeVotosTotal() {
		
		HashMap<Candidato, Integer> recuentoVotosPorCandidato = new HashMap<Candidato, Integer>();
		Candidato candidatoVotado;
		int cantidadDeVotos;
		Iterator<Voto> itUrna = urna.iterator();
		
		while (itUrna.hasNext()){
			candidatoVotado = itUrna.next().getCandidato();
			if (recuentoVotosPorCandidato.get(candidatoVotado) == null){
				cantidadDeVotos = 1;
			}else{
				cantidadDeVotos = recuentoVotosPorCandidato.get(candidatoVotado) + 1;
			}
			recuentoVotosPorCandidato.put(candidatoVotado, cantidadDeVotos);	
		}		
		
		return recuentoVotosPorCandidato;
	}

	public HashMap<Partido, Integer> getRecuentoDeVotosTotalPorPartido() {
		
		HashMap<Partido, Integer> recuentoVotosPorPartido = new HashMap<Partido, Integer>();
		Partido partidoVotado;
		int cantidadDeVotos;
		Iterator<Voto> itUrna = urna.iterator();
		
		while (itUrna.hasNext()){
			partidoVotado = itUrna.next().getCandidato().getPartido();
			if (recuentoVotosPorPartido.get(partidoVotado) == null){
				cantidadDeVotos = 1;
			}else{
				cantidadDeVotos = recuentoVotosPorPartido.get(partidoVotado) + 1;
			}
			recuentoVotosPorPartido.put(partidoVotado, cantidadDeVotos);	
		}		
		
		return recuentoVotosPorPartido;
	}
	
	public boolean esVotoValido(Voto voto) {
		
		boolean encontrado = false;
		Iterator<Candidato> itCandidatos = listaDeCandidatos.iterator();
		while (itCandidatos.hasNext() && !encontrado){
			if (voto.getCandidato().equals(itCandidatos.next())){
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public void agregarVotanteAlPadronDeLaMesa(Votante votante){
		padronDeLaMesa.add(votante);
	}
	
	public List<Votante> getPadronDeLaMesa() {
		return padronDeLaMesa;
	}

	public void setPadronDeLaMesa(List<Votante> padronDeLaMesa) {
		this.padronDeLaMesa = padronDeLaMesa;
	}

	public boolean controlarVotanteEnPadron(Votante votante) {
				
		boolean encontrado = false;
		Iterator<Votante> itPadronDeLaMesa = padronDeLaMesa.iterator();
		while (itPadronDeLaMesa.hasNext() && !encontrado){
			if (votante.equals(itPadronDeLaMesa.next())){
				encontrado = true;
			}
		}
		
		return encontrado;		
	}	
	
}