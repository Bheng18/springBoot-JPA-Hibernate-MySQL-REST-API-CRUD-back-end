package com.ben.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ben.practice.entity.Employee;
import com.ben.practice.service.EmployeeRepository;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@GetMapping("/employees")
	public List<Employee> getEmployeeList(){
		return employeeRepo.findAll();
	}
	
	@GetMapping("/employees/{empId}")
	public Optional<Employee> getEmployee(@PathVariable("empId") Long empId) {
		return employeeRepo.findById(empId);
	}

	@DeleteMapping("/employees/{empId}")
	public boolean deleteEmployee(@PathVariable Long empId) {
		employeeRepo.deleteById(empId);
		return true;
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}
	
}
