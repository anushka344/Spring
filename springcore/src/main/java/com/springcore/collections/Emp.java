package com.springcore.collections;

import java.util.*;

public class Emp {
	private String EmpName;
	
	private List<String> phones;
	private Set<String>  addresses;
	private Map<String,String> courses;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String empName, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		EmpName = empName;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [EmpName=" + EmpName + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ "]";
	}
	
}
