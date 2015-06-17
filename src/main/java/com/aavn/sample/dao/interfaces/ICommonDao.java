package com.aavn.sample.dao.interfaces;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface ICommonDao<T> {

	// Basic interface for CRUD operations and common queries
	List<T> loadAll();

	boolean save(T bean);

	boolean update(T bean);

	boolean delete(Serializable id);

	T get(Serializable id);

	// Get List by criteria
	List<T> getListByCriteria(DetachedCriteria detachedCriteria);

	List<T> getListByCriteria(DetachedCriteria detachedCriteria, int offset,
			int size);

	// Check Duplicate Column from CommonDao
	boolean checkDuplicate(Class<T> clazz, boolean isEqual, String columnName,
			Object value);

	List<T> getListByColumn(Class<T> clazz, boolean isEqual, String columnName,
			Object value);
}
