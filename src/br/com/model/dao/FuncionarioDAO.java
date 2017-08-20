package br.com.model.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.model.beans.Funcionario;

@SuppressWarnings("static-access")

public class FuncionarioDAO {
	public static synchronized void persist(Funcionario object) {
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
	public static synchronized void remove(Funcionario object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Funcionario.class, object.getId());
			Connection.getInstance().getEntityManager().remove(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}finally {
		}
	}
	public static synchronized Funcionario getByNome(final String nome) {
		Funcionario a = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select c from Funcionario c where nome = ?");
            query.setParameter(0, nome);
            a = (Funcionario) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		return a;
	}
	
	public static synchronized void merge(Funcionario object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Connection.getInstance().getEntityManager().merge(object);
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
	}
	
	public static synchronized Funcionario getByCpf(String cpf) {
		Funcionario u = null;
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			Query query = Connection.getInstance().getEntityManager().createQuery("select funcionario from Funcionario funcionario where cpf = ?");
            query.setParameter(0, cpf);
            u = (Funcionario) query.getSingleResult();
			Connection.getInstance().getEntityManager().getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			Connection.getInstance().getEntityManager().getTransaction().rollback();
		}
		return u;
	}
	public static synchronized Funcionario getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Funcionario.class, id);
	}

	@SuppressWarnings( "unchecked")
	public static synchronized List<Funcionario> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Funcionario.class.getName()).getResultList();
	}

	public static synchronized void removeById(final int id) {
		try {
			Funcionario cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
