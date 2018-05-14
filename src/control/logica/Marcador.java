package control.logica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class Marcador implements ActionListener {
	private JLabel numeroPaginas;
	private Logica logica;
	private JLabel lblMarcaPaginas;
public Marcador(JLabel numeroPaginas, Logica logica,JLabel lblMarcaPaginas) {
		super();
		this.numeroPaginas = numeroPaginas;
		this.logica = logica;
		this.lblMarcaPaginas= lblMarcaPaginas;
	}

@Override
public void actionPerformed(ActionEvent e) {
	logica.marcarPagina();
	numeroPaginas.setForeground(Color.GREEN);
	lblMarcaPaginas.setVisible(!lblMarcaPaginas.isVisible());
	SwingUtilities.updateComponentTreeUI(numeroPaginas.getParent());
	
	

}


}
