package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.beans.Curso;

@SuppressWarnings("static-access")
public class CursoDAO {
	public static synchronized void persist(Curso object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().persist(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	public static synchronized void remove(Curso object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Curso.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}

	public static synchronized void merge(Curso object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().merge(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	public static synchronized Curso getByNome(final String nome) {
		Curso a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select c from Curso c where nome = ?");
            query.setParameter(0, nome);
            a = (Curso) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		return a;
	}
	
	public static synchronized Curso getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Curso.class, id);
	}

	@SuppressWarnings("unchecked")
	public static synchronized List<Curso> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Curso.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Curso cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
