package com.cts.emp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.emp.config.AppConfig;
import com.cts.emp.model.Employee;
import com.cts.emp.service.EmployeeService;
import com.cts.emp.service.EmployeeServiceReadOnly;

public class EmpImpController {

	public static void main(String[] args) {


		
		
		/*List<Employee> emplist=new ArrayList();
	    Employee emp=new Employee();
	    emp.setId(101);
	    emp.setName("smita");
	    Employee emp1=new Employee();
	    emp1.setId(102);
	    emp1.setName("harshini");
	    emplist.add(emp);
	    emplist.add(emp1);*/
		
		
	/*	public void creatEmployee( )
		{
		  int id;
		 String name;
		 Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Name and id : ");	   
		 for(int i=0; i<5; i++)
	     {
			    name = sc.nextLine();
				id = sc.nextInt();
		 }
		};*/
	    
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	    EmployeeServiceReadOnly esr=ac.getBean(EmployeeServiceReadOnly.class);
	    EmployeeService es=ac.getBean(EmployeeService.class);
	    
	    Scanner sc=new Scanner(System.in);
	    String ans;
	    List<Employee> emplist1=null;
	  
	  
	    do{
	    	
	    	
	    	 System.out.println(
	    	 "1. Add an Employee: "+" \n"+
	    	 "2. Search an Employee by Id"+"\n"+
	    	 "3. Search an Employee by Name"+"\n"+
	    	 "4. Delete an Employee by Id"+"\n"+
	    	 "5. List All Employee "+"\n"+
	    	 "6. Exit"+"\n"+
	    	 "Choose one option  :"+ "\n");
	 	     int ch=sc.nextInt();
	 	    
	 	   
	    	switch(ch)
	    	{
	    	case 1:
	    		Employee epl=new Employee();
	    		int empId;
	    		String empName;
	    		System.out.println("Enter Employee Id :");
	    		empId=sc.nextInt();
	    		System.out.println("Enter Employee Name :");
	    		empName=sc.next();
	    		epl.setId(empId);
	    		epl.setName(empName);
	    		boolean result= es.saveEmployee(epl);
	    		if(result)
	    		{
	    			System.out.println("Employee Details Added Successfully ...");
	    		}
	    		else
	    		{
	    			System.out.println("Error While adding Details...");
	    		}
	    			
	    		
	    		break;
			case 2:
	    		System.out.println("Enter emp id to be searched: ");
	    		int id=sc.nextInt();
	    	    Employee emp2=esr.findById(id);
	    	  if(emp2!=null){
	    	    System.out.println("Employee Name= "+emp2.getName()+" and Employee Id="+ emp2.getId()+"\n");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("No record is Available...");
	    	  }
	    	  
	    	    break;
	    	    
	    	case 3:
	    		System.out.println("Enter Employee name to be searched: ");
	    	    String name1=sc.next();
	    	    Employee emp3=esr.findByName(name1);
	    	    if(emp3!=null){
	    	    System.out.println("Employee Name= "+emp3.getName()+" and Employee Id="+ emp3.getId()+"\n");
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("No Record is Available...");
	    	    }
	    	    break;
	    	    
	    	case 4:
	    		    System.out.println("Enter Employee id to be deleted: ");
	    		    int id1=sc.nextInt();
	    		    boolean emp4=es.deleteById(id1);
	    		    if(emp4)
	    		    {
	    		    	System.out.println("Deleted Successfully");
	    		    }
	    		    else
	    		    {
	    		    	System.out.println("No Data Available");
	    		    }
	    		    break;
	    		    
	    	case 5:
	    	        emplist1=esr.findAll();
		    		if(!emplist1.isEmpty())
		    		{
		    			System.out.println("Employess are :");
			    		for(Employee emp11:emplist1)
			    		{
			    			System.out.println(emp11.toString());
			    			System.out.println("\n");
			    		}
		    		}
		    		else
		    		{
		    			System.out.println("No Data Available...");
		    		}
	    		break;
	    		
	    	case 6:
	    		System.out.println("Terminated Successfully..");
	    		System.exit(0);
	    		
	    		    
	    		
	    	
	    	}
	    	System.out.println("Do you want to continue :");
	    	 ans=sc.next();
	    }while(ans.equalsIgnoreCase("yes"));
	    
	

	}


	
}
