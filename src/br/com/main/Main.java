package br.com.main;


import java.util.Date;
import java.util.List;

import br.com.model.Autor;
import br.com.model.Emprestimo;
import br.com.model.EmprestimoController;
import br.com.model.Funcionario;
import br.com.model.Livro;
import br.com.model.Usuario;
import br.com.model.dao.AutorDAO;
import br.com.model.dao.Connection;
import br.com.model.dao.EmprestimoDAO;
import br.com.model.dao.FuncionarioDAO;
import br.com.model.dao.LivroDAO;
import br.com.model.dao.UsuarioDAO;
import br.com.view.TCadastrarEmprestimo;
import br.com.view.TInicio;

public class Main {

	public static void main(String[] args) {
//		new TInicio();
//		Connection.getInstance().getEntityManager();
		//		Autor autorCriado = new Autor();
		//		autorCriado.setNome("vinicius");
		//		AutorDAO.persist(autorCriado);
		//		
		//		Autor autorParaAtualizar = AutorDAO.getById(1);//Devo dizer o id do autor que quero atualizar e atribuo ele a um autor
		//		autorParaAtualizar.setNome("novo nome");
		//		AutorDAO.merge(autorParaAtualizar);
		//		
		//		
		//		
		//		List <Autor> autores = AutorDAO.findAll();
		//		
		//		for (int i = 0; i <100; i ++) {
		//			LivroDAO.persist(new Livro(i, i, i, "test", autores.get(0), "editora", new Date()));
		//		}
		

		//		Usuario u = new Usuario(1, "10602066417", 1, "vini@", "fodido", "Vinicius", "87878", false);
		//		UsuarioDAO.persist(u);
		//		Livro l = new Livro(1, 1, 1, "fodase", null, "sem", new Date());
		//		LivroDAO.persist(l);
		//		Funcionario f = new Funcionario(1, "10602066417", "ViniFuncio");
		//		FuncionarioDAO.persist(f);
		//				Funcionario u = FuncionarioDAO.getByCpf("10602066417");
		//				u.setCpf("10602066416");
		//				FuncionarioDAO.merge(u);
		//		System.out.println(u.getNome());

		//		new TCadastrarEmprestimo(FuncionarioDAO.getByCpf("10602066417"));	
		
//		System.out.println(EmprestimoDAO.getById(4).getUsuario().getEmail());

	} 
}
