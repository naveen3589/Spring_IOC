package com.spring;

public class Mobile {

	private String brand;
	private float cost;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", cost=" + cost + "]";
	}

}
