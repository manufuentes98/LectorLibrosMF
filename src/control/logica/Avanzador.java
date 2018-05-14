package control.logica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import vista.LectorUI;

public class Avanzador implements ActionListener {
	private	JLabel numeroPaginas;
	private	JTextArea cuadroTexto;
	private Logica logica;
	private JLabel lblMarcaPaginas;
public Avanzador(JLabel numeroPaginas, JTextArea textArea, Logica logica, JLabel lblMarcaPaginas) {
		super();
		this.numeroPaginas = numeroPaginas;
		this.cuadroTexto = textArea;
		this.logica= logica;
		this.lblMarcaPaginas= lblMarcaPaginas;
	}
@Override
public void actionPerformed(ActionEvent arg0) {
	logica.avanzarPagina();
	cuadroTexto.setText(logica.getLectura());
	numeroPaginas.setText(String.valueOf( logica.getActual()));
	lblMarcaPaginas.setVisible(false);
	if (logica.getMarca()==logica.getActual()) {
		numeroPaginas.setForeground(Color.GREEN);
		lblMarcaPaginas.setVisible(true);
	}
	else {
		numeroPaginas.setForeground(Color.BLACK);
	}

	SwingUtilities.updateComponentTreeUI(cuadroTexto.getParent());

}
}
