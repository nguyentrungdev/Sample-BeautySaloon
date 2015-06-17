package com.aavn.sample.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aavn.sample.dao.interfaces.IDepartmentDAO;
import com.aavn.sample.domain.Department;
import com.aavn.sample.services.interfaces.IDepartmentService;

@Service
public class DepartmentServiceImpl<T extends Department> extends
		CommonServiceImpl<Department> implements IDepartmentService {

	@Autowired
	private IDepartmentDAO<Department> departmentDAO;

	@Override
	public IDepartmentDAO<Department> getDao() {
		return departmentDAO;
	}

	@Override
	public List<Department> getOrderDepartment() {
		return departmentDAO.getOrderDepartment();
	}
}