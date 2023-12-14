package com.strategydp.helpers;

import java.io.InputStream;
import java.util.Properties;

public class ObjectFactory {
	public static Object newObject(String logicalClassName) {
		Properties props = null;
		InputStream in = null;
		String fqClassName;
		Class<?> clazz = null;
		Object obj = null;
		try {
			props = new Properties();
			in = ObjectFactory.class.getClassLoader().getResourceAsStream("com/strategydp/common/appClasses.properties");
			props.load(in);
			if(!props.containsKey(logicalClassName)) {
				throw new Exception("NOT FOUND : Fully qualified name of class for given logicalclassname:"+logicalClassName);
			}
			fqClassName = props.getProperty(logicalClassName);
			clazz = Class.forName(fqClassName);
			obj = clazz.newInstance();
		}//try
		catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}//newObject(-)

}//class
