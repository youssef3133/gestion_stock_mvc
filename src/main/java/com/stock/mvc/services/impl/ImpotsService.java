package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.DAO.IImpotsDAO;
import com.stock.mvc.entity.Impots;
import com.stock.mvc.entity.Impots;
import com.stock.mvc.services.IImpotsService;

public class ImpotsService implements IImpotsService{
	
	private IImpotsDAO dao;

	public void setDao(IImpotsDAO dao) {
		this.dao = dao;
	}

	@Override
	public Impots save(Impots entity) {
		return dao.save(entity);
	}

	@Override
	public Impots update(Impots entity) {
		return dao.update(entity);
	}

	@Override
	public List<Impots> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Impots> selectAll(String sortField, String sort) {
		return dao.selectAll();
	}

	@Override
	public Impots getByID(Long id) {
		return dao.getByID(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Impots findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Impots findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public Impots findOne(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountryBy(String paramNames, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountryBy(paramNames, paramValue);
	}

}
