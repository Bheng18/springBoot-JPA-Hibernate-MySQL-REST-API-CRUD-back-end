package com.ben.practice;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.ben.practice.entity.Employee;
//import com.ben.practice.service.EmployeeRepository;

@SpringBootApplication
public class SpringBootCrudApplication{  //implements CommandLineRunner
	
//	@Autowired
//	private EmployeeRepository employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

	
//	public void run(String... args) throws Exception {
//		employeeRepo.save(new Employee("one", "ben@gmail"));
//		employeeRepo.save(new Employee("two", "joe@gmail"));
//		employeeRepo.save(new Employee("three", "dor@gmail"));
//		
//	}
	
	
}
