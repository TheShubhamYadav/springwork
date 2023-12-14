package com.mr.helper;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReplaceMethod implements MethodReplacer {
	
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("findPlans")) {
			int age = (int)args[0];
			int policyPeriod = (int)args[1];
			boolean outPatientCover = (boolean)args[2];
			boolean copay = (boolean)args[3];
			boolean prehospitalcoverage = (boolean)args[4];
			if(age<60 && policyPeriod>1 && outPatientCover==true && copay==true && prehospitalcoverage==true) {
				return Arrays.asList(new String[] {"plan11","plan12","plan15"});
			}
			else {
				return Arrays.asList(new String[] {"plan12","plan17","plan19"});
			}
		}
		else {
			throw new RuntimeException("method replacer failed");
		}
	}

}
