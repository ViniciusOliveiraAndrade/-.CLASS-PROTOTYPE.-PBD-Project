package br.com.model.dao;

import java.util.List;
 
import javax.persistence.EntityManager;

import br.com.model.Autor;
 
public class DAO {
 
         protected EntityManager entityManager;
         
 
         public Autor getById(final int id) {
                   return entityManager.find(Autor.class, id);
         }
 
         @SuppressWarnings("unchecked")
         public List<Autor> findAll() {
                   return entityManager.createQuery("FROM " + Autor.class.getName()).getResultList();
         }
 
         public void persist(Autor cliente) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.persist(cliente);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void merge(Autor cliente) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.merge(cliente);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void remove(Autor cliente) {
                   try {
                            entityManager.getTransaction().begin();
                            cliente = entityManager.find(Autor.class, cliente.getId());
                            entityManager.remove(cliente);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
 
         public void removeById(final int id) {
                   try {
                	   Autor cliente = getById(id);
                            remove(cliente);
                   } catch (Exception ex) {
                            ex.printStackTrace();
                   }
         }
 
}