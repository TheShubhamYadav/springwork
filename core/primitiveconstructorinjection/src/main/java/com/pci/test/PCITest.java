package com.pci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pci.beans.CPU;

public class PCITest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/pci/common/application-context.xml"));
		CPU cpu = beanFactory.getBean("cpu",CPU.class);
		System.out.println(cpu);
	}

}
