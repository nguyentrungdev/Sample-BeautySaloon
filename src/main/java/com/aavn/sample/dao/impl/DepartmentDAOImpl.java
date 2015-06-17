package com.aavn.sample.dao.impl;

import java.util.List;	

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.aavn.sample.dao.interfaces.IDepartmentDAO;
import com.aavn.sample.domain.Department;

@SuppressWarnings("unchecked")
@Repository
@Transactional
public class DepartmentDAOImpl<T extends Department> extends
		CommonDaoImpl<Department> implements IDepartmentDAO<T> {

	@Autowired
	SessionFactory factory;
	
	@Override
	public List<Department> getOrderDepartment() {
		Session s = factory.getCurrentSession();
		
		List<Department> ql = s.createCriteria(Department.class).addOrder(Order.asc("department_name")).list();
		return ql;
	}
}
