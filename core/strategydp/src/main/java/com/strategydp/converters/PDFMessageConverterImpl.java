package com.strategydp.converters;

public class PDFMessageConverterImpl implements IMessageConverter {
	@Override
	public String convert(String message) {
		//conversion logic
		return "pdf--"+message+"--pdf";
	}

}
