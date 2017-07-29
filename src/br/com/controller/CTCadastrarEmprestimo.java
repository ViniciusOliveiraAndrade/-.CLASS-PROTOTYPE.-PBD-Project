package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.model.controller.EmprestimoController;
import br.com.model.dao.LivroDAO;
import br.com.model.dao.UsuarioDAO;
import br.com.view.TCadastrarEmprestimo;

public class CTCadastrarEmprestimo implements ActionListener{

	private TCadastrarEmprestimo tela;
	private EmprestimoController ec;

	public CTCadastrarEmprestimo(TCadastrarEmprestimo tela) {
		this.tela = tela;
		this.ec = new EmprestimoController();
	}	

	public void actionPerformed(ActionEvent e) {
		ec.criarEmprestimo(LivroDAO.getById(Integer.parseInt(this.tela.getLivroIdF().getText())), UsuarioDAO.getByCpf(this.tela.getCpfF().getText()), this.tela.getFuncionarioLogado());
		
	}
}
