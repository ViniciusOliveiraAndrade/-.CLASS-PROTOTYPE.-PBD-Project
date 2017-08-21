package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.beans.Usuario;
@SuppressWarnings({"static-access","unchecked"})
public class UsuarioDAO {
	
	public static synchronized void persist(Usuario object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().persist(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	public static synchronized void remove(Usuario object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Usuario.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	public static synchronized void merge(Usuario object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().merge(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
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
		}
		
		return u;
	}
	
	public static synchronized List<Usuario>  getBySituacao(String cpf) {
		List<Usuario>  u = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select usuario from Usuario usuario where situacao = ?");
            query.setParameter(0, cpf);
            u =  query.getResultList();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		
		return u;
	}
	
	
	public static synchronized Usuario getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Usuario.class, id);
	}

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
