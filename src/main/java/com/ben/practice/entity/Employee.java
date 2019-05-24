package com.ben.practice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

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
	
	@NotNull
	private String mobile;
	
	@NotBlank
	private String city;
	
	@NotBlank
	private String gender;
	
	@NotBlank
	private String department;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name="hire_date" )
	private Date hireDate;
	
    @NotNull
    @Column(name = "is_permanent")
	private boolean isPermanent;
	
	public Employee() {	}
	
	
	
	public Employee(@NotBlank String fullName, @NotBlank String email, @NotBlank String mobile, @NotBlank String city,
			@NotBlank String gender, @NotBlank String department, @NotBlank Date hireDate, @NotNull boolean isPermanent) {
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.gender = gender;
		this.department = department;
		this.hireDate = hireDate;
		this.isPermanent = isPermanent;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	
	public boolean isPermanent() {
		return isPermanent;
	}


	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", email=" + email + ", mobile=" + mobile
				+ ", city=" + city + ", gender=" + gender + ", department=" + department + ", hireDate=" + hireDate
				+ ", isPermanent=" + isPermanent + "]";
	}
	
		
	
}
