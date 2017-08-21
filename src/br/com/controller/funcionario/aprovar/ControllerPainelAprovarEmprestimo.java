package br.com.controller.funcionario.aprovar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.model.beans.Emprestimo;
import br.com.model.controller.EmprestimoController;
import br.com.model.dao.EmprestimoDAO;
import br.com.view.funcionario.aprovar.PainelAprovarEmprestimo;

public class ControllerPainelAprovarEmprestimo implements ActionListener{

	private PainelAprovarEmprestimo painelAprovarEmprestimo;
	
	private EmprestimoController ec;

	public ControllerPainelAprovarEmprestimo(PainelAprovarEmprestimo painelAprovarEmprestimo) {

		this.painelAprovarEmprestimo = painelAprovarEmprestimo;
		ec = new EmprestimoController();
	}

	public void preencherLinhaTabela(Emprestimo e){
		if(e.getSituacao().equals("Em andamento")) {
			this.painelAprovarEmprestimo.getTabelaReservas().setRow(new Object[] {e.getId(),e.getLivro().getTitulo(),e.getSituacao(),e.getData_emprestimo(),e.getData_prevista_entrega(),"",e.getMulta(),e.getFuncionario_Emprestimo().getNome(),""});
		}else {
			this.painelAprovarEmprestimo.getTabelaReservas().setRow(new Object[] {e.getId(),e.getLivro().getTitulo(),e.getSituacao(),e.getData_emprestimo(),e.getData_prevista_entrega(),e.getData_entrega(),e.getMulta(),e.getFuncionario_Emprestimo().getNome(),e.getFuncionario_Devolucao().getNome()});
		}
	}

	public void preencherTabela(){
		this.painelAprovarEmprestimo.getTabelaReservas().zerarTabela();
		List<Emprestimo> minhasReservas = EmprestimoDAO.findAll();

		for (int i = 0; i < minhasReservas.size(); i++) {
			if(minhasReservas.get(i).getSituacao().equals("Em andamento")) {
				preencherLinhaTabela(minhasReservas.get(i));
			}
		}
	}
	private Emprestimo pegarReserva(){
		Emprestimo r = EmprestimoDAO.getById((int)this.painelAprovarEmprestimo.getTabelaReservas().pegarSelecionado(0));
		return r;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.painelAprovarEmprestimo.getAtualizarButton()) {preencherTabela();}
		if (e.getSource() == this.painelAprovarEmprestimo.getAprovarButton()) {
			try {
				JOptionPane.showMessageDialog(this.painelAprovarEmprestimo, "Sua multa � de R$"+ec.devolverEmprestimo(pegarReserva(), this.painelAprovarEmprestimo.getFuncionario())+"0");
				preencherTabela();
				JOptionPane.showMessageDialog(this.painelAprovarEmprestimo, "Solicitação Concluida");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this.painelAprovarEmprestimo, "Solicitação Rejeitada");
			}
		}
	}
}
