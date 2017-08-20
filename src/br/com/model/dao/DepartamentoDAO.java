package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.beans.Departamento;

@SuppressWarnings("static-access")

public class DepartamentoDAO {
	public static synchronized void persist(Departamento object) {
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
		}
	}
	public static synchronized void merge(Departamento object) {
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
	public static synchronized Departamento getByNome(final String nome) {
		Departamento a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select c from Departamento c where nome = ?");
            query.setParameter(0, nome);
            a = (Departamento) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		return a;
	}
	public static synchronized Departamento getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Departamento.class, id);
	}

	@SuppressWarnings("unchecked")
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
