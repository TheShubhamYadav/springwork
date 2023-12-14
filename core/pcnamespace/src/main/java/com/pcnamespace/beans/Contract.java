package com.pcnamespace.beans;

import java.sql.Date;

public class Contract {
	String issueDate;
	String lastDate;
	public Contract(String issueDate, String lastDate) {
		this.issueDate = issueDate;
		this.lastDate = lastDate;
	}
	@Override
	public String toString() {
		return "Contract [issueDate=" + issueDate + ", lastDate=" + lastDate + "]";
	}
	
	
	
}
