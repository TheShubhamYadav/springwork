package com.req.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.req.beans.PolicyForm;

public class RequiredTest {
	
	public static void main(String[] args) {
//		BeanFactory beanFactory = new DefaultListableBeanFactory();
//		BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
//		reader.loadBeanDefinitions(new ClassPathResource("com/req/common/application-context.xml"));
//		BeanPostProcessor bpp = beanFactory.getBean("bpp",BeanPostProcessor.class);
//		((ConfigurableListableBeanFactory)beanFactory).addBeanPostProcessor(bpp);
//		PolicyForm form = beanFactory.getBean("policyForm",PolicyForm.class);
//		form.createPolicy();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/req/common/application-context.xml");
		PolicyForm form = applicationContext.getBean("policyForm",PolicyForm.class);
		form.createPolicy();
	}

}
