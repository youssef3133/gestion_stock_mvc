package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entity.Sante;

public interface ISanteService {
	
	public Sante save(Sante entity);
	public Sante update(Sante entity);
	
	public List<Sante> selectAll();
	public List<Sante> selectAll(String sortField, String sort);
	
	public Sante getByID(Long id);
	
	public void remove(Long id);
	
	public Sante findOne(String paramName, Object[] paramValue);
	public Sante findOne(String[] paramNames, Object[] paramValues);
	public Sante findOne(String paramName, String paramValue);
	
	public int findCountryBy(String paramNames, String paramValue);

}
