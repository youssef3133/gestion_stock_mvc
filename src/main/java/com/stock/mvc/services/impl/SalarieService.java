package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.DAO.ISalarieDAO;
import com.stock.mvc.entity.Salarie;
import com.stock.mvc.services.ISalarieService;

@Transactional
public class SalarieService implements ISalarieService{
	
	private ISalarieDAO dao;

	public void setDao(ISalarieDAO dao) {
		this.dao = dao;
	}

	@Override
	public Salarie save(Salarie entity) {
		return dao.save(entity);
	}

	@Override
	public Salarie update(Salarie entity) {
		return dao.update(entity);
	}

	@Override
	public List<Salarie> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Salarie> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Salarie getByID(Long id) {
		return dao.getByID(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Salarie findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salarie findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public Salarie findOne(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountryBy(String paramNames, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountryBy(paramNames, paramValue);
	}

	
	
	
	
}
