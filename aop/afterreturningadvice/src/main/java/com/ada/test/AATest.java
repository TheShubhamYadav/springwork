package com.ada.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ada.beans.KeyGenerator;
import com.ada.beans.KeyValidatorAdvice;

public class AATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new KeyGenerator());
		pf.addAdvice(new KeyValidatorAdvice());
		
		KeyGenerator kg = (KeyGenerator)pf.getProxy();
		kg.generatekey(10);
		
	}
}
