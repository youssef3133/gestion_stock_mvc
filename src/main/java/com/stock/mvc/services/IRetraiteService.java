package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entity.Retraite;

public interface IRetraiteService {
	
	public Retraite save(Retraite entity);
	public Retraite update(Retraite entity);
	
	public List<Retraite> selectAll();
	public List<Retraite> selectAll(String sortField, String sort);
	
	public Retraite getByID(Long id);
	
	public void remove(Long id);
	
	public Retraite findOne(String paramName, Object[] paramValue);
	public Retraite findOne(String[] paramNames, Object[] paramValues);
	public Retraite findOne(String paramName, String paramValue);
	
	public int findCountryBy(String paramNames, String paramValue);

}
