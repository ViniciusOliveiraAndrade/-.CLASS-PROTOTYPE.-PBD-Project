package br.com.view.funcionario;

import javax.swing.JPanel;

import br.com.model.beans.Funcionario;

public class PainelFuncionario extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private Funcionario funcionario;
	
	public PainelFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
