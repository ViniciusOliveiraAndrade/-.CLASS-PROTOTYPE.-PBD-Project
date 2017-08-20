package br.com.controller.funcionario.altera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.model.beans.Departamento;
import br.com.model.beans.Usuario;
import br.com.model.dao.DepartamentoDAO;
import br.com.model.dao.UsuarioDAO;
import br.com.view.funcionario.altera.PainelAlteraUsuario;

public class ControllerPainelAlteraUsuario implements ActionListener{

	private PainelAlteraUsuario painel;
	
	private List<Departamento> d;
	
	private Usuario usuario;
	
	public ControllerPainelAlteraUsuario(PainelAlteraUsuario painel) {
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
		this.painel.getBuscarField().setText("");
		this.usuario = null;

	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.painel.getBuscarButton()) {
			try {
				this.usuario = UsuarioDAO.getByCpf(this.painel.getBuscarField().getText());
				
				this.painel.getNomeField().setText(this.usuario.getNome());
				this.painel.getMatriculaField().setText(String.valueOf(this.usuario.getMatricula())); 
				this.painel.getCpfField().setText(this.usuario.getCpf());

				if(!this.usuario.isProfessor()) {
					this.painel.getCodigoField().setText(String.valueOf(this.usuario.getCodigo()));
					this.painel.alunar();
				}else {
					this.painel.getDepartamentosFields().setSelectedItem(usuario.getDepartamento().getNome());
					this.painel.professorar();
				}
				this.painel.getEmailField().setText(this.usuario.getEmail());
				this.painel.getTxtSituacaoField().setText(this.usuario.getSituacao()); 
				this.painel.getTelefoneField().setText(this.usuario.getTelefone());
				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this.painel, "Autor Não Encontrado");
			}
		}

		if (e.getSource() == this.painel.getAluno()) {
			if(this.painel.getAluno().isSelected()) {
				this.painel.alunar();
			}else {
				this.painel.professorar();
			}
		}
		
		if (e.getSource() == this.painel.getExcluirButton()) {
			if(this.usuario != null) {
				UsuarioDAO.remove(this.usuario);
				this.usuario = null;
				this.limparTela();
			}
		}
		if (e.getSource() == this.painel.getCadastrarButton()) {
			if(this.painel.getAluno().isSelected()){
				
				this.usuario.setNome(this.painel.getNomeField().getText());
				this.usuario.setMatricula(Integer.parseInt(this.painel.getMatriculaField().getText())); 
				this.usuario.setCpf(this.painel.getCpfField().getText()); 
				this.usuario.setCodigo(Integer.parseInt(this.painel.getCodigoField().getText())); 
				this.usuario.setEmail(this.painel.getEmailField().getText());
				this.usuario.setSituacao(this.painel.getTxtSituacaoField().getText()); 
				this.usuario.setTelefone(this.painel.getTelefoneField().getText());
				
				UsuarioDAO.merge(usuario);
			}else {

				this.usuario.setNome(this.painel.getNomeField().getText());
				this.usuario.setMatricula(Integer.parseInt(this.painel.getMatriculaField().getText())); 
				this.usuario.setCpf(this.painel.getCpfField().getText()); 
				this.usuario.setEmail(this.painel.getEmailField().getText());
				this.usuario.setSituacao(this.painel.getTxtSituacaoField().getText()); 
				this.usuario.setTelefone(this.painel.getTelefoneField().getText());
				
				UsuarioDAO.merge(usuario);
			}
		}

		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}


	}
}
