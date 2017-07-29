package br.com.view;

import javax.swing.JFrame;

import br.com.controller.CTCadastrarEmprestimo;
import br.com.model.beans.Funcionario;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class TCadastrarEmprestimo extends JFrame{
	
	
	private static final long serialVersionUID = 1L;

	private Funcionario funcionarioLogado;
	
	private JTextField cpfF;
	private JTextField livroIdF;
	
	private JButton emprestarB;
	
	private CTCadastrarEmprestimo controller;
	
	public TCadastrarEmprestimo(Funcionario funcionarioLogado) {
		setResizable(false);
		this.funcionarioLogado = funcionarioLogado;
		setSize(486,71);
		controller = new CTCadastrarEmprestimo(this);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCpfUsurio = new JLabel("CPF Usu\u00E1rio:");
		lblCpfUsurio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblCpfUsurio);
		
		cpfF = new JTextField();
		getContentPane().add(cpfF);
		cpfF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID Livro:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(lblNewLabel);
		
		livroIdF = new JTextField();
		getContentPane().add(livroIdF);
		livroIdF.setColumns(10);
		
		emprestarB = new JButton("Emprestar");
		emprestarB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emprestarB.addActionListener(controller);
		getContentPane().add(emprestarB);
		setVisible(true);
	}

	/*
	 * =========================================  GET and SET  ===================================================
	 */
	
	
	public Funcionario getFuncionarioLogado() {
		return funcionarioLogado;
	}
	public JTextField getCpfF() {
		return cpfF;
	}
	
	public JTextField getLivroIdF() {
		return livroIdF;
	}

	public JButton getEmprestarB() {
		return emprestarB;
	}
	
	
}
