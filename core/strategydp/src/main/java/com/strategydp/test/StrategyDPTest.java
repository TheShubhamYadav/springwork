package com.strategydp.test;

import com.strategydp.beans.InformationWriter;
import com.strategydp.beans.MessageWriter;
import com.strategydp.converters.IMessageConverter;
import com.strategydp.helpers.ObjectFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
			MessageWriter messageWriter = (MessageWriter)ObjectFactory.newObject("messagewriter.class");
			IMessageConverter messageconverter = (IMessageConverter)ObjectFactory.newObject("messagewriter.class.messageConverter");
			messageWriter.setMessageConverter(messageconverter);
			messageWriter.writeMessage("hi i am here");
			
			InformationWriter infoWriter = (InformationWriter)ObjectFactory.newObject("infowriter.class");
			IMessageConverter infoconverter = (IMessageConverter)ObjectFactory.newObject("infowriter.class.infoConverter");
			infoWriter.setInfoConverter(infoconverter);
			infoWriter.writeInfo("this is for testing"); 
			
	}

}
