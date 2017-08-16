package br.com.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import br.com.model.beans.Emprestimo;
import br.com.model.dao.EmprestimoDAO;
import br.com.view.Antiga.TMeusEmprestimos;

public class CTMeusEmprestimos implements ActionListener {

	private TMeusEmprestimos tela;


	public CTMeusEmprestimos(TMeusEmprestimos tela) {
		this.tela= tela;
//		preencherTabela();

	}
	public void preencherLinhaTabela(Emprestimo e){
		if(e.getSituacao().equals("Em andamento")) {
			this.tela.getModel().addRow(new Object[] {e.getId(),e.getLivro().getTitulo(),e.getSituacao(),e.getData_emprestimo(),e.getData_prevista_entrega(),"",e.getMulta(),e.getFuncionario_Emprestimo().getNome(),""});

		}else {
			this.tela.getModel().addRow(new Object[] {e.getId(),e.getLivro().getTitulo(),e.getSituacao(),e.getData_emprestimo(),e.getData_prevista_entrega(),e.getData_entrega(),e.getMulta(),e.getFuncionario_Emprestimo().getNome(),e.getFuncionario_Devolucao().getNome()});
		}
	}

	public void preencherTabela(){
		this.tela.getModel().setRowCount(0);
		List<Emprestimo> meusEmprestimos = EmprestimoDAO.getByCpf(this.tela.getCpfUsuarioLogado());
		for (int i = 0; i < meusEmprestimos.size(); i++) {
			preencherLinhaTabela(meusEmprestimos.get(i));
		}

	}

	public void actionPerformed(ActionEvent e) {
		preencherTabela();
	}

}
