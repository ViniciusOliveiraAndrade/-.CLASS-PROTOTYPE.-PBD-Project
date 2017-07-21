package br.com.model.dao;

import java.util.List;

import br.com.model.Emprestismo;


public class EmprestimoDAO {
	@SuppressWarnings("static-access")
	public void persist(Emprestismo object) {
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
	public void remove(Emprestismo object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Emprestismo.class, object.getId());
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
	public void merge(Emprestismo object) {
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
	public Emprestismo getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Emprestismo.class, id);
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public List<Emprestismo> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Emprestismo.class.getName()).getResultList();
	}

	public void removeById(final int id) {
		try {
			Emprestismo cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
