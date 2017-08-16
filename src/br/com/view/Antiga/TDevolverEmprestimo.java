package br.com.view.Antiga;

import javax.swing.JFrame;

import br.com.controller.CTDevolverEmprestimo;
import br.com.model.beans.Funcionario;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TDevolverEmprestimo extends JFrame{
	

	private static final long serialVersionUID = 1L;

	private Funcionario funcionarioLogado;

	private JTextField idEmprestimoF;
	
	private JButton devolverB;
	
	private CTDevolverEmprestimo controller;
	
	public TDevolverEmprestimo(Funcionario funcionarioLogado) {
		this.funcionarioLogado = funcionarioLogado;
		setSize(455,174);
		controller = new CTDevolverEmprestimo(this);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblIdEmprestimo = new JLabel("ID Emprestimo:");
		getContentPane().add(lblIdEmprestimo);
		
		idEmprestimoF = new JTextField();
		getContentPane().add(idEmprestimoF);
		idEmprestimoF.setColumns(10);
		
		devolverB = new JButton("Devolver");
		devolverB.addActionListener(controller);
		getContentPane().add(devolverB);
		setVisible(true);
	}
	/*
	 * =========================================  GET and SET  ===================================================
	 */
	public Funcionario getFuncionarioLogado() {
		return funcionarioLogado;
	}

	public JTextField getIdEmprestimoF() {
		return idEmprestimoF;
	}

	public JButton getDevolverB() {
		return devolverB;
	}
	

	
	
	
	
	
}
