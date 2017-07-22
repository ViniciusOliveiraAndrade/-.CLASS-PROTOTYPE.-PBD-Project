package br.com.model.dao;

import java.util.List;

public class DAO {

	@SuppressWarnings("static-access")
	public void persist(Object object) {
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
	public void remove(Object object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
//			object = Connection.getInstance().getEntityManager().find(Object.class, object.getId());
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
	public void merge(Object object) {
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
	public Object getById(Object a,final int id) {
		return Connection.getInstance().getEntityManager().find(a.getClass(), id);
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public List<Object> findAll(Object o) {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + o.getClass().getName()).getResultList();
	}

	public void removeById(Object a,final int id) {
		try {
			Object cliente = getById(a,id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
 
}