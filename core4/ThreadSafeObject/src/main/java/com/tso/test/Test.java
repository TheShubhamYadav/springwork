package com.tso.test;

import com.tso.beans.WebUser;

public class Test {

	public static void main(String[] args) {
		
		WebUser user1 = new WebUser("thirty",1990);
		WebUser user2 = new WebUser("forty",1980);
		WebUser user3 = new WebUser("fifty",1970);
		
		Thread t1 = new Thread(user1);
		Thread t2 = new Thread(user2);
		Thread t3 = new Thread(user3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
