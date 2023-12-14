package com.sc.test;

import com.sc.beans.Oxygen;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oxygen oxy1 = Oxygen.getInstance();
		Oxygen oxy2 = Oxygen.getInstance();
		System.out.println(oxy1==oxy2);
	}

}
