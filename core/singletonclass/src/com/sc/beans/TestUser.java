package com.sc.beans;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		UtilObj object = UtilObj.getInstance();
//		object.info();
//		UtilObj object2 = UtilObj.getInstance();
//		object2.info();
//		System.out.println(object==object2);
		MyRunnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread2.start();
	}
}
