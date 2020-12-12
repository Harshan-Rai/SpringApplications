package com.project.kafka.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
	
	@JsonProperty("employeeId")
	private String employeeId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("dept")
	private String dept;
	

	public Employee() {
		super();
	}

	public Employee(String employeeId, String name, String dept) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", dept=" + dept + "]";
	}

	public String getDept() {
		return dept;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}
}
