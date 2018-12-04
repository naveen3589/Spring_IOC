package com.spring;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private float salary;
	
	private List<Mobile> mobile;

	public Employee(int id, String name, float salary, List<Mobile> mobile) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mobile=" + mobile + "]";
	}

	

	
}



