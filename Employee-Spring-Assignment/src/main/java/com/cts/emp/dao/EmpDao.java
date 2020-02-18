package com.cts.emp.dao;

import java.util.List;

import com.cts.emp.model.Employee;

public interface EmpDao  {
	
	boolean saveEmployee(Employee emp);
	
	
	Employee findById(int empId);
	
	Employee findByName(String empName);
	
	List<Employee> findAll();
	
	boolean deleteById(int empId);

}
