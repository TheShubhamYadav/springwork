package com.ab.beans;

import org.springframework.stereotype.Component;

@Component
public class LoanManager {
	
	public boolean approveLoan(String applicationNo) {
		//verify data by appliactionno & approve or reject loan
		System.out.println("in approveLoan()");
		return false;
	}

}
