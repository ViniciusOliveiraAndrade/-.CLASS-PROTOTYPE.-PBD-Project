package br.com.controller.funcionario.altera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.model.beans.Funcionario;
import br.com.model.dao.FuncionarioDAO;
import br.com.view.funcionario.altera.PainelAlteraFuncionario;

public class ControllerPainelAlteraFuncionario implements ActionListener{

	private PainelAlteraFuncionario painel;

	private Funcionario funcionario;
	
	public ControllerPainelAlteraFuncionario(PainelAlteraFuncionario painel) {
		this.painel = painel;
	}


	public void limparTela(){
		this.painel.getMatriculaField().setText(""); 
		this.painel.getCpfField().setText(""); 
		this.painel.getNomeField().setText("");
		this.painel.getBuscarField().setText("");
		this.funcionario = null;

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.painel.getBuscarButton()) {
			try {
				this.funcionario = FuncionarioDAO.getByCpf(this.painel.getBuscarField().getText());
				this.painel.getNomeField().setText(this.funcionario.getNome());
				this.painel.getMatriculaField().setText(String.valueOf(this.funcionario.getMatricula())); 
				this.painel.getCpfField().setText(this.funcionario.getCpf()); 
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this.painel, "Departamento Não Encontrado");
			}
		}

		if (e.getSource() == this.painel.getCadastrarButton()) {
			if(this.funcionario != null) {
				this.funcionario.setNome(this.painel.getNomeField().getText());
				this.funcionario.setCpf(this.painel.getCpfField().getText());
				this.funcionario.setMatricula(Integer.parseInt(this.painel.getMatriculaField().getText()));
				FuncionarioDAO.merge(this.funcionario);
				JOptionPane.showMessageDialog(this.painel, "Departamento Atualizado com Sucesso");
				this.limparTela();
			}
		}
		
		if (e.getSource() == this.painel.getExcluirButton()) {
			if(this.funcionario != null) {
				FuncionarioDAO.remove(this.funcionario);
				this.funcionario = null;
				this.limparTela();
			}
		}

		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}


	}
}
