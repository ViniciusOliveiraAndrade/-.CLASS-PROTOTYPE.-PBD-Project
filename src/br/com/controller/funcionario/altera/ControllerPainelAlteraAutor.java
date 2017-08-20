package br.com.controller.funcionario.altera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.model.beans.Autor;
import br.com.model.dao.AutorDAO;
import br.com.view.funcionario.altera.PainelAlteraAutor;

public class ControllerPainelAlteraAutor implements ActionListener{

	private PainelAlteraAutor painel;
	private Autor autor;
	public ControllerPainelAlteraAutor(PainelAlteraAutor painel) {
		this.painel = painel;
	}


	public void limparTela(){
		this.painel.getNomeField().setText("");
		this.painel.getBuscarField().setText("");
		this.autor = null;

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.painel.getBuscarButton()) {
			try {
				this.autor = AutorDAO.getByNome(this.painel.getBuscarField().getText());
				this.painel.getNomeField().setText(this.autor.getNome());
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this.painel, "Autor Não Encontrado");
			}
		}

		if (e.getSource() == this.painel.getCadastrarButton()) {
			if(this.autor != null) {
				autor.setNome(this.painel.getNomeField().getText());
				AutorDAO.merge(this.autor);
				JOptionPane.showMessageDialog(this.painel, "Autor Atualizado com Sucesso");
			}
		}
		
		if (e.getSource() == this.painel.getExcluirButton()) {
			if(this.autor != null) {
				AutorDAO.remove(this.autor);
				this.autor = null;
				this.limparTela();
			}
		}

		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}

	}
}
