package com.cts.emp.service;

import java.util.List;

import com.cts.emp.model.Employee;

public interface EmployeeServiceReadOnly {
	
	
	Employee findById(int empId);
	
	Employee findByName(String empName);

	List<Employee> findAll();
	
	
	
	
	
}
