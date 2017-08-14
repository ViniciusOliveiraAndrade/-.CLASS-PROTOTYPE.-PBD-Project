package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.model.controller.EmprestimoController;
import br.com.model.dao.EmprestimoDAO;
import br.com.view.TDevolverEmprestimo;

public class CTDevolverEmprestimo implements ActionListener{
	
	private TDevolverEmprestimo tela;
	private EmprestimoController ec;
	public CTDevolverEmprestimo(TDevolverEmprestimo tela) {
		this.tela = tela;
		this.ec = new EmprestimoController();
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this.tela, "Sua multa é de R$"+this.ec.devolverEmprestimo(EmprestimoDAO.getById(Integer.parseInt(this.tela.getIdEmprestimoF().getText())), this.tela.getFuncionarioLogado())+"0");
	}
}
