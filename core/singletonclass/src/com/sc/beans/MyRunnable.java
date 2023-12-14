package com.sc.beans;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		UtilObj object = UtilObj.getInstance();
		System.out.println(object.hashCode());
	}

}
