package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.beans.Usuario;

public class UsuarioDAO {
	@SuppressWarnings("static-access")
	public static synchronized void persist(Usuario object) {
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
	public static synchronized void remove(Usuario object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Usuario.class, object.getId());
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
	public static synchronized void merge(Usuario object) {
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
	@SuppressWarnings("static-access")
	public static synchronized Usuario getByCpf(String cpf) {
		Usuario u = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select usuario from Usuario usuario where cpf = ?");
            query.setParameter(0, cpf);
            u = (Usuario) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
//			Connection.getInstance().getEntityManager().close();
		}
		
		return u;
	}
	
	@SuppressWarnings("static-access")
	public static synchronized Usuario getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Usuario.class, id);
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public static synchronized List<Usuario> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Usuario.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Usuario cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
