package com.ben.practice.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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
//

//@CrossOrigin(origins = "http://localhost:4200") 
@RequestMapping("/api")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	@GetMapping("/employeeList")
	public List<Employee> getEmployeeList(){
		return employeeRepo.findAll();
	}

	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	@GetMapping("/detailsEmployees/{empId}")
	public Optional<Employee> getEmployee(@PathVariable("empId") Long empId) {
		return employeeRepo.findById(empId);
	}
	
	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	@DeleteMapping("/deleteEmployees/{empId}")
	public boolean deleteEmployee(@PathVariable Long empId) {
		employeeRepo.deleteById(empId);
		return true;
	}

	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	@PutMapping("/updateEmployees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}

	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
	@PostMapping("/addEmployees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}
	
}
