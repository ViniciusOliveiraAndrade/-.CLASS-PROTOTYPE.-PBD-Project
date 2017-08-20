package br.com.controller.funcionario.cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.model.beans.Funcionario;
import br.com.model.dao.FuncionarioDAO;
import br.com.view.funcionario.cadastro.PainelCadastroFuncionario;

public class ControllerPainelCadastrarFuncionario implements ActionListener{
	
	private PainelCadastroFuncionario painel;
	
	public ControllerPainelCadastrarFuncionario(PainelCadastroFuncionario painel) {
		this.painel = painel;
	}
	
	
	public void limparTela(){
		this.painel.getMatriculaField().setText(""); 
		this.painel.getCpfField().setText(""); 
		this.painel.getNomeField().setText("");
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.painel.getCadastrarButton()) {
		
				FuncionarioDAO.persist(new Funcionario(
						Integer.parseInt(this.painel.getMatriculaField().getText()), 
						this.painel.getCpfField().getText(), 
						this.painel.getNomeField().getText()
						));
			
		}
		
		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}
		
		
	}
}
