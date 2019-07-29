package com.stock.mvc.DAO;

import java.util.List;

public interface IGenericDAO<T> {
	
	public T save(T entity);
	public T update(T entity);
	
	public List<T> selectAll();
	public List<T> selectAll(String sortField, String sort);
	
	public T getByID(Long id);
	
	public void remove(Long id);
	
	public T findOne(String paramName, Object[] paramValue);
	public T findOne(String[] paramNames, Object[] paramValues);
	public T findOne(String paramName, String paramValue);
	public int findCountryBy(String paramNames, String paramValue);

}
