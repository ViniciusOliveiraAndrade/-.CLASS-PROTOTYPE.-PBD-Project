package br.com.view.primaria;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaLogin extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField cpfField;
	private JButton logarButton;
	public TelaLogin() {
		super("Login");
		setSize(298, 63);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCpf = new JLabel("CPF:");
		getContentPane().add(lblCpf);
		
		this.cpfField = new JTextField();
		getContentPane().add(this.cpfField);
		this.cpfField.setColumns(10);
		
		this.logarButton = new JButton("Logar");
		getContentPane().add(this.logarButton);
		
		setVisible(true);

	}
	public JTextField getCpfField() {
		return cpfField;
	}
	public JButton getLogarButton() {
		return logarButton;
	}	
	
}
