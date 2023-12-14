package com.ai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import core.ai.beans.Launcher;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ai/common/application-context.xml"));
		Launcher launcher = beanFactory.getBean("launcher",Launcher.class);
		launcher.Launch();

	}

}
