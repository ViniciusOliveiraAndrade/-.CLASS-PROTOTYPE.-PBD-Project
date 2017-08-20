package br.com.controller.funcionario.cadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import br.com.model.beans.Autor;
import br.com.model.beans.Livro;
import br.com.model.dao.AutorDAO;
import br.com.model.dao.LivroDAO;
import br.com.view.funcionario.cadastro.PainelCadastroLivro;

public class ControllerPainelCadastrarLivro implements ActionListener{
	
	private PainelCadastroLivro painel;
	
	private List<Autor> d;
	
	public ControllerPainelCadastrarLivro(PainelCadastroLivro painel) {
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
	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.painel.getCadastrarButton()) {
			
				LivroDAO.persist(new Livro(Integer.parseInt(this.painel.getCodigoField().getText()),
						Integer.parseInt(this.painel.getEdicaoField().getText()), 
						Integer.parseInt(this.painel.getExemplaresField().getText()), 
						this.painel.getTituloField().getText(), 
						pegarAutor(), 
						this.painel.getEditoraField().getText(), 
						this.painel.getDataPublicacaoField().getText()));
		}
		
		if (e.getSource() == this.painel.getLimparButton()) {limparTela();}
		
		
	}
}
