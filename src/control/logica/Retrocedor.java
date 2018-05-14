package control.logica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class Retrocedor implements ActionListener {
	private Logica logica;
	private JTextArea cuadroTexto;
	private JLabel numeroPaginas;
	private JLabel lblMarcaPaginas;
	public Retrocedor(JLabel numeroPaginas, JTextArea cuadroTexto, Logica logica, JLabel lblMarcaPaginas) {
		super();
		this.logica = logica;
		this.cuadroTexto = cuadroTexto;
		this.numeroPaginas= numeroPaginas;
		this.lblMarcaPaginas= lblMarcaPaginas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		logica.retrocederPagina();
		cuadroTexto.setText(logica.getLectura());
		lblMarcaPaginas.setVisible(false);
		numeroPaginas.setText(String.valueOf( logica.getActual()));
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
