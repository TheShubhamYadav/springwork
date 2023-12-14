package com.qa.bo;

public class CourseBO {
	
	private int Course_No;
	private String Course_name;
	private int duration;
	private double Fee;
	public int getCourse_No() {
		return Course_No;
	}
	public void setCourse_No(int course_No) {
		Course_No = course_No;
	}
	public String getCourse_name() {
		return Course_name;
	}
	public void setCourse_name(String course_name) {
		Course_name = course_name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFee() {
		return Fee;
	}
	public void setFee(double fee) {
		Fee = fee;
	}
	@Override
	public String toString() {
		return "CourseBO [Course_No=" + Course_No + ", Course_name=" + Course_name + ", duration=" + duration + ", Fee="
				+ Fee + "]";
	}
	
	
	
	

}
