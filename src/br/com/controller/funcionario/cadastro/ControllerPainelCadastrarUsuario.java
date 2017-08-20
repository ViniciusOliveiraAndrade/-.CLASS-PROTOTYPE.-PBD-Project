package br.com.controller.funcionario.cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import br.com.model.beans.Departamento;
import br.com.model.beans.Usuario;
import br.com.model.dao.DepartamentoDAO;
import br.com.model.dao.UsuarioDAO;
import br.com.view.funcionario.cadastro.PainelCadastroUsuario;

public class ControllerPainelCadastrarUsuario implements ActionListener{
	
	private PainelCadastroUsuario painel;
	private List<Departamento> d;
	public ControllerPainelCadastrarUsuario(PainelCadastroUsuario painel) {
		this.painel = painel;
		d = DepartamentoDAO.findAll();
	}
	
	public void preencherDepartamentos() {
		for(int i = 0; i <d.size(); i++){
			this.painel.getDepartamentosFields().addItem(d.get(i).getNome());
		}
	}
	public Departamento pegarDepartamento() {
		Departamento dep = null;
		
		for(int i = 0; i <d.size(); i++){
			if(d.get(i).getNome().equals(this.painel.getDepartamentosFields().getSelectedItem())) {
				return d.get(i);
			}
		}
		return dep;
	}
	public void limparTela(){
		this.painel.getMatriculaField().setText(""); 
		this.painel.getCpfField().setText(""); 
		this.painel.getCodigoField().setText(""); 
		this.painel.getEmailField().setText("");
		this.painel.getTxtSituacaoField().setText(""); 
		this.painel.getNomeField().setText("");
		this.painel.getTelefoneField().setText("");
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.painel.getAluno()) {
			if(this.painel.getAluno().isSelected()) {
				this.painel.alunar();
			}else {
				this.painel.professorar();
			}
		}
		if (e.getSource() == this.painel.getCadastrarButton()) {
			if(this.painel.getAluno().isSelected()){
				UsuarioDAO.persist(new Usuario(
						Integer.parseInt(this.painel.getMatriculaField().getText()), 
						this.painel.getCpfField().getText(), 
						Integer.parseInt(this.painel.getCodigoField().getText()), 
						this.painel.getEmailField().getText(),
						this.painel.getTxtSituacaoField().getText(), 
						this.painel.getNomeField().getText(), 
						this.painel.getTelefoneField().getText()));
			}else {
				UsuarioDAO.persist(new Usuario(
						Integer.parseInt(this.painel.getMatriculaField().getText()), 
						this.painel.getCpfField().getText(), 
						this.painel.getEmailField().getText(),
						this.painel.getTxtSituacaoField().getText(), 
						this.painel.getNomeField().getText(), 
						this.painel.getTelefoneField().getText(),
						pegarDepartamento()
						));
			}
		}
		
		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}
		
		
	}
}
