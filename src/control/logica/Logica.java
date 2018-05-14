package control.logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Legible;
import modelo.Pagina;
import utiles.Constantes;

public class Logica implements Legible{
	private int actual = 0;
	private int marca = 0;
	private String ruta;

	private char caracteres[];
	public Logica() {
		super();
		ruta = "JuegoTronos.txt";	
	}


	@Override
	public void avanzarPagina() {
		
				actual++;

	}
	public String getLectura() {
		try {
			caracteres= new char[Constantes.MAXIMOCARACTERES];
			FileReader fileR = new FileReader(ruta);
			for (int i = 0; i <= actual; i++) {
				fileR.read(caracteres);
				
			}
			fileR.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return reemplazarSaltosDeLinea( new String(caracteres));
	}

	private String reemplazarSaltosDeLinea(String generearPaginaSegunPalabraPartida) {
		return new String(generearPaginaSegunPalabraPartida.replaceAll("\r", "").replaceAll("\n", " "));
	}

	@Override
	public void retrocederPagina() {
		// TODO Auto-generated method stub
		if (!comprobarPrimeraPagina()) {
			actual--;
		}


	}
	
	private boolean comprobarPrimeraPagina() {
		if (actual <= 0) {
			return true;
		}
		return false;
	}

	@Override
	public void marcarPagina() {
		marca = actual;

	}

	@Override
	public void irAPagina() {
		actual = marca;

	}

	
	

	public int getActual() {
		return actual;
	}

	public int getMarca() {
		return marca;
	}

	

}
