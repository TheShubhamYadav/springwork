package com.profilespractice.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//src code

@Component
public class Bank {
	
	@Value("${bankName}")
	private String bankName;
	@Autowired
	private Branch branch;
	
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", branch=" + branch + "]";
	}
	
	

}
