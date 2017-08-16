package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.view.Antiga.TAcervoBiblioteca;
import br.com.view.Antiga.TInicio;
import br.com.view.Antiga.TLogin;

public class CTInicio implements ActionListener{
	
	private TInicio tela;
	
	public CTInicio(TInicio tela) {
		this.tela = tela;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.tela.getLogarB()){new TLogin();}
		if(e.getSource()==this.tela.getVerificaAB()){new TAcervoBiblioteca();}
	}
	
}
