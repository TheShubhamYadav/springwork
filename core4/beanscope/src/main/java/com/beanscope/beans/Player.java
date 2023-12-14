package com.beanscope.beans;

public class Player {
	String name;
	int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + "]";
	}
}
