package com.pagination.bo;

public class CourseBO {
	
	private int course_no;
	private String course_name;
	private int duration;
	private double fee;
	public int getCourse_no() {
		return course_no;
	}
	public void setCourse_no(int course_no) {
		this.course_no = course_no;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "CourseBO [course_no=" + course_no + ", course_name=" + course_name + ", duration=" + duration + ", fee="
				+ fee + "]";
	}
	
	

}
