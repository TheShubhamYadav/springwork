package com.dps.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dps.beans.DepositCalculator;

@SuppressWarnings("deprecation")
public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/dps/common/application-context.xml"));
		DepositCalculator depositCalc = beanFactory.getBean("deposit",DepositCalculator.class);
		
		try {
			depositCalc.getInfo(1000,"fixed",10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
