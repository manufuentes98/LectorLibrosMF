package control.logica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class Buscador implements ActionListener {
	private	JLabel numeroPaginas;
	private	JTextArea cuadroTexto;
	private Logica logica;
	private JLabel lblMarcaPaginas;
public Buscador(JLabel numeroPaginas, JTextArea textArea, Logica logica, JLabel lblMarcaPaginas) {
		super();
		this.numeroPaginas = numeroPaginas;
		this.cuadroTexto = textArea;
		this.logica= logica;
		this.lblMarcaPaginas= lblMarcaPaginas;
	}
@Override
public void actionPerformed(ActionEvent e) {
logica.irAPagina();	
cuadroTexto.setText(logica.getLectura());
lblMarcaPaginas.setVisible(true);
numeroPaginas.setText(String.valueOf( logica.getActual()));
if (logica.getMarca()==logica.getActual()) {
	numeroPaginas.setForeground(Color.GREEN);
}
else {
	numeroPaginas.setForeground(Color.BLACK);
}

SwingUtilities.updateComponentTreeUI(cuadroTexto.getParent());

}


}
