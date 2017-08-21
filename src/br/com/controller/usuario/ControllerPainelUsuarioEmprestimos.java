package br.com.controller.usuario;

import java.util.List;

import br.com.model.beans.Emprestimo;
import br.com.model.dao.EmprestimoDAO;
import br.com.view.usuario.PainelUsuarioEmprestimos;

public class ControllerPainelUsuarioEmprestimos {
	
	private PainelUsuarioEmprestimos painelUsuarioEmprestimos;
	
	public ControllerPainelUsuarioEmprestimos(PainelUsuarioEmprestimos painelUsuarioEmprestimos) {
		this.painelUsuarioEmprestimos = painelUsuarioEmprestimos;
	}
	
	public void preencherLinhaTabela(Emprestimo e){
		if(e.getSituacao().equals("Em andamento")) {
			this.painelUsuarioEmprestimos.getTabelaEmprestimos().setRow(new Object[] {e.getId(),e.getLivro().getTitulo(),e.getSituacao(),e.getData_emprestimo(),e.getData_prevista_entrega(),"",e.getMulta(),e.getFuncionario_Emprestimo().getNome(),""});
		}else {
			this.painelUsuarioEmprestimos.getTabelaEmprestimos().setRow(new Object[] {e.getId(),e.getLivro().getTitulo(),e.getSituacao(),e.getData_emprestimo(),e.getData_prevista_entrega(),e.getData_entrega(),e.getMulta(),e.getFuncionario_Emprestimo().getNome(),e.getFuncionario_Devolucao().getNome()});
		}
	}

	public void preencherTabela(){
		this.painelUsuarioEmprestimos.getTabelaEmprestimos().zerarTabela();
		List<Emprestimo> meusEmprestimos = EmprestimoDAO.getByCpf(this.painelUsuarioEmprestimos.getCpfUsuarioLogado());
		for (int i = 0; i < meusEmprestimos.size(); i++) {
			preencherLinhaTabela(meusEmprestimos.get(i));
		}

	}

}
