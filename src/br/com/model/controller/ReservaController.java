package br.com.model.controller;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.model.beans.Funcionario;
import br.com.model.beans.Livro;
import br.com.model.beans.Reserva;
import br.com.model.beans.Usuario;
import br.com.model.dao.EmprestimoDAO;
import br.com.model.dao.ReservaDAO;

public class ReservaController {
	
	public void solicitarReserva(Livro livro,Usuario usuario) {
		
		int qt = Math.toIntExact(EmprestimoDAO.getQuantidadeEmprestimos(usuario.getCpf()));
		
		if((usuario.isProfessor() &&  qt < 5)|| (!usuario.isProfessor() && qt <3 ) || 
				(!usuario.getSituacao().equals("Suspenso"))|| (!usuario.getSituacao().equals("Atrasado"))) {
			Reserva reserva = new Reserva(new Date(), livro, usuario,null);
			ReservaDAO.persist(reserva);
		}else {
			JOptionPane.showMessageDialog(null, "Erro:Numero m�ximo de emprestimo");
		}
		
	}
	
	public void aprovarReserva(Reserva reserva,Funcionario funcionario) {
		reserva.setFuncionario(funcionario);
		reserva.setSituacao("Fechado");
		reserva.setData_validacao(new Date());
		EmprestimoController ec = new EmprestimoController();
		ec.criarEmprestimo(reserva.getLivro(), reserva.getUsuario(), funcionario);
		ReservaDAO.merge(reserva);
		
	}

}
