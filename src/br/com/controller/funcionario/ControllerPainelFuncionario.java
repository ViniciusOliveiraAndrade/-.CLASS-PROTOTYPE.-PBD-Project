package br.com.controller.funcionario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import br.com.view.funcionario.PainelFuncionario;

public class ControllerPainelFuncionario extends Observable implements ActionListener{
	
	private PainelFuncionario painelFuncionario;
	
	private boolean logado = true;
	
	public ControllerPainelFuncionario(PainelFuncionario painelFuncionario) {
		this.painelFuncionario = painelFuncionario;
	}

	
	private void deslogar() {
		this.logado = false;
		this.setChanged();
		this.notifyObservers(this.logado);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
