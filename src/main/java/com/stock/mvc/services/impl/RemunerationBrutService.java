package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.DAO.IRemunerationBrutDAO;
import com.stock.mvc.DAO.ISalarieDAO;
import com.stock.mvc.services.IRemunerationBrutService;

public class RemunerationBrutService implements IRemunerationBrutService{
	
	private IRemunerationBrutDAO dao;

	public void setDao(IRemunerationBrutDAO dao) {
		this.dao = dao;
	}

	@Override
	public com.stock.mvc.entity.RemunerationBrut save(com.stock.mvc.entity.RemunerationBrut entity) {
		return dao.save(entity);
	}

	@Override
	public com.stock.mvc.entity.RemunerationBrut update(com.stock.mvc.entity.RemunerationBrut entity) {
		return dao.update(entity);
	}

	@Override
	public List<com.stock.mvc.entity.RemunerationBrut> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<com.stock.mvc.entity.RemunerationBrut> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.stock.mvc.entity.RemunerationBrut getByID(Long id) {
		return dao.getByID(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public com.stock.mvc.entity.RemunerationBrut findOne(String paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.stock.mvc.entity.RemunerationBrut findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public com.stock.mvc.entity.RemunerationBrut findOne(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountryBy(String paramNames, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountryBy(paramNames, paramValue);
	}

}
