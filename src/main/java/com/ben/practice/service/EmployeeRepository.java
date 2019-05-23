package com.ben.practice.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ben.practice.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
