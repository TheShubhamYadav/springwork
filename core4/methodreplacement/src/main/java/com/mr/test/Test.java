package com.mr.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.PlanService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/mr/common/application-context.xml"));
		
		PlanService service = beanFactory.getBean("planService",PlanService.class);
		List<String> plans = service.findPlans(25, 2, true, true, false);
		plans.forEach(System.out::println);
	}

}
