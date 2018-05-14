package control.accion;

import java.io.FileInputStream;

import javax.swing.JLabel;
import javax.swing.SwingWorker;

import control.logica.Avanzador;
import control.logica.Buscador;
import control.logica.Logica;
import control.logica.Marcador;
import control.logica.Retrocedor;
import javazoom.jl.player.Player;
import vista.LectorUI;

public class LectorBridge extends LectorUI {
	private Avanzador avanzarPagina;
	private Retrocedor retrocederPagina;
	private Marcador marcarPagina;
	private Buscador irAPagina;
	private Logica logica;
public LectorBridge() {
		super();
		logica= new Logica();
		avanzarPagina= new Avanzador(this.numeroPaginas, this.cuadroTexto,this.logica, lblMarcaPaginas);
		retrocederPagina= new Retrocedor(this.numeroPaginas, this.cuadroTexto,this.logica, lblMarcaPaginas);
		marcarPagina= new Marcador(this.numeroPaginas,this.logica,this.lblMarcaPaginas);
		irAPagina= new Buscador(this.numeroPaginas,cuadroTexto, this.logica, lblMarcaPaginas);
		this.btnAlante.addActionListener(avanzarPagina);
		this.btnAtras.addActionListener(retrocederPagina);
		this.btnIrAMarca.addActionListener(irAPagina);
		this.btnMarcar.addActionListener(marcarPagina);
		this.cuadroTexto.setText(logica.getLectura());
		
		SwingWorker<Object, Object> worker=  new SwingWorker<Object, Object>(){
            @Override
            protected Object doInBackground() throws Exception {
                reproducirAudio("mp3/wow.mp3");
                return null;
            }
        };
            worker.execute();
    }
	
private void reproducirAudio(String ruta) {
    try {
        Player reproductor = new Player(new FileInputStream(String.valueOf(ruta)));
        reproductor.play();
        }
    catch (Exception tipoerror) {
        System.out.println("" + tipoerror);
    }
}

}
