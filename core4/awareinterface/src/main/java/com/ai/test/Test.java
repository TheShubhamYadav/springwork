package com.ai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.ai.beans.Launcher;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/ai/common/application-context.xml"));
		Launcher launcher = beanFactory.getBean("launcher",Launcher.class);
		launcher.launch();
	}

}
