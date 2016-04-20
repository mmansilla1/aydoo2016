package ar.edu.untref.aydoo;

import java.io.IOException;
import java.util.List;

public class Program{
    
	public static final void main(String[] args) throws IOException {

		String impresionResultante = "";
		int numeroAFactorizar = Integer.parseInt(args[0]);
		AdministradorDeFuncionalidades administradorDeFuncionalidades = new AdministradorDeFuncionalidades(args);
		String formatoImpresion = administradorDeFuncionalidades.getFormat();
		String sortImpresion = administradorDeFuncionalidades.getSort();
		String pathImpresion = administradorDeFuncionalidades.getOutput();

    	DescomponedorEnFactores descomponedorEnFactores = new DescomponedorEnFactores();
    	List<Integer> listaDeFactoresPrimos = descomponedorEnFactores.descomponerEnFactoresPrimos(numeroAFactorizar);
    	
    	ImpresorEnFormatos impresorEnFormatos = new ImpresorEnFormatos();
    	switch (formatoImpresion.toUpperCase()) {
	        case "":
	        	impresionResultante = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sortImpresion);
	        	break;
	    	case "--FORMAT=PRETTY":
	    		impresionResultante = impresorEnFormatos.imprimirEnFormatoPrettySegunSort(numeroAFactorizar, listaDeFactoresPrimos, sortImpresion);
	        	break;
	        case "--FORMAT=QUIET":
	        	impresionResultante = impresorEnFormatos.imprimirEnFormatoQuietSegunSort(listaDeFactoresPrimos, sortImpresion);
	        	break;
	        default:
	        	impresionResultante = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
	    		break;
        }    	
    	
    	if (pathImpresion == ""){
    		System.out.println(impresionResultante);
    	}else{
    		persistirEnArchivo(pathImpresion, impresionResultante);
    	}
    	
	}
	
	private static void persistirEnArchivo(String pathImpresion, String impresionAPersistir) throws IOException {
		int posicionPathReal = 14;
		String pathReal = pathImpresion.substring(posicionPathReal);
		FactoresPrimosDAO factoresPrimosDAO = new FactoresPrimosDAO(pathReal);	
		factoresPrimosDAO.escribirFactorizacion(impresionAPersistir);		
	}


  
}
