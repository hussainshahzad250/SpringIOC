package com.lara;

public class Person {
	private String firstName;
	private int age;

	public String getFirstName() {
		System.out.println("getFirstName");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("setFirstName");
		this.firstName = firstName;
	}

	public int getAge() {
		System.out.println("getAge");
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge");
		this.age = age;
	}
}