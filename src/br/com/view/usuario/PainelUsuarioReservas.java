package br.com.view.usuario;

import java.awt.CardLayout;

import javax.swing.JPanel;

import br.com.model.beans.Usuario;
import br.com.view.primaria.TabelaPadrao;

public class PainelUsuarioReservas extends JPanel{

	private static final long serialVersionUID = 1L;
	private TabelaPadrao tabelaEmrpestimos;
	public PainelUsuarioReservas(Usuario usuario) {
		this.setLayout(new CardLayout(0, 0));
		this.tabelaEmrpestimos = new TabelaPadrao("Minhas Reservas");
		this.tabelaEmrpestimos.setColumns(new Object[] {"Id","Titulo do Livro","Situação","Data do Emprestimo","Data presvista Entrega","Data da Entrega","Multa","Funcionario Emprestimo","Funcionario Devolução"});
		this.add(tabelaEmrpestimos);
	}
	
	public void ativar(){
		this.setVisible(true);
	}

	public void desativar(){
		this.setVisible(false);
	}

}
