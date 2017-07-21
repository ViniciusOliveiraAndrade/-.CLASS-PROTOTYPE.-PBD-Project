package br.com.model.dao;

import java.util.List;

import br.com.model.Autor;


public class AutorDAO {
	@SuppressWarnings("static-access")
	public void persist(Autor object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().persist(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
			Connection.getInstance().getEntityManager().close();
		}
	}
	@SuppressWarnings("static-access")
	public void remove(Autor object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Autor.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
			Connection.getInstance().getEntityManager().close();
		}
	}
	@SuppressWarnings("static-access")
	public void merge(Autor object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().merge(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
			Connection.getInstance().getEntityManager().close();
		}
	}
	
	@SuppressWarnings("static-access")
	public Autor getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Autor.class, id);
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public List<Autor> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Autor.class.getName()).getResultList();
	}

	public void removeById(final int id) {
		try {
			Autor cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
