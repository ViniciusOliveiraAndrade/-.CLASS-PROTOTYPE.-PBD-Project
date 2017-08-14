package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.view.TCadastrarEmprestimo;
import br.com.view.TDevolverEmprestimo;
import br.com.view.TFuncionario;

public class CTFuncinario implements ActionListener {
	private TFuncionario tela;
	
	 public CTFuncinario(TFuncionario tela) {
		 this.tela = tela;
	 }	 
	 public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.tela.getCadastrarEmprestimoB()) {
			new TCadastrarEmprestimo(this.tela.getFuncionarioLogado());
		}
		if(e.getSource() == this.tela.getDevolverEmprestimoB()) {
			new TDevolverEmprestimo(this.tela.getFuncionarioLogado());
		}
	}
	
}
