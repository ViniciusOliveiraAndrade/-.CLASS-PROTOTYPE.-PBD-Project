package br.com.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.view.TEscolhaEmprestimo;

public class CTEscolhaEmprestimo implements ActionListener{

	private TEscolhaEmprestimo tela;

	public CTEscolhaEmprestimo(TEscolhaEmprestimo tela) {
		this.tela = tela;
		this.tela.getEmprestarB().addActionListener(this);
		this.tela.getDevolverB().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tela.getEmprestarB()) {
			System.out.println("Empre");
		}
		if(e.getSource() == tela.getDevolverB()) {
			System.out.println("Devolve");
		}
	}



}
