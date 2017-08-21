package br.com.controller.funcionario.listar;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.model.beans.Usuario;
import br.com.model.controller.UsuarioController;
import br.com.model.dao.UsuarioDAO;
import br.com.view.funcionario.listar.PainelListarUsuario;

public class ControllerPainelListarUsuario implements ActionListener{

	private PainelListarUsuario painel;
	public ControllerPainelListarUsuario(PainelListarUsuario painelAcervo) {

		this.painel = painelAcervo;
		this.preencherTabela(UsuarioDAO.getBySituacao("Suspenso"));
	}

	private void preencherTabela(List<Usuario> u){
		this.painel.getTabelaAcervo().zerarTabela();
		for(int i = 0; i <u.size();i++) {
			if(u.get(i).isProfessor()) {
				this.painel.getTabelaAcervo().setRow(new Object[] {u.get(i).getId(),u.get(i).getMatricula(),
						u.get(i).getCpf(),u.get(i).getNome(),"Sim","",u.get(i).getSituacao(),u.get(i).getEmail(),
						u.get(i).getTelefone(),u.get(i).getDepartamento().getNome()});

			}else {
				this.painel.getTabelaAcervo().setRow(new Object[] {u.get(i).getId(),u.get(i).getMatricula(),
						u.get(i).getCpf(),u.get(i).getNome(),"Não",u.get(i).getCodigo(),u.get(i).getSituacao(),
						u.get(i).getEmail(),u.get(i).getTelefone(),""});
			}
		}
	}

	private Usuario pegarLivroSelecionado(){
		Usuario l = UsuarioDAO.getById((int)this.painel.getTabelaAcervo().pegarSelecionado(0));
		return l;
	}

	public void atualizarTabela() {
		
		if(this.painel.getPalavraChaveRB().isSelected()){
			preencherTabela(UsuarioDAO.getBySituacao("Suspenso"));
		}
		if(this.painel.getTituloRB().isSelected()){
			preencherTabela(UsuarioDAO.getBySituacao("Atrasado"));
		}
		
		if(this.painel.getEditoraRB().isSelected()){
			preencherTabela(UsuarioDAO.getBySituacao("Regularizado"));
		}
		
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("entrou aqui");
		if(e.getSource() == this.painel.getPalavraChaveRB()){
			preencherTabela(UsuarioDAO.getBySituacao("Suspenso"));
			this.painel.getPesquisarButton().setText("Regularizar");
		}
		if(e.getSource() == this.painel.getTituloRB()){
			preencherTabela(UsuarioDAO.getBySituacao("Atrasado"));
		}
		if(e.getSource() == this.painel.getEditoraRB()){
			preencherTabela(UsuarioDAO.getBySituacao("Regularizado"));
			this.painel.getPesquisarButton().setText("Suspender");
			
		}
		if(e.getSource() == this.painel.getPesquisarButton()){
			if(this.painel.getPalavraChaveRB().isSelected()){
				if(UsuarioController.regularizarUsuario(pegarLivroSelecionado())) {
					this.atualizarTabela();
					JOptionPane.showMessageDialog(painel, "Usuario Regularizado");

				}else {
					JOptionPane.showMessageDialog(painel, "Operação Impossivel");
				}
			}
			if(this.painel.getTituloRB().isSelected()){
			}
			
			if(this.painel.getEditoraRB().isSelected()){
				if(UsuarioController.suspenderUsuario(pegarLivroSelecionado())) {
					this.atualizarTabela();
					JOptionPane.showMessageDialog(painel, "Usuario Suspenso");

				}else {
					JOptionPane.showMessageDialog(painel, "Operação Impossivel");
				}
			}
		}

	}


}





