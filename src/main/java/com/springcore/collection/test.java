package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		System.out.println("--------*********--------");
//		@SuppressWarnings("resource")
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/collection/collconfig.xml");
		
		System.out.println("---------************-------");
		
		emp employee = (emp) con.getBean("employee");
		
		System.out.println(employee.getName());
		System.out.println(employee.getPhones()); 
		System.out.println(employee.getAddresses());
		System.out.println(employee.getUserPass());
		System.out.println(employee.getProps());

	}

}
