package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//if we use Bean tag we do not require o use ComponentScan..for Bean tag u can also remove @Component("s1") from Student.java
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
	

	@Bean //now we will use getStudent as the id in main java class to retrieve object of Student.java
	public Student getStudent()
	{
		//create new student object
		Student student = new Student(getSamosa()); //we need constructor
		return student;
	}
	

	///we have Samosa , we need to declare another bean
	@Bean(name = {"sam","temp","jbfjh"})
	public Samosa getSamosa()
	{
		return new Samosa();
	}
}
