package com.profilespractice.annotation;

//no src
public class Branch {
	
	private String branchName;
	private String ifsc;
	private String address;
	private long contact;
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", ifsc=" + ifsc + ", address=" + address + ", contact=" + contact
				+ "]";
	}
	
	
	

}
