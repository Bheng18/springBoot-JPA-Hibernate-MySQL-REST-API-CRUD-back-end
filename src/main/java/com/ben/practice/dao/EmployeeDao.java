package com.ben.practice.dao;

import java.util.List;

import com.ben.practice.entity.Employee;

public interface EmployeeDao {
	//save employee record
		long save(Employee employee);
		
		//Get all employee record
		List<Employee> empList();
		
		//Get single record
		Employee get(long empId);
		
		//update employee
		void update(long empId, Employee employee);
		
		//delete employee record
		void delete(long empId);
}