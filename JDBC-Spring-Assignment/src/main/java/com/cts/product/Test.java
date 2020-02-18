package com.cts.product;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		System.out.println("--- Stated..");
		Scanner sc=new Scanner(System.in);
		
		ProductDaoImpl dao=ac.getBean(ProductDaoImpl.class);
		String ans=null;
		
		do
		{
			System.out.println("enter your choice: ");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
			Product prod=new Product();
			prod.setProductId(111);
			prod.setProductName("abc");
			prod.setPrice(500);
			
			int i=dao.saveProduct(prod);
			if(i==1)
			{
				System.out.println("Data inserted Successfully ..");
			}
			else 
			{
				System.out.println("Problem occured while inserting..");
			}
			
			break;
			
			case 2:
				System.out.println("Product data of given name..");
				List<Product> prods=dao.findAll();
				for(Product product:prods) {
					System.out.println(product.getProductId());
					System.out.println(product.getProductName());
					System.out.println(product.getPrice());
					System.out.println("-----------------------------");
				}
			     	System.out.println("Total: "+dao.findAll().size());
			     	break;
			case 3:
				
				    dao.findByName("harshini").forEach(product->{
					System.out.println(product.getProductId());
					System.out.println(product.getProductName());
					System.out.println(product.getPrice());
					System.out.println("-----------------------------");
				});
				    break;
			case 4:
				System.out.println("Product data whoes price is beetween 100 to 200..");
				List<Product> product1=dao.findByPriceRange(100,200);
				for(Product prod1:product1) {
					System.out.println(prod1.getProductId());
					System.out.println(prod1.getProductName());
					System.out.println(prod1.getPrice());
					System.out.println("-----------------------------");
				}
				break;
					
					
			case 5:
				System.out.println("Product data whoes id is beetween 102 to 105..");
				List<Product> product2=dao.findBetweenId(102,105);
				for(Product prod1:product2)
				{
					System.out.println(prod1.getProductId());
					System.out.println(prod1.getProductName());
					System.out.println(prod1.getPrice());
				}
				break;
				
			case 6:
				
				int val=dao.deleteById(109);
				if(val==1)
				{
					System.out.println("Data deleted Successfully ..");
				}
				else 
				{
					System.out.println("Problem occured while deleting Data..");
				}
				
				break;
				
			case 7:
				int val1=dao.editData("Harshini",111);
				if(val1==1)
				{
					System.out.println("Data updated Successfully ..");
				}
				else 
				{
					System.out.println("Problem occured while updating data..");
				}
				
				break;
			case 8:
				System.out.println("Product data of given id..");
				Product product=dao.findById(102);
				
				if(product!=null) {
					System.out.println(product.getProductId());
					System.out.println(product.getProductName());
					System.out.println(product.getPrice());
					System.out.println("-----------------------------");
				}else {
					System.out.println("Product id not found");
				}
				break;
		  
			case 9:
				System.exit(0);
				
			}
			System.out.println("Do you want to continue: ");
			 ans=sc.next();
			
		}while(ans.equalsIgnoreCase("yes"));
		/*Product prod=new Product();
		prod.setProductId(109);
		prod.setProductName("Sring-JDBC-Test");
		prod.setPrice(500);
		
		dao.saveProduct(prod);*/
		
		
		//List<Product> prods=dao.findAll();
		/*List<Product> prods1=dao.findAll_V1();
		
		
		for(Product product:prods1) {
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
			System.out.println("-----------------------------");
		}
		
		
		
		//System.out.println("Total: "+dao.findAll().size());
		System.out.println("Total: "+dao.findAll_V1().size());*/
		
		
	
		/*
		dao.findByName("Test").forEach(product->{
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
			System.out.println("-----------------------------");
		});
		
		*/
		
		
		/*List<Product> product1=dao.findByPriceRange(100,200);
		for(Product prod:product1) {
			System.out.println(prod.getProductId());
			System.out.println(prod.getProductName());
			System.out.println(prod.getPrice());
			System.out.println("-----------------------------");
		}*/
		
		/*List<Product> product2=dao.findBetweenId(102,105);
		for(Product prod:product2)
		{
			System.out.println(prod.getProductId());
			System.out.println(prod.getProductName());
			System.out.println(prod.getPrice());
		}
		*/
	/*	int val=dao.deleteById(101);
		System.out.println(val);*/
		
		/* int val1=dao.editData("smita",102);
		     System.out.println(val1);  */
	/*	
		Product product=dao.findById(102);
		
		if(product!=null) {
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
			System.out.println("-----------------------------");
		}else {
			System.out.println("Product id not found");
		}*/
		
		
		
		
		ac.close();

	}

}
