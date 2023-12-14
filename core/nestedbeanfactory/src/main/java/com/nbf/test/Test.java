package com.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nbf.beans.Computer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory ParentFactory = new XmlBeanFactory(new ClassPathResource("com/nbf/common/parent-context.xml"));
		BeanFactory childFactory = new XmlBeanFactory(new ClassPathResource("com/nbf/common/child-context.xml"),ParentFactory);
		Computer pc = childFactory.getBean("pc",Computer.class);
		System.out.println(pc);
	}

}
