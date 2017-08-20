package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.beans.Autor;

@SuppressWarnings("static-access")
public class AutorDAO {
	public static synchronized void persist(Autor object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().persist(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized void remove(Autor object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Autor.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized void merge(Autor object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().merge(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	
	public static synchronized Autor getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Autor.class, id);
	}
	
	public static synchronized Autor getByNome(final String nome) {
		Autor a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select autor from Autor autor where nome = ?");
            query.setParameter(0, nome);
            a = (Autor) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		
		return a;
	}

	@SuppressWarnings( "unchecked")
	public static synchronized List<Autor> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Autor.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Autor cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
