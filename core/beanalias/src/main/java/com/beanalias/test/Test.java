package com.beanalias.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanalias.beans.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/beanalias/common/application-context.xml"));
		Person person = beanFactory.getBean("brother",Person.class);
		System.out.println(person);
		
		String[] aliases = beanFactory.getAliases("person");
		for (String string : aliases) {
			System.out.print(string+", ");
		}
		
	}

}
