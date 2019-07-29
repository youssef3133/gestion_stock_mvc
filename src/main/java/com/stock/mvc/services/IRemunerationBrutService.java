package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entity.RemunerationBrut;

public interface IRemunerationBrutService {
	
	public RemunerationBrut save(RemunerationBrut entity);
	public RemunerationBrut update(RemunerationBrut entity);
	
	public List<RemunerationBrut> selectAll();
	public List<RemunerationBrut> selectAll(String sortField, String sort);
	
	public RemunerationBrut getByID(Long id);
	
	public void remove(Long id);
	
	public RemunerationBrut findOne(String paramName, Object[] paramValue);
	public RemunerationBrut findOne(String[] paramNames, Object[] paramValues);
	public RemunerationBrut findOne(String paramName, String paramValue);
	
	public int findCountryBy(String paramNames, String paramValue);

}
