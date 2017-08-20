package br.com.controller.funcionario.altera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.model.beans.Departamento;
import br.com.model.dao.DepartamentoDAO;
import br.com.view.funcionario.altera.PainelAlteraDepartamento;

public class ControllerPainelAlteraDepartamento implements ActionListener{

	private PainelAlteraDepartamento painel;
	
	private Departamento departamento;
	
	public ControllerPainelAlteraDepartamento(PainelAlteraDepartamento painel) {
		this.painel = painel;
	}

	public void limparTela(){
		this.painel.getNomeField().setText("");
		this.painel.getBuscarField().setText("");
		this.departamento = null;

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.painel.getBuscarButton()) {
			try {
				this.departamento = DepartamentoDAO.getByNome(this.painel.getBuscarField().getText());
				this.painel.getNomeField().setText(this.departamento.getNome());
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this.painel, "Departamento Não Encontrado");
			}
		}

		if (e.getSource() == this.painel.getCadastrarButton()) {
			if(this.departamento != null) {
				this.departamento.setNome(this.painel.getNomeField().getText());
				DepartamentoDAO.merge(this.departamento);
				JOptionPane.showMessageDialog(this.painel, "Departamento Atualizado com Sucesso");
				this.limparTela();
			}
		}
		
		if (e.getSource() == this.painel.getExcluirButton()) {
			if(this.departamento != null) {
				DepartamentoDAO.remove(this.departamento);
				this.departamento = null;
				this.limparTela();
			}
		}

		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}


	}
}
