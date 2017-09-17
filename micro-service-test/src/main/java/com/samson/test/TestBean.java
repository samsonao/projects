package com.samson.test;

import java.io.Serializable;

public class TestBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3233289345000674733L;

	private String firstName;
	
	private String lastName;
	
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
