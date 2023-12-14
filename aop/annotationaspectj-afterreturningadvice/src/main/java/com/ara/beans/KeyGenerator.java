package com.ara.beans;

import org.springframework.stereotype.Component;

@Component
public class KeyGenerator {
	public int generate(int keyLength) {
		System.out.println("in generate()");
		if(keyLength<8) {
			return 0;
		}
		return 1;
	}
}
