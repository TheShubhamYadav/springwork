package com.blc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.blc.beans.Math;

public class Test {

	public static void main(String[] args) {
		
		BeanFactory beanFactory  = new DefaultListableBeanFactory();
		BeanDefinitionReader beanreader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		beanreader.loadBeanDefinitions(new ClassPathResource("com/blc/common/application-context.xml"));
		
		Runnable shutdownHook = beanFactory.getBean("shutdownHook", Runnable.class);
		Runtime.getRuntime().addShutdownHook(new Thread(shutdownHook));
		
		Math math = beanFactory.getBean("math",Math.class);
		System.out.println(math);		
	}

}
