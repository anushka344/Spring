package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	 ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springcore/standalone/aloneconfig.xml");
	 
	 Person p1= context.getBean("p1",Person.class);
	 System.out.println(p1.getFriends());
	 System.out.println(p1.getFriends().getClass().getName());
	}
}
