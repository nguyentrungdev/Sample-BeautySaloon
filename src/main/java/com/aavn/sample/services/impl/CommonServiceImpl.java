package com.aavn.sample.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aavn.sample.dao.interfaces.ICommonDao;
import com.aavn.sample.services.interfaces.ICommonService;

@Service
public abstract class CommonServiceImpl<T> implements ICommonService<T> {

	@Autowired
	private ICommonDao<T> commonDao;

	private ICommonDao<T> getDao() {
		return commonDao;
	}

	@Transactional
	public List<T> getAll() {
		return getDao().loadAll();
	}

	@Transactional
	public T getById(int id) {
		return getDao().get(id);
	}

	@Transactional
	public boolean add(T obj) {
		return getDao().save(obj);
	}

	@Transactional
	public boolean delete(int id) {
		return getDao().delete(id);
	}

	@Transactional
	public boolean update(T obj) {
		return getDao().update(obj);
	}

	@Override
	@Transactional
	public boolean checkDuplicate(Class<T> clazz, boolean isEqual,
			String columnName, Object value) {
		return getDao().checkDuplicate(clazz, isEqual, columnName, value);
	}

	@Override
	@Transactional
	public List<T> getListByColumn(Class<T> clazz,boolean isEqual,
			String columnName,Object value) {
		return getDao().getListByColumn(clazz,isEqual ,columnName, value);
	}
}
