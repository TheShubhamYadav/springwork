package com.ifm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ifm.beans.TripMaker;

public class IFMITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ifm/common/application-context.xml"));
		TripMaker trip = beanFactory.getBean("tripmaker",TripMaker.class);
		int tripNo = trip.registerTrip(90);
		
	}

}
