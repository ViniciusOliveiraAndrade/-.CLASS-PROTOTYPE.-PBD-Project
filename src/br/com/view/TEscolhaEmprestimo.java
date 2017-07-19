package br.com.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import br.com.controller.CTEscolhaEmprestimo;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class TEscolhaEmprestimo extends JFrame{

	private JButton emprestarB;
	private JButton devolverB;
	private CTEscolhaEmprestimo ctee;

	public TEscolhaEmprestimo() {
		setResizable(false);
		setSize(440,130);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY));
		panel.setBounds(10, 11, 411, 80);
		getContentPane().add(panel);
		panel.setLayout(null);

		this.emprestarB = new JButton("Emprestar");
		this.emprestarB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.emprestarB.setBounds(10, 11, 186, 53);
		panel.add(emprestarB);

		this.devolverB = new JButton("Devolver");
		this.devolverB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.devolverB.setBounds(215, 11, 186, 53);
		panel.add(devolverB);
		
		ctee = new CTEscolhaEmprestimo(this);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JButton getEmprestarB() {
		return emprestarB;
	}

	public JButton getDevolverB() {
		return devolverB;
	}


}
