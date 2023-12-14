package com.dependson.beans;

import java.io.IOException;
import java.util.Properties;

import com.dependson.helper.Cache;

public class LoanEnquiry {
	private Cache cache;
	public LoanEnquiry(Cache cache) {
		this.cache = cache;
	}
	public void enquire(double amount,int tenure,String loanType){
		// TODO Auto-generated method stub
		double intrestRate = 0;
		double payableInterest=0;
		double totalPayableAmount=0;
		
		Properties props = null;
		props = (Properties) cache.get("loanlist");
		
		if(props==null) {
			throw new RuntimeException("failed to load the data into cache");
		}
		else if(!props.containsKey(loanType)) {
			throw new RuntimeException(loanType+" is not a valid loan type");
		}
		intrestRate = Double.parseDouble(props.getProperty(loanType));
		payableInterest = (amount*intrestRate*tenure)/100;
		totalPayableAmount = amount+payableInterest;
		
		System.out.println(loanType+" on amount of Rs. "+amount+" for "+tenure+" years\nIntrest rate is : "+intrestRate+"%\nPayable total interest is : Rs. "+payableInterest+"\nTotal payable amount will be Rs. "+totalPayableAmount );
		
	}

	

}
