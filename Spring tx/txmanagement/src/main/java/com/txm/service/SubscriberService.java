package com.txm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.txm.bo.CustomerBO;
import com.txm.bo.SubscriberBO;
import com.txm.dao.CustomerDao;
import com.txm.dao.SubscriberDao;
import com.txm.form.SubscriptionForm;

@Service
public class SubscriberService {
	@Autowired
	private CustomerDao cdao;
	@Autowired
	private SubscriberDao sdao;
	
	@Transactional(readOnly = false)
	public int newSubscriber(SubscriptionForm form) {
		int customerNo = 0;
		int subscriberNo = 0;
		CustomerBO customerBO = null;
		SubscriberBO subscriberBO = null;
		
		customerBO = new CustomerBO();
		customerBO.setCustomer_name(form.getCustomer_name());
		customerBO.setGender(form.getGender());
		customerBO.setEmail(form.getEmail());
		customerBO.setAge(form.getAge());
		
		customerNo = cdao.saveCustomer(customerBO);
		
		subscriberBO = new SubscriberBO();
		subscriberBO.setBill_amt(form.getBill_amt());
		subscriberBO.setCustomer_no(customerNo);
		subscriberBO.setPlan_name(form.getPlan_name());
		subscriberBO.setSubscription_type(form.getSubscription_type());
		subscriberBO.setValidity(form.getValidity());
	
		subscriberNo = sdao.saveSubscriber(subscriberBO);
		return subscriberNo;
	}

	public void setCdao(CustomerDao cdao) {
		this.cdao = cdao;
	}

	public void setSdao(SubscriberDao sdao) {
		this.sdao = sdao;
	}
}
