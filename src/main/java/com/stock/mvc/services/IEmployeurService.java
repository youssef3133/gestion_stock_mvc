package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entity.Employeur;
import com.stock.mvc.entity.Salarie;

public interface IEmployeurService {
	
	public Employeur save(Employeur entity);
	public Employeur update(Employeur entity);
	
	public List<Employeur> selectAll();
	public List<Employeur> selectAll(String sortField, String sort);
	
	public Employeur getByID(Long id);
	
	public void remove(Long id);
	
	public Employeur findOne(String paramName, Object[] paramValue);
	public Employeur findOne(String[] paramNames, Object[] paramValues);
	public Employeur findOne(String paramName, String paramValue);
	
	public int findCountryBy(String paramNames, String paramValue);


}
