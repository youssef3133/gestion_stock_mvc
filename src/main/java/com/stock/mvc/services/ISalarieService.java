package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entity.Salarie;

public interface ISalarieService {
	
	public Salarie save(Salarie entity);
	public Salarie update(Salarie entity);
	
	public List<Salarie> selectAll();
	public List<Salarie> selectAll(String sortField, String sort);
	
	public Salarie getByID(Long id);
	
	public void remove(Long id);
	
	public Salarie findOne(String paramName, Object[] paramValue);
	public Salarie findOne(String[] paramNames, Object[] paramValues);
	public Salarie findOne(String paramName, String paramValue);
	
	public int findCountryBy(String paramNames, String paramValue);


}
