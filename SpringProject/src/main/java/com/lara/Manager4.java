package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager4
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(cpr);
		Test s1 = (Test) factory.getBean("t1");
		System.out.println(s1.getParam1());
		System.out.println("----------");
		Test s2 = (Test) factory.getBean("t1");
		System.out.println(s2.getParam1());
		System.out.println("----------");
		Test s3 = (Test) factory.getBean("t1");
		System.out.println(s3.getParam1());
		System.out.println("----------");
	}
}
