package br.com.controller.funcionario.aprovar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.model.beans.Reserva;
import br.com.model.controller.ReservaController;
import br.com.model.dao.ReservaDAO;
import br.com.view.funcionario.aprovar.PainelAprovarReserva;

public class ControllerPainelAprovarReserva implements ActionListener{

	private PainelAprovarReserva painelAprovarReserva;
	
	private ReservaController rc;

	public ControllerPainelAprovarReserva(PainelAprovarReserva painelAprovarReserva) {

		this.painelAprovarReserva = painelAprovarReserva;
		rc = new ReservaController();
//		preencherTabela();
	}

	public void preencherLinhaTabela(Reserva r){
		if(r.getFuncionario()!= null) {
			this.painelAprovarReserva.getTabelaReservas().setRow(new Object[] {r.getId(),r.getLivro().getTitulo(),r.getData_realizacao(),r.getData_limite(),r.getData_validacao(),r.getFuncionario().getNome()});
		}else {
			this.painelAprovarReserva.getTabelaReservas().setRow(new Object[] {r.getId(),r.getLivro().getTitulo(),r.getData_realizacao(),r.getData_limite(),"",""});
		}
	}

	public void preencherTabela(){
		this.painelAprovarReserva.getTabelaReservas().zerarTabela();
		List<Reserva> minhasReservas = ReservaDAO.findAll();

		for (int i = 0; i < minhasReservas.size(); i++) {
			if(minhasReservas.get(i).getSituacao().equals("Aberto")) {
				preencherLinhaTabela(minhasReservas.get(i));
			}
		}
	}
	private Reserva pegarReserva(){
		Reserva r = ReservaDAO.getById((int)this.painelAprovarReserva.getTabelaReservas().pegarSelecionado(0));
		return r;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.painelAprovarReserva.getAtualizarButton()) {preencherTabela();}
		if (e.getSource() == this.painelAprovarReserva.getAprovarButton()) {
			try {
				rc.aprovarReserva(pegarReserva(), this.painelAprovarReserva.getFuncionario());
				preencherTabela();
				JOptionPane.showMessageDialog(this.painelAprovarReserva, "Solicitação Concluida");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(this.painelAprovarReserva, "Solicitação Rejeitada");
			}
		}
	}
}
