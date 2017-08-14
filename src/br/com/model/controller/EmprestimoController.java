package br.com.model.controller;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.model.beans.Emprestimo;
import br.com.model.beans.Funcionario;
import br.com.model.beans.Livro;
import br.com.model.beans.Usuario;
import br.com.model.dao.EmprestimoDAO;

public class EmprestimoController {
	
	
	public void criarEmprestimo(Livro livro,Usuario usuario, Funcionario funcionario) {
		int qt = Math.toIntExact(EmprestimoDAO.getQuantidadeEmprestimos(usuario.getCpf()));
		
		if((usuario.isProfessor() &&  qt < 5)|| (!usuario.isProfessor() && qt <3 ) ) {
			Emprestimo emprestimo = new Emprestimo(new Date(), "Em andamento"	, 0.0, livro, usuario, funcionario);
			EmprestimoDAO.persist(emprestimo);
		}else {
			JOptionPane.showMessageDialog(null, "Erro:Numero máximo de emprestimo");
		}
		
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
