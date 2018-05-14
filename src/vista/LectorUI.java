package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//MAXIMO DE CARACTERES: 851.
//MAXIMO CARACTERES "GABRIOLA 16": 685
public class LectorUI extends JFrame {
	protected JPanel contentPane;
	protected JTextArea cuadroTexto;
	protected JButton btnAtras;
	protected JButton btnMarcar;
	protected JButton btnIrAMarca;
	protected JButton btnAlante;
	protected JLabel numeroPaginas;
	protected JLabel lblMarcaPaginas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try
				{
					LectorUI frame = new LectorUI();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LectorUI() {
		setTitle("Lector");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 490);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblMarcaPaginas = new JLabel("New label");
		lblMarcaPaginas.setIcon(new ImageIcon("img/marcaPaginas.png"));
		lblMarcaPaginas.setBounds(10, 23, 91, 355);
		lblMarcaPaginas.setVisible(false);
		contentPane.add(lblMarcaPaginas);				
		
		cuadroTexto = new JTextArea();
		cuadroTexto.setBounds(5, 5, 305, 412);
		cuadroTexto.setFont(new Font("Gabriola", Font.PLAIN, 16));
		cuadroTexto.setForeground(new Color(0, 0, 0));
		cuadroTexto.setBackground(new Color(255, 250, 205));
		cuadroTexto.setLineWrap(true);
		cuadroTexto.setWrapStyleWord(true);
		contentPane.add(cuadroTexto);
		
		
		
		//Panel de botones
		JPanel panel = new JPanel();
		panel.setBounds(5, 417, 305, 39);
		contentPane.add(panel);
		
		numeroPaginas = new JLabel("0");
		btnAtras = new JButton("");		
		btnAtras.setBackground(new Color(255, 204, 102));
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtras.setIcon(new ImageIcon(LectorUI.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnAlante = new JButton("");		
		btnAlante.setBackground(new Color(255, 204, 102));
		btnAlante.setToolTipText("pasa una página");
		btnAlante.setIcon(new ImageIcon(LectorUI.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnMarcar = new JButton("Marcar");		
		btnMarcar.setFont(new Font("Pristina", Font.PLAIN, 17));
		btnIrAMarca = new JButton("Ir a Marca");
		btnIrAMarca.setFont(new Font("Pristina", Font.PLAIN, 17));
			
		
		panel.add(btnAtras);
		panel.add(btnMarcar);
		panel.add(btnIrAMarca);
		panel.add(btnAlante);		
		panel.add(numeroPaginas);
	}	
}

