package com.strategydp.beans;

import com.strategydp.converters.IMessageConverter;

public class InformationWriter {
	private IMessageConverter infoConverter;
	public void writeInfo(String info) {
		String convertedInfo = infoConverter.convert(info);
		System.out.println(convertedInfo);
		
	}
	public void setInfoConverter(IMessageConverter infoconverter) {
		this.infoConverter=infoconverter;
	}

}
