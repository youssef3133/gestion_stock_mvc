package com.stock.mvc.implement;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.stock.mvc.DAO.IGenericDAO;


@SuppressWarnings("unchecked")
public class GenericDAO<T> implements IGenericDAO<T>{
	
	@PersistenceContext
	EntityManager em;
	
	private Class<T> type;
	
	public GenericDAO() {
		super();
		Type t= getClass().getGenericSuperclass();//recuperation de l'objet
		ParameterizedType pt = (ParameterizedType) t;//parametrage de l'objet
		type = (Class<T>)pt.getActualTypeArguments()[0];
	}

	public EntityManager getEm() {
		return em;
	}


	public void setEm(EntityManager em) {
		this.em = em;
	}



	@Override
	public T save(T entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public T update(T entity) {
		return em.merge(entity);
	}

	@Override
	public List<T> selectAll() {
		Query query = em.createQuery("select t from " + type.getTypeName() + " t " );
		return query.getResultList();
	}

	@Override
	public List<T> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getByID(Long id) {
		// TODO Auto-generated method stub
		return em.find(type, id);
	}

	@Override
	public void remove(Long id) {
		T tab = em.getReference(type,  id);
		em.remove(tab);
	}

	@Override
	public T findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findOne(String[] paramNames, Object[] paramValues) {
		
		if (paramNames.length != paramValues.length) {
			return null ;
		}
		String querystring = "select t from " + type.getSimpleName()+ "t where";
		int len = paramNames.length;
		for(int i=0;i <len; i++) {
			querystring += "e."+paramNames[i]+"= :x"+ i;
			if(i+1<len){
				querystring += "and";
			}
		}
		Query query = em.createQuery(querystring);
		for(int i = 0;i< paramValues.length; i++) {
			query.setParameter("x+i", paramValues[i]);
		}
				
		return query.getResultList().size()>0 ? (T)query.getResultList().get(0):null;
	}

	@Override
	public T findOne(String paramName, String paramValue) {
		Query query = em.createQuery("select t from" + type.getTypeName() + "t where " + paramName +"= :x" );
		query.setParameter("x", paramValue);
		return  query.getResultList().size()>0 ?(T)query.getResultList().get(0): null;
	}

	@Override
	public int findCountryBy(String paramNames, String paramValue) {
		Query query = em.createQuery("select t from " + type.getSimpleName()+"t where "+ paramNames+" = :x");
		query.setParameter(paramNames, paramValue); // retourne nb element contenu dans la liste
		return query.getResultList().size() > 0 ?((Long) query.getSingleResult()).intValue() : null;
	}
	
	

}
