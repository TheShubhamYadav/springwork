package com.sfmi.beans;

import java.util.Calendar;
import java.util.Date;

public class Exam {
	private String examName;
	private String examType;
	private Calendar examDate;

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public void setExamDate(Calendar examDate) {
		this.examDate = examDate;
	}

	@Override
	public String toString() {
		return "Exam [examName=" + examName + ", examType=" + examType + ", examDate=" + examDate.getTime() + "]";
	}

}
