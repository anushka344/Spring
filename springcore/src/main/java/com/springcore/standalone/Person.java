package com.springcore.standalone;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String,Integer> freeStructure;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFreeStructure() {
		return freeStructure;
	}
	public void setFreeStructure(Map<String, Integer> freeStructure) {
		this.freeStructure = freeStructure;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", freeStructure=" + freeStructure + "]";
	}
	

	
	
}
