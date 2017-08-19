package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.beans.Reserva;
import br.com.model.beans.Usuario;


public class ReservaDAO {
	@SuppressWarnings("static-access")
	public static synchronized void persist(Reserva object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().persist(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
//			Connection.getInstance().getEntityManager().close();
		}
	}
	@SuppressWarnings("static-access")
	public static synchronized void remove(Reserva object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Reserva.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
//			Connection.getInstance().getEntityManager().close();
		}
	}
	@SuppressWarnings("static-access")
	public static synchronized void merge(Reserva object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().merge(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
//			Connection.getInstance().getEntityManager().close();
		}
	}
	
	@SuppressWarnings({ "static-access", "unchecked" })
	public static synchronized List<Reserva> getByCpf(String cpf) {
		List<Reserva> reservas = null;
		Usuario u = UsuarioDAO.getByCpf(cpf);
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select reserva from Reserva reserva where usuario_id = ?");
            query.setParameter(0, u.getId());
            reservas =  query.getResultList();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
//			Connection.getInstance().getEntityManager().close();
		}
		
		return reservas;
	}
	
	@SuppressWarnings("static-access")
	public static synchronized Reserva getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Reserva.class, id);
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public static synchronized List<Reserva> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Reserva.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Reserva cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
