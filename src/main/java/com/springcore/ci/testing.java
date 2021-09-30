package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testing {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		mobile m=(mobile) c.getBean("m");
		System.out.println(m);
		

	}

}
