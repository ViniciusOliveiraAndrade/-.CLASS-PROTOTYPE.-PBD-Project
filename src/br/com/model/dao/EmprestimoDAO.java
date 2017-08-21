package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.beans.Emprestimo;
import br.com.model.beans.Saldo;
import br.com.model.beans.Usuario;

@SuppressWarnings({ "unchecked", "static-access" })
public class EmprestimoDAO {
	
	public static synchronized void persist(Emprestimo object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().persist(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	public static synchronized void remove(Emprestimo object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Emprestimo.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	public static synchronized void merge(Emprestimo object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().merge(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	
	public static synchronized List<Emprestimo> getByCpf(String cpf) {
		List<Emprestimo> emprestimos = null;
		Usuario u = UsuarioDAO.getByCpf(cpf);
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select emprestimo from Emprestimo emprestimo where usuario_id = ?");
            query.setParameter(0, u.getId());
            emprestimos =  query.getResultList();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		
		return emprestimos;
	}
	public static synchronized long getQuantidadeEmprestimos(String cpf) {
		long qt = 0;
		Usuario u = UsuarioDAO.getByCpf(cpf);
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select count(emprestimo) from Emprestimo emprestimo where usuario_id = ? and emprestimo.situacao = 'Em andamento'");
            query.setParameter(0, u.getId());
            qt = (long) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		
		return qt;
	}
	
	public static synchronized Emprestimo getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Emprestimo.class, id);
	}

	public static synchronized List<Emprestimo> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Emprestimo.class.getName()).getResultList();
	}
	
	public static synchronized List<Saldo> getCaixa() {
		return Connection.getInstance().getEntityManager().createQuery("select s from Saldo s" ).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Emprestimo cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
