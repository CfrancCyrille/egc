package fr.igs.easygreencampus.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;



public abstract class GenericDAO <T>

{
	
	    private Class<T> entityClass;

	    public GenericDAO(Class<T> entityClass) {
	        this.entityClass = entityClass;
	    }
	    
	    @PersistenceContext
	    protected EntityManager em;

	   
	    public void create(T entity) {
	       em.persist(entity);
			
	    }

	    public void edit(T entity) {
	        em.merge(entity);
	    }

	    public void remove(T entity) {
	        em.remove(em.merge(entity));
	    }

	    public T find(Object id) {
	        return em.find(entityClass, id);
	    }

	    public List<T> findAll() {
	        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
	        cq.select(cq.from(entityClass));
	        return em.createQuery(cq).getResultList();
	    }

	   
}
