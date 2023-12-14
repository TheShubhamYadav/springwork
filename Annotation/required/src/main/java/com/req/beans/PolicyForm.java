package com.req.beans;

import org.springframework.beans.factory.annotation.Required;

public class PolicyForm {
	String fullName;
	int age;
	String identityProof;
	String addressProof;
	String nomineeName;
	String contact;
	String email;
	
	@Required
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Required
	public void setAge(int age) {
		this.age = age;
	}

	@Required
	public void setIdentityProof(String identityProof) {
		this.identityProof = identityProof;
	}


	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}

	@Required
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	@Required
	public void setContact(String contact) {
		this.contact = contact;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void createPolicy() {
		System.out.println("Policy created for "+fullName);
		System.out.println("policy details:\nName-"+fullName+"\nage-"+age+"\ndocument attached-"+identityProof+"\ncontact-"+contact);
	}
	
	
	
}
