package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.com.model.Livro;
import br.com.model.LivroController;
import br.com.view.TAcervoBiblioteca;

public class CTAcervoBiblioteca implements ActionListener {
	
	private TAcervoBiblioteca tela;
	private LivroController lc;
	public CTAcervoBiblioteca(TAcervoBiblioteca tela) {
		this.tela = tela;
		 this.lc = new LivroController();
		
	}

	private void preencherTabela(ArrayList<Livro> livros){
		tela.getModel().setNumRows(0);
		for(Livro l : livros) {
			tela.getModel().addRow(new Object[] {l.getId(),l.getCodigo(),l.getNumero_edicao(),l.getTitulo(),l.getAno_publicacao(),l.getNumero_exemplares(),l.getEditora(),l.getAutor().getNome()});
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(tela.getPalavraChaveRB().isSelected()){
			preencherTabela(this.lc.getLivroByPalavraChave(tela.getBuscaTF().getText()));
		}
		if(tela.getTituloRB().isSelected()){
			preencherTabela(this.lc.getLivroByTitulo(tela.getBuscaTF().getText()));
		}
		if(tela.getAutorRB().isSelected()){
			preencherTabela(this.lc.getLivroByAutor(tela.getBuscaTF().getText()));
			
		}
		if(tela.getEditoraRB().isSelected()){
			preencherTabela(this.lc.getLivroByEditora(tela.getBuscaTF().getText()));
		}
	}

}
