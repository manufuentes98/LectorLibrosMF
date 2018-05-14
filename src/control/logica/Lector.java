package control.logica;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import utiles.Constantes;

public class Lector {
	private File ruta;
	private String generarPagina(int numeroPagina) throws IOException {
		FileReader flujoR = new FileReader(ruta);
		char[] letras = null;
		for (int i = 0; i < numeroPagina+1; i++) {
			letras = new char[Constantes.MAXIMOCARACTERES];
			flujoR.read(letras);
			
		}
		flujoR.close();
		return null;
	}
}
