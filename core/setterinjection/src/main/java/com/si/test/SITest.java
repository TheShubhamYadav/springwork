package com.si.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.si.beans.AirConditioner;
import com.si.beans.Heater;
import com.si.beans.Remote;
import com.si.beans.Television;

public class SITest {

	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/si/common/application-context.xml"));
		AirConditioner ac = bf.getBean("ac",AirConditioner.class);
		ac.onAC();
		Television tv = bf.getBean("tv",Television.class);
		tv.onTV();
		Heater ht = bf.getBean("heater",Heater.class);
		ht.onHT();
		
	}

}
