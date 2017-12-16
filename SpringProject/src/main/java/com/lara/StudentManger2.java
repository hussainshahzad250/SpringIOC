package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentManger2 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		Student st = (Student) factory.getBean("s1");
		System.out.println("---------");
		System.out.println(st.getfirstName());
		System.out.println(st.getlastName());
	}
}
