package br.com.view.usuario;

import java.awt.CardLayout;

import javax.swing.JPanel;

import br.com.controller.usuario.ControllerPainelUsuarioEmprestimos;
import br.com.view.primaria.TabelaPadrao;

public class PainelUsuarioEmprestimos extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private TabelaPadrao tabelaEmprestimos;
	
	private String cpfUsuarioLogado;
	
	private ControllerPainelUsuarioEmprestimos controller;
	
	public PainelUsuarioEmprestimos(String cpf) {
		this.setLayout(new CardLayout(0, 0));
		this.tabelaEmprestimos = new TabelaPadrao("Meus Emprestimos");
		this.tabelaEmprestimos.setColumns(new Object[] {"Id","Titulo do Livro","Situação","Data do Emprestimo","Data presvista Entrega","Data da Entrega","Multa","Funcionario Emprestimo","Funcionario Devolução"});
		this.tabelaEmprestimos.setEnabled(false);
		this.add(tabelaEmprestimos);
		this.cpfUsuarioLogado = cpf;
		this.controller = new ControllerPainelUsuarioEmprestimos(this);
	}
	
	public void ativar(){
		this.setVisible(true);
	}

	public void desativar(){
		this.setVisible(false);
	}

	public TabelaPadrao getTabelaEmprestimos() {
		return tabelaEmprestimos;
	}

	public String getCpfUsuarioLogado() {
		return cpfUsuarioLogado;
	}

	public ControllerPainelUsuarioEmprestimos getController() {
		return controller;
	}
	
	
	
	 
}
