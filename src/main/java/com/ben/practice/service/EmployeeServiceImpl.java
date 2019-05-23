package com.ben.practice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ben.practice.dao.EmployeeDao;
import com.ben.practice.entity.Employee;

@Repository
public class EmployeeServiceImpl {
	@Autowired
	private EmployeeDao empDao;
	
	public long save(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Transactional
	public List<Employee> empList() {
		return empDao.empList();
	}

	public Employee get(long empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(long empId, Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long empId) {
		// TODO Auto-generated method stub
		
	}
}
