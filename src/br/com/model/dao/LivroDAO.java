package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.beans.Livro;


@SuppressWarnings("static-access")

public class LivroDAO {
	public static synchronized void persist(Livro object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().persist(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	public static synchronized void remove(Livro object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Livro.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	public static synchronized void merge(Livro object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().merge(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	
	public static synchronized Livro getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Livro.class, id);
	}

	public static synchronized Livro getByNome(final String nome) {
		Livro a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select c from Livro c where titulo = ?");
            query.setParameter(0, nome);
            a = (Livro) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		return a;
	}
	@SuppressWarnings("unchecked")
	public static synchronized List<Livro> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Livro.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Livro cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
