package com.spring;

public class Employee {

	private int id;
	private String name;
	private float salary;
	
	private Address address;

	public Employee(int id, String name, float salary, Address address) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	
}



