package com.cts.emp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Repository;

import com.cts.emp.model.Employee;

@Repository
public class EmpDaoEmpl implements EmpDao {

	List<Employee> list = new ArrayList();
	Employee emp = null;

	public EmpDaoEmpl() {
		System.out.println("EmpDao Object is Created ");
	}

	public boolean saveEmployee(Employee emp) {
		list.add(emp);
		if (list.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * public boolean saveEmployee(List<Employee> empList) { list=empList;
	 * //System.out.println("DAO : "+emp.getName()+" is save Successfully..");
	 * int c=1; for(Employee emp : list) {
	 * System.out.println(c+". "+emp.getId()+" "+emp.getName()+"\n"); c++; }
	 * return true;
	 * 
	 * }
	 */

	public Employee findById(int empId) {
		// TODO Auto-generated method stub

		for (Employee emp1 : list) {
			if (empId == emp1.getId()) {
				emp = emp1;
				// System.out.println("Its Present");
			}
		}
		return emp;

	}

	public Employee findByName(String empName) {
		// TODO Auto-generated method stub

		for (Employee emp1 : list) {
			if (empName.equals(emp1.getName())) {

				emp = emp1;
			}
		}
		return emp;
	}

	public boolean deleteById(int empId) {

		if (!list.isEmpty()) {
		  for (Employee empl : list) {
			
				if (empId == empl.getId()) {
					list.remove(empl);
					return true;
				} 
				
			}

		}
		return false;
		
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub

		
			return list;
		
	}

}
