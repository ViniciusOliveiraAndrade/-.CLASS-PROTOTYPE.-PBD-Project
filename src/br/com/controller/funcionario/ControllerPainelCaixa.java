package br.com.controller.funcionario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


import br.com.model.beans.Caixa;
import br.com.model.beans.Saldo;
import br.com.view.funcionario.PainelCaixa;

public class ControllerPainelCaixa implements ActionListener{

	private PainelCaixa painel;
	private Caixa c;
	public ControllerPainelCaixa(PainelCaixa painelAcervo) {
		this.c = new Caixa();
		this.painel = painelAcervo;
		this.preencherTabela(c.getCaixa());
	}

	private void preencherTabela(List<Saldo> s){
		this.painel.getTabelaAcervo().zerarTabela();
		for(int i = 0; i < s.size(); i ++) {
			this.painel.getTabelaAcervo().setRow(new Object[] {s.get(i).getId(),s.get(i).getData(),s.get(i).getUsuario(),s.get(i).getUsuario()});
		}
	}
	
	public void atualizar(){
		this.c = new Caixa();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.painel.getPesquisarButton()) {
			this.atualizar();
			this.preencherTabela(c.getCaixa());
		}
	}
}

