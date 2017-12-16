package com.lara;
public class Test 
{
	private String param1;

	public Test()
	{
		System.out.println("Test()");
	}
	public void Setparam1(String param1)
	{
		System.out.println("setParam1");
		this.param1 = param1;
	}
	public void Setparam2(String param1)
	{
		System.out.println("setParam2");
		this.param1 = param1;
	}
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	
}
