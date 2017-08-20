package br.com.controller.funcionario.cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.model.beans.Departamento;
import br.com.model.dao.DepartamentoDAO;
import br.com.view.funcionario.cadastro.PainelCadastroDepartamento;

public class ControllerPainelCadastrarDepartamento implements ActionListener{
	
	private PainelCadastroDepartamento painel;
	
	public ControllerPainelCadastrarDepartamento(PainelCadastroDepartamento painel) {
		this.painel = painel;
	}
	
	
	public void limparTela(){
		this.painel.getNomeField().setText("");
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.painel.getCadastrarButton()) {
				DepartamentoDAO.persist(new Departamento(this.painel.getNomeField().getText()));
		}
		
		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}
		
		
	}
}
