package com.ada.beans;

public class KeyGenerator {
	public int generatekey(int keyLength) {
		if(keyLength>8) {
			System.out.println("key generated");
			return 1;
		}
		return 0;
	}
}
