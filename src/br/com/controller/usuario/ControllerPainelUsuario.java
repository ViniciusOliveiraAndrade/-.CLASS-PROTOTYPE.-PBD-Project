package br.com.controller.usuario;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import br.com.controller.primaria.ControllerTelaPrincipal;
import br.com.view.usuario.PainelUsuario;

public class ControllerPainelUsuario  extends Observable implements ActionListener{

	private PainelUsuario painelUsuario;

	private boolean logado = true;
	
	public ControllerPainelUsuario(PainelUsuario painelUsuario, ControllerTelaPrincipal c) {
		this.painelUsuario = painelUsuario;
		this.addObserver(c);
	}
	
	private void deslogar() {
		this.logado = false;
		this.setChanged();
		this.notifyObservers(this.logado);
	}

	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == this.painelUsuario.getDeslogarButton()) {
			this.deslogar();
		}
		
		if(e.getSource() == this.painelUsuario.getMeusStatusButton()) {
			this.painelUsuario.getPainelReservas().desativar();
			this.painelUsuario.getPainelEmprestimos().desativar();
			this.painelUsuario.getPainelAcervo().desativar();
			this.painelUsuario.add(this.painelUsuario.getPainelStatus(), BorderLayout.CENTER);
			this.painelUsuario.getPainelStatus().ativar();
		}
		
		if(e.getSource() == this.painelUsuario.getAcervoButton()) {
			
			this.painelUsuario.getPainelReservas().desativar();
			this.painelUsuario.getPainelEmprestimos().desativar();
			this.painelUsuario.getPainelStatus().desativar();
			this.painelUsuario.add(this.painelUsuario.getPainelAcervo().getTabelaAcervo(), BorderLayout.CENTER);
			this.painelUsuario.add(this.painelUsuario.getPainelAcervo().getPainelOpcoes(), BorderLayout.EAST);
			this.painelUsuario.add(this.painelUsuario.getPainelAcervo().getPainelPesquisa(), BorderLayout.SOUTH);
			this.painelUsuario.getPainelAcervo().ativar();
			
			
		}
		
		if(e.getSource() == this.painelUsuario.getEmprestimosButton()) {
			
			this.painelUsuario.getPainelStatus().desativar();
			this.painelUsuario.getPainelAcervo().desativar();
			this.painelUsuario.getPainelReservas().desativar();
			this.painelUsuario.getPainelEmprestimos().getController().preencherTabela();
			this.painelUsuario.add(this.painelUsuario.getPainelEmprestimos(), BorderLayout.CENTER);
			this.painelUsuario.getPainelEmprestimos().ativar();
		}

		if(e.getSource() == this.painelUsuario.getReservasButton()) {
			
			this.painelUsuario.getPainelStatus().desativar();
			this.painelUsuario.getPainelEmprestimos().desativar();
			this.painelUsuario.getPainelAcervo().desativar();
			this.painelUsuario.getPainelReservas().getController().preencherTabela();
			this.painelUsuario.add(this.painelUsuario.getPainelReservas(), BorderLayout.CENTER);
			this.painelUsuario.getPainelReservas().ativar();
		}

	}
	
	public boolean isLogado() {
		return logado;
	}
}