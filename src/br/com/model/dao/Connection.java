package br.com.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {

	private static Connection instance;
	private static EntityManager entityManager;

	private Connection(){
		entityManager = getEntityManager();
	}

	public static synchronized EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pbd-PU");
		if (entityManager == null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public static synchronized Connection getInstance(){
		if (instance == null){
			instance = new Connection();
		}
		return instance;
	}

}
