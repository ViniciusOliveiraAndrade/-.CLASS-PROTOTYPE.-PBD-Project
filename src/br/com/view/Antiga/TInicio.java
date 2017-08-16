package br.com.view.Antiga;

import javax.swing.JFrame;

import br.com.controller.CTInicio;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;

public class TInicio extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JButton logarB;
	private JButton verificaAB;
	private CTInicio controller;
	
	public TInicio() {
		setSize(240,80);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		controller = new CTInicio(this);
		
		logarB = new JButton("Logar");
		logarB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		logarB.addActionListener(controller);
		getContentPane().add(logarB);
		
		verificaAB = new JButton("Verificar acervo");
		verificaAB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		verificaAB.addActionListener(controller);
		getContentPane().add(verificaAB);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/*
	 * =========================================  GET and SET  ===================================================
	 */
	
	public JButton getLogarB() {
		return logarB;
	}
	public JButton getVerificaAB() {
		return verificaAB;
	}
	
	public static void main(String[] args) {
		new TInicio();
	}
	

}
