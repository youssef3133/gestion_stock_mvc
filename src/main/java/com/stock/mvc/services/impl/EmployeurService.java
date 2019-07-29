package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.DAO.IEmployeurDAO;
import com.stock.mvc.DAO.IEmployeurDAO;
import com.stock.mvc.entity.Employeur;
import com.stock.mvc.entity.Employeur;
import com.stock.mvc.services.IEmployeurService;

public class EmployeurService implements IEmployeurService {
	
	private IEmployeurDAO dao;
	
	public void setDao(IEmployeurDAO dao) {
		this.dao = dao;
	}

	@Override
	public Employeur save(Employeur entity) {
		return dao.save(entity);
	}

	@Override
	public Employeur update(Employeur entity) {
		return dao.update(entity);
	}

	@Override
	public List<Employeur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Employeur> selectAll(String sortField, String sort) {
		return dao.selectAll();
	}

	@Override
	public Employeur getByID(Long id) {
		return dao.getByID(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Employeur findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employeur findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public Employeur findOne(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountryBy(String paramNames, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountryBy(paramNames, paramValue);
	}

}
