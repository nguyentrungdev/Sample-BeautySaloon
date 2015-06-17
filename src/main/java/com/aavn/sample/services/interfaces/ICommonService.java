package com.aavn.sample.services.interfaces;

import java.util.List;

public interface ICommonService<T> {
	List<T> getAll();
	T getById(int id);
	boolean add(T obj);
	boolean delete(int id);
	boolean update(T obj);
	boolean checkDuplicate(Class<T> clazz, boolean isEqual, String columnName, Object value);	
	List<T> getListByColumn(Class<T> clazz, boolean isEqual, String columnName, Object value);
}
