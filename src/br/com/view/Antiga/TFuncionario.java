package br.com.view.Antiga;

import javax.swing.JFrame;

import br.com.controller.CTFuncinario;
import br.com.model.beans.Funcionario;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;

public class TFuncionario extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private Funcionario funcionarioLogado;
	
	private JButton cadastrarEmprestmoB; 
	private JButton devolverEmprestimoB;
	
	private CTFuncinario controller;
	
	public TFuncionario(Funcionario funcionarioLogado) {
		this.funcionarioLogado = funcionarioLogado;
		setSize(403,85);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		controller = new CTFuncinario(this);
		
		cadastrarEmprestmoB = new JButton("Cadastrar emprestmo");
		cadastrarEmprestmoB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cadastrarEmprestmoB.addActionListener(controller);
		getContentPane().add(cadastrarEmprestmoB);
		
		devolverEmprestimoB = new JButton("Devolver emprestimo");
		devolverEmprestimoB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		devolverEmprestimoB.addActionListener(controller);
		getContentPane().add(devolverEmprestimoB);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/*
	 * =========================================  GET and SET  ===================================================
	 */
	
	public JButton getCadastrarEmprestimoB() {
		return cadastrarEmprestmoB;
	}
	
	public JButton getDevolverEmprestimoB() {
		return devolverEmprestimoB;
	}

	public Funcionario getFuncionarioLogado() {
		return funcionarioLogado;
	}
	

}
