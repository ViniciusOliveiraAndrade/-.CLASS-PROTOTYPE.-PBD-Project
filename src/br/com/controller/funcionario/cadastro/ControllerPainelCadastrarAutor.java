package br.com.controller.funcionario.cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.model.beans.Autor;
import br.com.model.dao.AutorDAO;
import br.com.view.funcionario.cadastro.PainelCadastroAutor;

public class ControllerPainelCadastrarAutor implements ActionListener{
	
	private PainelCadastroAutor painel;
	
	public ControllerPainelCadastrarAutor(PainelCadastroAutor painel) {
		this.painel = painel;
	}
	
	
	public void limparTela(){
		this.painel.getNomeField().setText("");
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.painel.getCadastrarButton()) {
				AutorDAO.persist(new Autor(this.painel.getNomeField().getText()));
		}
		
		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}
		
		
	}
}
