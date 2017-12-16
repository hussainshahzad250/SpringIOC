package com.lara;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class PersonManager1 {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("config.xml");
		try {
			System.out.println(cpr.contentLength());
			BeanFactory factory = new XmlBeanFactory(cpr);
			Person obj = (Person) factory.getBean("p1");
			System.out.println(obj.getFirstName());
			System.out.println(obj.getAge());
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
