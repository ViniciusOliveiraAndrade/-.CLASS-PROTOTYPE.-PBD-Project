package br.com.main;

import java.util.Date;

import br.com.model.beans.Autor;
import br.com.model.beans.Funcionario;
import br.com.model.beans.Livro;
import br.com.model.beans.Usuario;
import br.com.model.dao.FuncionarioDAO;
import br.com.model.dao.LivroDAO;
import br.com.model.dao.UsuarioDAO;

public class Testes {
	
	public static void main(String[] args) {
	
		Livro l = new Livro(1, 1, 10, "oi eu sou omgoku", new Autor("Vinicius"), "dsds", new Date());
		LivroDAO.persist(l);
//		Funcionario f = new Funcionario(1, "1234", "viniFum");
//		FuncionarioDAO.persist(f);
//		Usuario u = new Usuario(1, "12",3, "daw", "ferrou", "vinic", "sdsd");
//		UsuarioDAO.persist(u);
	}

}
