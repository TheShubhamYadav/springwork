package com.blc.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Math implements InitializingBean, DisposableBean {
	private int i;
	private int j;
	public int sum;
	
	public Math(int i) {
		this.i=i;
	}//ci
	
	public void setJ(int j) {
		this.j = j;
	}//si

	@Override
	public String toString() {
		return "Math [i=" + i + ", j=" + j + ", sum=" + sum + "]";
	}

	@Override
	//programmic approach of Beanlifecycle management
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("programatic approach (i did multply)");
		this.sum = this.i * this.j;
		
	}
	
	@Override
	public void destroy() throws Exception {
		this.i=0;
		this.j=0;
		this.sum=0;
		System.out.println("Destroy() :- logic cleaned up");
		
	}
	
	//configuration approach of  Beanlifecycle management
//	public void init() {
//		this.sum = this.i + this.j;
//	}
//	
//	public void destroy() {
//		System.out.println("Destroy() :- logic cleaned up");
//	}

		
	
	
}
