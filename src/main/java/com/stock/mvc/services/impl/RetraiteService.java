package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.DAO.IRetraiteDAO;
import com.stock.mvc.DAO.ISalarieDAO;
import com.stock.mvc.entity.Retraite;
import com.stock.mvc.entity.Retraite;
import com.stock.mvc.services.IRetraiteService;

public class RetraiteService implements IRetraiteService{
	
	private IRetraiteDAO dao;

	public void setDao(IRetraiteDAO dao) {
		this.dao = dao;
	}

	@Override
	public Retraite save(Retraite entity) {
		return dao.save(entity);
	}

	@Override
	public Retraite update(Retraite entity) {
		return dao.update(entity);
	}

	@Override
	public List<Retraite> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Retraite> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Retraite getByID(Long id) {
		return dao.getByID(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Retraite findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Retraite findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public Retraite findOne(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountryBy(String paramNames, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountryBy(paramNames, paramValue);
	}

}
