package com.primitiveinjectionjavaconfigapi.annotation;

public class Passport {
	private int passportNo;
	private String passportHolderName;
	private int age;
	private String gender;
	public int getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	public String getPassportHolderName() {
		return passportHolderName;
	}
	public void setPassportHolderName(String passportHolderName) {
		this.passportHolderName = passportHolderName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", passportHolderName=" + passportHolderName + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
}
