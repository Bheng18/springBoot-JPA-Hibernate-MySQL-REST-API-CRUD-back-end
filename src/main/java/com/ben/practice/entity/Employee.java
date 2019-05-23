package com.ben.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="employeetbl")
public class Employee {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	
	@NotBlank
	private String fullName;
	
	@NotBlank
	private String email;
			
	public Employee() {	}
	
	public Employee(String fullName, String email) {
		this.fullName = fullName;
		this.email = email;
	}
	
	public Long getEmpId() {
		return empId;
	}
	
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", email=" + email + "]";
	}
	
	
	
}
