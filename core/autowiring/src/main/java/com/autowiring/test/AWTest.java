package com.autowiring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.autowiring.beans.LaptopCharger;
import com.autowiring.beans.MobileCharger;

public class AWTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/autowiring/common/application-context.xml"));
		LaptopCharger charger = beanFactory.getBean("laptopcharger",LaptopCharger.class);
		charger.charge("HP Pavellion");
		MobileCharger mcharger = beanFactory.getBean("mobilecharger",MobileCharger.class);
		mcharger.charge();
	}
}
