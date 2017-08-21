package br.com.model.beans;

import java.util.Date;
import java.util.List;

import br.com.model.dao.EmprestimoDAO;

public class Caixa {
	
	private List<Saldo> caixa;
	
	public Caixa() {
		caixa = EmprestimoDAO.getCaixa();
	}

	public List<Saldo> getCaixa() {
		return caixa;
	}
	
	public List<Saldo> getCaixaEntre(Date a, Date b) {
		return caixa;
	}
	
	public void setCaixa(List<Saldo> caixa) {
		this.caixa = caixa;
	}
	
	
	
}
