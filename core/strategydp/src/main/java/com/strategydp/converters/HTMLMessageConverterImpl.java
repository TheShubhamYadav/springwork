package com.strategydp.converters;

public class HTMLMessageConverterImpl implements IMessageConverter {

	@Override
	public String convert(String message) {
		//conversion logic
		return "<html>"+message+"<html>";
	}

}
