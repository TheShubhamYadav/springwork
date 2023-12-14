package com.uci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.uci.beans.Team;

public class UCITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/uci/common/application-context.xml"));
		Team team = beanFactory.getBean("team",Team.class);
		System.out.println(team); 
	}

}
