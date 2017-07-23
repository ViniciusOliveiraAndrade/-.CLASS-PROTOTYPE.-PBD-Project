package br.com.model;

import java.util.Calendar;
import java.util.Date;

import br.com.model.dao.EmprestimoDAO;

public class EmprestimoController {
	
	
	public void criarEmprestimo(Livro livro,Usuario usuario, Funcionario funcionario) {
		Emprestimo emprestimo = new Emprestimo(new Date(), "Em andamento"	, 0.0, livro, usuario, funcionario);
		EmprestimoDAO.persist(emprestimo);
	}
	
	public double devolverEmprestimo(Emprestimo emprestimo,Funcionario funcionario) {
		emprestimo.setSituacao("Fechado");		
		emprestimo.setFuncionario_Devolucao(funcionario);
		emprestimo.setData_entrega(new Date());
		
		if(emprestimo.getData_entrega().after(emprestimo.getData_prevista_entrega())){
			Calendar data1 = Calendar.getInstance();
			Calendar data2 = Calendar.getInstance();
			data2.setTime(emprestimo.getData_entrega());
			data1.setTime(emprestimo.getData_prevista_entrega());
			int dias = data2.get(Calendar.DAY_OF_YEAR) - data1.get(Calendar.DAY_OF_YEAR);
			double multa = (double)dias;
			emprestimo.setMulta(multa);
		}
		
		EmprestimoDAO.merge(emprestimo);
		return emprestimo.getMulta();
	}

}
