package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main( String[] args )
	    {
	 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
	 A aref= (A) context.getBean("aref");
	 System.out.println(aref.getX());
	 System.out.println(aref.getObj());
	 System.out.println(aref.getObj().getY());
	 
	    }
}
