package br.com.model.dao;

import java.util.List;

import br.com.model.Funcionario;


public class FuncionarioDAO {
	@SuppressWarnings("static-access")
	public void persist(Funcionario object) {
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
	public void remove(Funcionario object) {
		try {
			Connection.getInstance().getEntityManager().getTransaction().begin();
			object = Connection.getInstance().getEntityManager().find(Funcionario.class, object.getId());
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
	public void merge(Funcionario object) {
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
	public Funcionario getById(final int id) {
		return Connection.getInstance().getEntityManager().find(Funcionario.class, id);
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public List<Funcionario> findAll() {
		return Connection.getInstance().getEntityManager().createQuery("FROM " + Funcionario.class.getName()).getResultList();
	}

	public void removeById(final int id) {
		try {
			Funcionario cliente = getById(id);
			remove(cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
