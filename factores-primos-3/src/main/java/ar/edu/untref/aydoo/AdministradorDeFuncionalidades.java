package ar.edu.untref.aydoo;

public class AdministradorDeFuncionalidades {

	private String format = "";
	private String sort = "";
	private String output = "";;
	
	public AdministradorDeFuncionalidades(String[] args) {
		
		String parametroAEvaluar;
		for (int i = 1; i < args.length; i++){
			parametroAEvaluar = args[i].substring(0, 3).toUpperCase();
			switch (parametroAEvaluar) {
				case "--F":
					this.format = args[i];
					break;
				case "--S":
					this.sort = args[i];
		        	break;
		        case "--O":
		        	this.output = args[i];
		        	break;					
			}
		}
		
	}

	public String getFormat() {
		return format;
	}

	public String getSort() {
		return sort;
	}

	public String getOutput() {
		return output;
	}	

}
