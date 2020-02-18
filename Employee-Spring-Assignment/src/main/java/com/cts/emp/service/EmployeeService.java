package com.cts.emp.service;

import java.util.List;

import com.cts.emp.model.Employee;

public interface EmployeeService {

Employee findById(int empId);
	
	Employee findByName(String empName);
	
	boolean deleteById(int EmpId);
	
	List<Employee> findAll();
	
	boolean saveEmployee(Employee emp);
	
	//List<Employee> findAll();

}
