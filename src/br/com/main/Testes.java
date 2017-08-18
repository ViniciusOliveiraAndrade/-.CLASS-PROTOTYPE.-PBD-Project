package br.com.main;

import java.util.Date;

import br.com.model.beans.Autor;
import br.com.model.beans.Livro;
import br.com.model.dao.LivroDAO;

public class Testes {
	
	public static void main(String[] args) {
	
		Livro l = new Livro(1, 1, 10, "oi eu sou omgoku", new Autor("Vinicius"), "dsds", new Date());
		LivroDAO.persist(l);
	}

}
