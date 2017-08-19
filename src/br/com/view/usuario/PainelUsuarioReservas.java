package br.com.view.usuario;

import java.awt.CardLayout;

import javax.swing.JPanel;

import br.com.controller.usuario.ControllerPainelUsuarioReservas;
import br.com.view.primaria.TabelaPadrao;

public class PainelUsuarioReservas extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private TabelaPadrao tabelaReservas;
	
	private String cpfUsuarioLogado;
	
	private ControllerPainelUsuarioReservas controller;
	
	public PainelUsuarioReservas(String cpf) {
		this.setLayout(new CardLayout(0, 0));
		this.tabelaReservas = new TabelaPadrao("Minhas Reservas");
		this.tabelaReservas.setColumns(new Object[] {"Id","Titulo do Livro","Data Realização","Data Limite","Data Validação","Funcionario"});
		this.tabelaReservas.setEnabled(false);
		this.add(tabelaReservas);
		this.cpfUsuarioLogado = cpf;
		this.controller = new ControllerPainelUsuarioReservas(this);
	}
	
	public void ativar(){
		this.setVisible(true);
	}

	public void desativar(){
		this.setVisible(false);
	}

	public String getCpfUsuarioLogado() {
		return cpfUsuarioLogado;
	}

	public ControllerPainelUsuarioReservas getController() {
		return controller;
	}

	public TabelaPadrao getTabelaReservas() {
		return tabelaReservas;
	}
	
	
}
