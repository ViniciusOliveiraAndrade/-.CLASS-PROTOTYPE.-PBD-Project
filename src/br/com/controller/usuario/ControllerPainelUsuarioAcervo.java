package br.com.controller.usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.com.controller.primaria.ControllerTelaPrincipal;
import br.com.model.beans.Livro;
import br.com.model.controller.LivroController;
import br.com.view.usuario.PainelUsuarioAcervo;

public class ControllerPainelUsuarioAcervo implements ActionListener{

	private PainelUsuarioAcervo painelAcervo;
	private LivroController lc;
	
	public ControllerPainelUsuarioAcervo(PainelUsuarioAcervo painelAcervo) {
		
		this.painelAcervo = painelAcervo;
		this.lc = new LivroController();
		
	}
	
	private void preencherTabela(ArrayList<Livro> livros){
		this.painelAcervo.getTabelaAcervo().zerarTabela();
		for(Livro l : livros) {
			this.painelAcervo.getTabelaAcervo().setRow(new Object[] {l.getId(),l.getCodigo(),l.getNumero_edicao(),l.getTitulo(),l.getAno_publicacao(),l.getNumero_exemplares(),l.getEditora(),l.getAutor().getNome()});
		}
	}
	
	

	public void actionPerformed(ActionEvent e) {
		System.out.println("entrou aqui");
		if(e.getSource() == this.painelAcervo.getPesquisarButton()) {
			if(this.painelAcervo.getPalavraChaveRB().isSelected()){
				preencherTabela(this.lc.getLivroByPalavraChave(this.painelAcervo.getPesquisaField().getText()));
			}
			if(this.painelAcervo.getTituloRB().isSelected()){
				preencherTabela(this.lc.getLivroByTitulo(this.painelAcervo.getPesquisaField().getText()));
			}
			if(this.painelAcervo.getAutorRB().isSelected()){
				preencherTabela(this.lc.getLivroByAutor(this.painelAcervo.getPesquisaField().getText()));
			}
			if(this.painelAcervo.getEditoraRB().isSelected()){
				preencherTabela(this.lc.getLivroByEditora(this.painelAcervo.getPesquisaField().getText()));
			}
		}
		if(e.getSource() == this.painelAcervo.getSolicitarEmprestimoButton()) {

		}
		if(e.getSource() == this.painelAcervo.getSolicitarReservaButton()) {}

	}

	
}

