package ar.edu.untref.aydoo;

public class Candidato {

	private String nombre;
	private String apellido;
	private Partido partido;
	
	public Candidato(String nombre, String apellido, Partido partido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.partido = partido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Partido getPartido() {
		return partido;
	}
	
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
	public boolean equals(Candidato candidato){
		return (this.nombre == candidato.nombre && 
				this.apellido == candidato.apellido && 
				this.partido == candidato.partido);		
	}
	
}