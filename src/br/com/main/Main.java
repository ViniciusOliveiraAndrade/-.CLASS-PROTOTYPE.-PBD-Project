package br.com.main;

import java.util.List;

import br.com.model.Usuario;
import br.com.model.dao.Connection;
import br.com.model.dao.DAO;

public class Main {
	
	
	
		
	
	public static void main(String[] args) {
		
		
		DAO d = new DAO();
		Usuario a = new Usuario(56, "sdfsdfdsf", 564, "soufoda", "ok", "margicap", "Meu umero", false);
		
		Connection.getInstance().getEntityManager();
		
//		d.persist(a);
//		d.removeById(a,2);;
//		System.out.println("Foi tudo");
		
		
	} 
}
