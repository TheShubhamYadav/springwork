package com.psi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.psi.beans.FuelTank;

public class PSITest {

	public static void main(String[] args) {
		BeanFactory beanfactory = new XmlBeanFactory(new ClassPathResource("com/psi/common/application-context.xml"));
		FuelTank ft = beanfactory.getBean("fueltank", FuelTank.class);
		System.out.println("my fuel tank have "+ft.getFuelCapacity()+" liters of "+ft.getFuelType());
		System.out.println(ft.toString());
	}

}
