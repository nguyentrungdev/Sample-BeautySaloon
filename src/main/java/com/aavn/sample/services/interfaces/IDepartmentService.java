package com.aavn.sample.services.interfaces;

import java.util.List;

import com.aavn.sample.dao.interfaces.IDepartmentDAO;
import com.aavn.sample.domain.Department;

public interface IDepartmentService extends ICommonService<Department> {
	IDepartmentDAO<Department> getDao();
	public List<Department> getOrderDepartment();
}

