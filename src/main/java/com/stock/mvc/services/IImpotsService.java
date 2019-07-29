package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entity.Impots;

public interface IImpotsService {
	
	public Impots save(Impots entity);
	public Impots update(Impots entity);
	
	public List<Impots> selectAll();
	public List<Impots> selectAll(String sortField, String sort);
	
	public Impots getByID(Long id);
	
	public void remove(Long id);
	
	public Impots findOne(String paramName, Object[] paramValue);
	public Impots findOne(String[] paramNames, Object[] paramValues);
	public Impots findOne(String paramName, String paramValue);
	
	public int findCountryBy(String paramNames, String paramValue);

}
