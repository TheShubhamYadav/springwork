package com.dependson.accessor;

import java.io.IOException;
import java.util.Properties;

public class LoanEnquiryAccessorImpl implements IAccessor {
	private String key;
	public LoanEnquiryAccessorImpl(String key) {
		this.key = key;
	}
	
	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public Object getData() throws IOException {
		Properties props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("com/dependson/common/filedata.properties"));
		return props;      
	}

	

}
