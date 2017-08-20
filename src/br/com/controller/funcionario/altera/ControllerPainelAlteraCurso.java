package br.com.controller.funcionario.altera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.model.beans.Curso;
import br.com.model.beans.Departamento;
import br.com.model.dao.CursoDAO;
import br.com.model.dao.DepartamentoDAO;
import br.com.view.funcionario.altera.PainelAlteraCurso;

public class ControllerPainelAlteraCurso implements ActionListener{

	private PainelAlteraCurso painel;
	private Curso curso;

	private List<Departamento> d;

	public ControllerPainelAlteraCurso(PainelAlteraCurso painel) {
		this.painel = painel;
		d = DepartamentoDAO.findAll();
	}

	public void preencherDepartamentos() {
		for(int i = 0; i <d.size(); i++){
			this.painel.getDepartamentoFields().addItem(d.get(i).getNome());
		}
	}
	public Departamento pegarDepartamento() {
		Departamento dep = null;

		for(int i = 0; i <d.size(); i++){
			if(d.get(i).getNome().equals(this.painel.getDepartamentoFields().getSelectedItem())) {
				return d.get(i);
			}
		}
		return dep;
	}
	public void limparTela(){
		this.painel.getNomeField().setText("");
		this.painel.getBuscarField().setText("");
		this.curso = null;

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.painel.getBuscarButton()) {
			try {
				this.curso = CursoDAO.getByNome(this.painel.getBuscarField().getText());
				this.painel.getNomeField().setText(this.curso.getNome());
				this.painel.getDepartamentoFields().setSelectedItem(curso.getDepartamento().getNome());
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this.painel, "Autor Não Encontrado");
			}
		}

		if (e.getSource() == this.painel.getCadastrarButton()) {
			if(this.curso != null) {
				this.curso.setNome(this.painel.getNomeField().getText());
				this.curso.setDepartamento(pegarDepartamento());
				CursoDAO.merge(this.curso);
				JOptionPane.showMessageDialog(this.painel, "Autor Atualizado com Sucesso");
				this.limparTela();
			}
		}
		
		if (e.getSource() == this.painel.getExcluirButton()) {
			if(this.curso != null) {
				CursoDAO.remove(this.curso);
				this.curso = null;
				this.limparTela();
			}
		}

		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}


	}
}
