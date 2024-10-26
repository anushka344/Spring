package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//@Component("s1")
public class Student {

		private Samosa samosa;
	@Override
		public String toString() {
			return "Student [samosa=" + samosa + "]";
		}
	public void study()
	{
		samosa.display();
		System.out.println("studying class method called");
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
		
}
