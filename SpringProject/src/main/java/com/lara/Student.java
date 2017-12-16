package com.lara;

public class Student 
{
	private String firstName;
	private String lastName;
	
	public Student()
	{
		System.out.println("Student()");
	}
	public void setFirstName(String firstName) 
	{
		System.out.println("set FirstName");
		this.firstName = firstName;
	}
	public void setLastName(String lastName) 
	{
		System.out.println("set LastName");
		this.lastName = lastName;
	} 
	public String getfirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
}
