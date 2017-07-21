package br.com.model.dao;

import java.util.List;

import br.com.model.Reserva;


public class ReservaDAO {
	@SuppressWarnings("static-access")
	public void persist(Reserva object) {
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
	public void remove(Reserva object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Reserva.class, object.getId());
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
	public void merge(Reserva object) {
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
	public Reserva getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Reserva.class, id);
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public List<Reserva> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Reserva.class.getName()).getResultList();
	}

	public void removeById(final int id) {
		try {
			Reserva cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
