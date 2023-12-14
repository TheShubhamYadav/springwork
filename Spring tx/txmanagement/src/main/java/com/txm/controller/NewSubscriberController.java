package com.txm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.txm.form.SubscriptionForm;
import com.txm.service.SubscriberService;

@Component
public class NewSubscriberController {
	
	@Autowired
	private SubscriberService subscriberService;
	
	public int addSubscriber(SubscriptionForm form) {
		int subscriberNo= 0;
		
		subscriberNo = subscriberService.newSubscriber(form);
		
		return subscriberNo;
	}

	public void setSubscriberService(SubscriberService subscriberService) {
		this.subscriberService = subscriberService;
	}
	
	

}
