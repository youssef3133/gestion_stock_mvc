package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.DAO.ISalaireDAO;
import com.stock.mvc.DAO.ISalarieDAO;
import com.stock.mvc.entity.Salaire;
import com.stock.mvc.entity.Salaire;
import com.stock.mvc.services.ISalaireService;

public class SalaireService implements ISalaireService{
	
	private ISalaireDAO dao;

	public void setDao(ISalaireDAO dao) {
		this.dao = dao;
	}

	@Override
	public Salaire save(Salaire entity) {
		return dao.save(entity);
	}

	@Override
	public Salaire update(Salaire entity) {
		return dao.update(entity);
	}

	@Override
	public List<Salaire> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Salaire> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salaire getByID(Long id) {
		return dao.getByID(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Salaire findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salaire findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public Salaire findOne(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountryBy(String paramNames, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountryBy(paramNames, paramValue);
	}

}
