package br.com.view.funcionario;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPadrao extends JFrame {
	
	public TelaPadrao(String titulo, JPanel p ) {
		super(titulo);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setContentPane(p);
		
		this.setVisible(true);
	}

}
