package com.cts.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emp.dao.EmpDao;
import com.cts.emp.model.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService {
  
	@Autowired
	private EmpDao empDao;
	
	

	
	/*public boolean saveEmployee(List<Employee> emp) {
		// TODO Auto-generated method stub
		return empDao1.saveEmployee(emp);
		
	}*/
	public boolean saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
	
		return empDao.saveEmployee(emp);
	}
	
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}
	
	public Employee findById(int empId) {
		// TODO Auto-generated method stub
		return empDao.findById(empId);
	}

		public Employee findByName(String empName) {
		// TODO Auto-generated method stub
		
		
		return empDao.findByName(empName);
	}

	public boolean deleteById(int empId) {
		// TODO Auto-generated method stub
		return empDao.deleteById(empId);
		
	}


	

}
