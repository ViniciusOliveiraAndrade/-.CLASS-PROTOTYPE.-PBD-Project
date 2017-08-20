package br.com.controller.funcionario.altera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.model.beans.Autor;
import br.com.model.beans.Livro;
import br.com.model.dao.AutorDAO;
import br.com.model.dao.LivroDAO;
import br.com.view.funcionario.altera.PainelAlteraLivro;

public class ControllerPainelAlteraLivro implements ActionListener{

	private PainelAlteraLivro painel;

	private List<Autor> d;

	private Livro livro;	
	
	public ControllerPainelAlteraLivro(PainelAlteraLivro painel) {
		this.painel = painel;
		d = AutorDAO.findAll();
	}

	public void preencherAutores() {
		for(int i = 0; i <d.size(); i++){
			this.painel.getAutoresFields().addItem(d.get(i).getNome());
		}
	}
	public Autor pegarAutor() {
		Autor dep = null;

		for(int i = 0; i <d.size(); i++){
			if(d.get(i).getNome().equals(this.painel.getAutoresFields().getSelectedItem())) {
				return d.get(i);
			}
		}
		return dep;
	}
	public void limparTela(){
		this.painel.getCodigoField().setText(""); 
		this.painel.getEdicaoField().setText(""); 
		this.painel.getEditoraField().setText(""); 
		this.painel.getExemplaresField().setText("");
		this.painel.getTituloField().setText("");
		this.painel.getDataPublicacaoField().setText("");
		this.painel.getBuscarField().setText("");
		this.livro = null;

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.painel.getBuscarButton()) {
			try {
				this.livro = LivroDAO.getByNome(this.painel.getBuscarField().getText());
					
				this.painel.getCodigoField().setText(String.valueOf(this.livro.getCodigo())); 
				this.painel.getEdicaoField().setText(String.valueOf(this.livro.getNumero_edicao())); 
				this.painel.getEditoraField().setText(this.livro.getEditora()); 
				this.painel.getExemplaresField().setText(String.valueOf(this.livro.getNumero_exemplares()));
				this.painel.getTituloField().setText(this.livro.getTitulo());
				this.painel.getDataPublicacaoField().setText(this.livro.getAno_publicacao());
					
				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this.painel, "Departamento Não Encontrado");
			}
		}

		if (e.getSource() == this.painel.getCadastrarButton()) {
			if(this.livro != null) {

				
//				Integer.parseInt(this.painel.getCodigoField().getText()) 
//				Integer.parseInt(this.painel.getEdicaoField().getText()) 
//				this.painel.getEditoraField().getText()
//				Integer.parseInt(this.painel.getExemplaresField().getText())
//				this.painel.getTituloField().getText()
//				this.painel.getDataPublicacaoField().getText()
//				
				
				LivroDAO.merge(this.livro);
				JOptionPane.showMessageDialog(this.painel, "Departamento Atualizado com Sucesso");
				this.limparTela();
			}
		}

		if (e.getSource() == this.painel.getExcluirButton()) {
			if(this.livro != null) {
				LivroDAO.remove(this.livro);
				this.livro = null;
				this.limparTela();
			}
		}

		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}


	}
}
