package br.com.controller.funcionario.cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import br.com.model.beans.Curso;
import br.com.model.beans.Departamento;
import br.com.model.dao.CursoDAO;
import br.com.model.dao.DepartamentoDAO;
import br.com.view.funcionario.cadastro.PainelCadastroCurso;

public class ControllerPainelCadastrarCurso implements ActionListener{
	
	private PainelCadastroCurso painel;
	
	private List<Departamento> d;
	
	public ControllerPainelCadastrarCurso(PainelCadastroCurso painel) {
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
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.painel.getCadastrarButton()) {
			
				CursoDAO.persist(new Curso(this.painel.getNomeField().getText(), pegarDepartamento()));
			
		}
		
		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}
		
		
	}
}
