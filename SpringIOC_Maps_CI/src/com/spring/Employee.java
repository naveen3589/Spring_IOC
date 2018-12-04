package com.spring;

import java.util.Map;

public class Employee {

	private int id;  
	private String name;  
	private Map<String,String> answers;
	public Employee(int id, String name, Map<String, String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}
	

	
	
}



