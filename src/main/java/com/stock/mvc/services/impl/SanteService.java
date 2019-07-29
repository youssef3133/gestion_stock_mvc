package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.DAO.ISalarieDAO;
import com.stock.mvc.DAO.ISanteDAO;
import com.stock.mvc.entity.Sante;
import com.stock.mvc.entity.Sante;
import com.stock.mvc.services.ISanteService;

public class SanteService implements ISanteService {
	
	private ISanteDAO dao;

	public void setDao(ISanteDAO dao) {
		this.dao = dao;
	}

	@Override
	public Sante save(Sante entity) {
		return dao.save(entity);
	}

	@Override
	public Sante update(Sante entity) {
		return dao.update(entity);
	}

	@Override
	public List<Sante> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Sante> selectAll(String sortField, String sort) {
		return dao.selectAll();
	}

	@Override
	public Sante getByID(Long id) {
		return dao.getByID(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Sante findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sante findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public Sante findOne(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountryBy(String paramNames, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountryBy(paramNames, paramValue);
	}

}
