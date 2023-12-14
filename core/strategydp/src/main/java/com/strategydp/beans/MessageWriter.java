package com.strategydp.beans;

import com.strategydp.converters.IMessageConverter;

public class MessageWriter {
	private IMessageConverter messageConverter;
	public void writeMessage(String message){
		String convertedMSG = messageConverter.convert(message);
		System.out.println(convertedMSG);
	}
	public void setMessageConverter(IMessageConverter messageconverter) {
		this.messageConverter=messageconverter;
	}
}
