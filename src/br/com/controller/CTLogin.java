package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.model.controller.LoginController;
import br.com.view.TFuncionario;
import br.com.view.TLogin;
import br.com.view.TUsuario;

public class CTLogin implements ActionListener{

	private TLogin tela;
	private LoginController lc;
	public CTLogin(TLogin tela) {
		this.tela = tela;
		this.lc =new LoginController();
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == this.tela.getAncelarB()){this.tela.dispose();}

		if(e.getSource() == this.tela.getLogarB()){
			if(this.lc.podeLogar(Integer.parseInt(this.tela.getMatriculaTF().getText()), this.tela.getCpfTF().getText())) {
				if(this.lc.eUsuario()) {
					new TUsuario(this.lc.getUsuarioLogado());
					this.tela.dispose();
				}else {
					new TFuncionario(this.lc.getFuncionarioLogado());
					this.tela.dispose();
				}
			}else {JOptionPane.showMessageDialog(this.tela,	 "Matricula ou CPF não encontrados");}
		}

	}


}
