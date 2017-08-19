package br.com.controller.usuario;

import java.util.List;

import br.com.model.beans.Reserva;
import br.com.model.dao.ReservaDAO;
import br.com.view.usuario.PainelUsuarioReservas;

public class ControllerPainelUsuarioReservas {

	private PainelUsuarioReservas painelUsuarioReservas;

	public ControllerPainelUsuarioReservas(PainelUsuarioReservas painelUsuarioReservas) {

		this.painelUsuarioReservas = painelUsuarioReservas;
		preencherTabela();
	}

	public void preencherLinhaTabela(Reserva r){
		if(r.getFuncionario()!= null) {
			this.painelUsuarioReservas.getTabelaReservas().setRow(new Object[] {r.getId(),r.getLivro().getTitulo(),r.getData_realizacao(),r.getData_limite(),r.getData_validacao(),r.getFuncionario().getNome()});
		}else {
			this.painelUsuarioReservas.getTabelaReservas().setRow(new Object[] {r.getId(),r.getLivro().getTitulo(),r.getData_realizacao(),r.getData_limite(),"",""});
		}
	}

	public void preencherTabela(){
		this.painelUsuarioReservas.getTabelaReservas().zerarTabela();
		List<Reserva> minhasReservas = ReservaDAO.getByCpf(this.painelUsuarioReservas.getCpfUsuarioLogado());
		for (int i = 0; i < minhasReservas.size(); i++) {
			preencherLinhaTabela(minhasReservas.get(i));
		}

	}

}
