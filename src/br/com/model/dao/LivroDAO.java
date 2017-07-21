package br.com.model.dao;

import java.util.List;

import br.com.model.Livro;



public class LivroDAO {
	@SuppressWarnings("static-access")
	public void persist(Livro object) {
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
	public void remove(Livro object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Livro.class, object.getId());
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
	public void merge(Livro object) {
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
	public Livro getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Livro.class, id);
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public List<Livro> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Livro.class.getName()).getResultList();
	}

	public void removeById(final int id) {
		try {
			Livro cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
