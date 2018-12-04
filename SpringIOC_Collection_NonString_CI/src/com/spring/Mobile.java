package com.spring;

public class Mobile {

	private String brand;
	private float cost;
	
	public Mobile(String brand, float cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", cost=" + cost + "]";
	}
	
	
}
