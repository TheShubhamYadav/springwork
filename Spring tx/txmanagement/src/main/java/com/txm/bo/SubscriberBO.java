package com.txm.bo;

public class SubscriberBO { 
	private String subscription_type;
	private String plan_name;
	private int validity;
	private double bill_amt;
	private int customer_no;
	public String getSubscription_type() {
		return subscription_type;
	}
	public void setSubscription_type(String subscription_type) {
		this.subscription_type = subscription_type;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public double getBill_amt() {
		return bill_amt;
	}
	public void setBill_amt(double bill_amt) {
		this.bill_amt = bill_amt;
	}
	public int getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}
	
	
	
}
