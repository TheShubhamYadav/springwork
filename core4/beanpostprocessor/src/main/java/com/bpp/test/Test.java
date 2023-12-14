package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.Class1;
import com.bpp.beans.Class2;
import com.bpp.beans.Class3;
import com.bpp.beans.TrackerBeanPostProcessor;
import com.bpp.helper.Tracker;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/bpp/common/application-context.xml"));
		TrackerBeanPostProcessor trackerBeanPostProcessor = beanFactory.getBean("trackerBeanPostProcessor",TrackerBeanPostProcessor.class);
		((ConfigurableListableBeanFactory)beanFactory).addBeanPostProcessor(trackerBeanPostProcessor);
		Class1 c1 = beanFactory.getBean("c1",Class1.class);
		Class2 c2 = beanFactory.getBean("c2",Class2.class);
		//Class3 c3 = beanFactory.getBean("c3",Class3.class);
		System.out.println(Tracker.getCount());
	}
}
