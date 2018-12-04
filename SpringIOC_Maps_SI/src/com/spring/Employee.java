package com.spring;

import java.util.Map;

public class Employee {

	private int id;
	private String name;
	private Map<String, String> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}

}



