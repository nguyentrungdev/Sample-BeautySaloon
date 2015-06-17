package com.aavn.sample.dao.interfaces;

import java.util.List;

import com.aavn.sample.domain.Department;

public interface IDepartmentDAO<T extends Department> extends
		ICommonDao<Department> {
	public List<Department> getOrderDepartment();

}
