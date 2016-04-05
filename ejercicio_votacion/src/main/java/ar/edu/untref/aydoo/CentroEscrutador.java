package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class CentroDeComputos {
	
	private List<MesaElectoral> mesasElectorales = new ArrayList<MesaElectoral>();
	
	public void setMesaElectoral(MesaElectoral mesaElectoral){
		this.mesasElectorales.add(mesaElectoral); 
	}
	
	public Candidato getCandidatoMasVotadoANivelNacional(){
		
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
	
	private HashMap<Candidato, Integer> getRecuentoDeVotosTotal() {
		
		HashMap<Candidato, Integer> recuentoVotosPorMesa = new HashMap<Candidato, Integer>();
		HashMap<Candidato, Integer> recuentoVotosTotal = new HashMap<Candidato, Integer>();
		Iterator<MesaElectoral> itMesasElectorales = mesasElectorales.iterator();
		Iterator<Entry<Candidato, Integer>> itRecuentoVotosPorMesa;
		Entry<Candidato, Integer> candidatoYVotos;
		int cantidadDeVotosDeOtrasMesa = 0;
		
		while (itMesasElectorales.hasNext()){
			recuentoVotosPorMesa = itMesasElectorales.next().getRecuentoDeVotosTotal();
			itRecuentoVotosPorMesa = recuentoVotosPorMesa.entrySet().iterator();
	        while(itRecuentoVotosPorMesa.hasNext()) {
	        	candidatoYVotos = itRecuentoVotosPorMesa.next();
	        	cantidadDeVotosDeOtrasMesa = 0;
	        	if (recuentoVotosTotal.get(candidatoYVotos.getKey()) != null){
	        		cantidadDeVotosDeOtrasMesa = recuentoVotosTotal.get(candidatoYVotos.getValue());
	        	}
	        	recuentoVotosTotal.put(candidatoYVotos.getKey(), candidatoYVotos.getValue() + cantidadDeVotosDeOtrasMesa);
	        }
		}		
		
		return recuentoVotosTotal;
	}
	
	public Partido getPartidoMasVotadoPorProvincia(Provincia provincia){
		
		Partido partidoMasVotadoDeLaProvincia = null;
		HashMap<Partido, Integer> recuentoVotosPorPartido = getRecuentoDeVotosTotalPorPartidoPorProvincia(provincia);		
		Entry<Partido, Integer> partidoYVotos;
		int cantidadDeVotos = 0;

		Iterator<Entry<Partido, Integer>> itRecuentoVotosPorCandidato = recuentoVotosPorPartido.entrySet().iterator();
        while(itRecuentoVotosPorCandidato.hasNext()) {
        	partidoYVotos = itRecuentoVotosPorCandidato.next();
        	if (partidoYVotos.getValue() > cantidadDeVotos){
        		cantidadDeVotos = partidoYVotos.getValue();
        		partidoMasVotadoDeLaProvincia = (Partido)partidoYVotos.getKey(); 
        	}
        }
		
		return partidoMasVotadoDeLaProvincia;
	}
	
	private HashMap<Partido, Integer> getRecuentoDeVotosTotalPorPartidoPorProvincia(Provincia provincia) {
		
		HashMap<Partido, Integer> recuentoVotosPorMesa = new HashMap<Partido, Integer>();
		HashMap<Partido, Integer> recuentoVotosTotal = new HashMap<Partido, Integer>();
		Iterator<MesaElectoral> itMesasElectorales = mesasElectorales.iterator();
		Iterator<Entry<Partido, Integer>> itRecuentoVotosPorMesa;
		Entry<Partido, Integer> partidoYVotos;
		int cantidadDeVotosDeOtrasMesa = 0;
		MesaElectoral mesaElectoral;
		
		while (itMesasElectorales.hasNext()){
			mesaElectoral = itMesasElectorales.next();
			if (mesaElectoral.getProvincia() == provincia){
				recuentoVotosPorMesa = mesaElectoral.getRecuentoDeVotosTotalPorPartido();
				itRecuentoVotosPorMesa = recuentoVotosPorMesa.entrySet().iterator();
		        while(itRecuentoVotosPorMesa.hasNext()) {
		        	partidoYVotos = itRecuentoVotosPorMesa.next();
		        	cantidadDeVotosDeOtrasMesa = 0;
		        	if (recuentoVotosTotal.get(partidoYVotos.getKey()) != null){
		        		cantidadDeVotosDeOtrasMesa = recuentoVotosTotal.get(partidoYVotos.getValue());
		        	}
		        	recuentoVotosTotal.put(partidoYVotos.getKey(), partidoYVotos.getValue() + cantidadDeVotosDeOtrasMesa);
		        }
			}	
		}
		
		return recuentoVotosTotal;
	}
	
	
}