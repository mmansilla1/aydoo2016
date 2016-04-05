package ar.edu.untref.aydoo;

public class Voto {

	private Candidato candidato;
	
	public Voto(Candidato candidato){
		this.candidato = candidato;
	}
	
	public Candidato getCandidato() {
		return candidato;
	}
	
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

}