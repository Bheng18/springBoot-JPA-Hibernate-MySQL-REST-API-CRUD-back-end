package com.ben.practice.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ben.practice.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
//	@Autowired
//	private SessionFactory sessionFactory;

	@Override
	public long save(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> empList() {
//		 List<Employee> list = SessionFactory.getCurrentSession().createQuery("from employeetbl").list();
//			return list;
		return null;
	}

	@Override
	public Employee get(long empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(long empId, Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long empId) {
		// TODO Auto-generated method stub
		
	}

}
