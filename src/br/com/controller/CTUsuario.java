package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.view.TMeusEmprestimos;
import br.com.view.TUsuario;

public class CTUsuario implements ActionListener{
	
	private TUsuario tela;
	
	public CTUsuario(TUsuario tela) {
		this.tela = tela;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.tela.getMeusEmprestimosB() ){
			new TMeusEmprestimos(this.tela.getUsuarioLogado());
		}
		if(e.getSource() == this.tela.getMinhaSituacaoB()) {
			JOptionPane.showMessageDialog(this.tela, "Minha situação é : " +this.tela.getUsuarioLogado().getSituacao());
		}
	}
	
}
