package com.txm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.txm.config.AppConfig;
import com.txm.controller.NewSubscriberController;
import com.txm.form.SubscriptionForm;

public class TransactionManagementTest {
	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/txm/commons/application-context.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SubscriptionForm form = new SubscriptionForm();
		form.setAge(23);//c
		form.setBill_amt(3200.99);
		form.setCustomer_name("mohan");//c
		form.setEmail("Mohan@gmail.com");//c
		form.setGender("male");//c
		form.setPlan_name("one year pack");
		form.setSubscription_type("yearly");
		form.setValidity(12);
		
		NewSubscriberController controller = applicationContext.getBean("newSubscriberController",NewSubscriberController.class);
		int subscriberNo = controller.addSubscriber(form);
		System.out.println(subscriberNo);
	}

}
