package com.blc.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Calc {
	int a;
	@Value("10")
	int b;
	int sum;
	
	public Calc(@Value("10") int b) {
		this.b = b;
	}

	@Value("10")
	public void setA(int a) {
		this.a = a;
	}
	
	@PostConstruct   //added extra dependency jakarta.annoatation 2.1.1 <!-- https://mvnrepository.com/artifact/jakarta.annotation/jakarta.annotation-api -->
	public void init() {
		System.out.println("Calc.init()");
		this.sum = this.a + this.b;
	}
	
	@PreDestroy //added extra dependency jakarta.annoatation 2.1.1 
	public void destroy() {
		System.out.println("Calc.destroy()");
		this.sum=0;
		System.out.println("Calc [a=" + a + ", b=" + b + ", sum=" + sum + "]");
	}

	@Override
	public String toString() {
		return "Calc [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}
	
}
