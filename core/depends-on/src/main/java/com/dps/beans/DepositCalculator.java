package com.dps.beans;

import java.util.Properties;

public class DepositCalculator {
	private Cache cache;
	
	public DepositCalculator(Cache cache) {
		System.out.println("DepositCalculator.DepositCalculator()");
		this.cache = cache;
	}

	public void getInfo(double amount,String depositType,int tenure){
		Properties props = (Properties) cache.get("deposittypelist");
		System.out.println(props.toString());
		double rate = 0;
		double finalAmount=0;
		if(!props.containsKey(depositType)) {
			throw new RuntimeException("deposite type not found!");
		}
		rate = (double) props.get(depositType);
		finalAmount = amount +(amount*tenure*rate/100);
		System.out.println("after "+tenure+" years, total amount will be "+finalAmount);
	}

}
