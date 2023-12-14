package com.aroundadvice.beans;

import java.security.SecureRandom;

public class Banking {
	
	public double getBalance(long accountNo) {
		System.out.println("checking the balance....");
		return new SecureRandom().nextDouble(5000, 9999999);
	}

}
