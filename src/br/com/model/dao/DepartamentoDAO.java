package br.com.model.dao;

import java.util.List;

import br.com.model.beans.Departamento;


public class DepartamentoDAO {
	@SuppressWarnings("static-access")
	public static synchronized void persist(Departamento object) {
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
	public static synchronized void remove(Departamento object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Departamento.class, object.getId());
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
	public static synchronized void merge(Departamento object) {
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
	public static synchronized Departamento getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Departamento.class, id);
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public static synchronized List<Departamento> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Departamento.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Departamento cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
