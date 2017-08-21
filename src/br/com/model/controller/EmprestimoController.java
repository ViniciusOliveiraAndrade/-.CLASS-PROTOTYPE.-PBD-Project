package br.com.model.controller;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.model.beans.Emprestimo;
import br.com.model.beans.Funcionario;
import br.com.model.beans.Livro;
import br.com.model.beans.Usuario;
import br.com.model.dao.EmprestimoDAO;
import br.com.model.dao.UsuarioDAO;

public class EmprestimoController {

	public boolean podeEmprestar(Usuario u) {
		int qt = Math.toIntExact(EmprestimoDAO.getQuantidadeEmprestimos(u.getCpf()));
		System.out.println(qt);
		boolean pode = false;

		if(u.getSituacao().equalsIgnoreCase("Regularizado")) {
			if ((u.isProfessor() &&  qt < 5)|| (!u.isProfessor() && qt <3 ) ) {
				pode = true;
			}else {
				JOptionPane.showMessageDialog(null, "Erro:Numero m�ximo de emprestimo");
			}
		}else {JOptionPane.showMessageDialog(null, "Erro: Usuario "+u.getSituacao());}
		return pode;

	}

	public void criarEmprestimo(Livro livro,Usuario usuario, Funcionario funcionario) {


		if(podeEmprestar(usuario)) {
			Emprestimo emprestimo = new Emprestimo(new Date(), "Em andamento"	, 0.0, livro, usuario, funcionario);
			EmprestimoDAO.persist(emprestimo);
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
			if (dias >7) {
				emprestimo.getUsuario().setSituacao("Suspenso");
				UsuarioDAO.merge(emprestimo.getUsuario());
			}
		}

		EmprestimoDAO.merge(emprestimo);
		return emprestimo.getMulta();
	}

	//	public void solicitarEmprestimo(Livro livro,Usuario usuario) {
	//		int qt = Math.toIntExact(EmprestimoDAO.getQuantidadeEmprestimos(usuario.getCpf()));
	//		
	//		if((usuario.isProfessor() &&  qt < 5)|| (!usuario.isProfessor() && qt <3 ) ) {
	//			Emprestimo emprestimo = new Emprestimo(new Date(), "Espera"	, 0.0, livro, usuario, null);
	//			EmprestimoDAO.persist(emprestimo);
	//		}else {
	//			JOptionPane.showMessageDialog(null, "Erro:Numero m�ximo de emprestimo");
	//		}
	//		
	//	}
	//	
	//	public void aprovarEmprestimo(Emprestimo emprestimo,Funcionario funcionario) {
	//		emprestimo.setSituacao("Fechado");		
	//		emprestimo.setFuncionario_Emprestimo(funcionario);
	//		
	//		EmprestimoDAO.merge(emprestimo);
	//		
	//	}

}
