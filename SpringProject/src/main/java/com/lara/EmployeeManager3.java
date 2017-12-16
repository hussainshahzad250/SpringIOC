package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class EmployeeManager3 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		Employee obj = (Employee) factory.getBean("e1");
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
	}
}
