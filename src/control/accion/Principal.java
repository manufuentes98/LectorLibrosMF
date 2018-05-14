package control.accion;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileReader;

import control.accion.LectorBridge;


public class Principal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LectorBridge frame = new LectorBridge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
