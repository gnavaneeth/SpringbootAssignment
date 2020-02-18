package com.cts.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emp.dao.EmpDao;
import com.cts.emp.model.Employee;
@Service
public class EmployeeServiceReadOnlyImpl implements EmployeeServiceReadOnly {

	@Autowired
	private EmpDao empDao1;
	
	

	
	/*public boolean saveEmployee(List<Employee> emp) {
		// TODO Auto-generated method stub
		return empDao1.saveEmployee(emp);
		
	}*/
	
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empDao1.findAll();
	}
	
	public Employee findById(int empId) {
		// TODO Auto-generated method stub
		return empDao1.findById(empId);
	}

		public Employee findByName(String empName) {
		// TODO Auto-generated method stub
		
		
		return empDao1.findByName(empName);
	}

	




	

}
