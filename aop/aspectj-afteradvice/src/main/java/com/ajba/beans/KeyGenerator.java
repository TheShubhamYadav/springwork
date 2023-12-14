package com.ajba.beans;

public class KeyGenerator {
	
	public int generator(int keyLength) {
		System.out.println("generating key");
		if(keyLength<8)
			return 0;
		return 1;
	}

}
