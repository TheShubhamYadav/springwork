package com.bc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.bc.beans.Mobile;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/bc/common/parent-context.xml"));
		reader.loadBeanDefinitions(new ClassPathResource("com/bc/common/child-context.xml"));
		Mobile mobile = beanFactory.getBean("mobile",Mobile.class);
		System.out.println(mobile);
		

	}

}
