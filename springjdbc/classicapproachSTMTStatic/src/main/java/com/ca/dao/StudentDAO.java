package com.ca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.StatementCallback;

import com.ca.bo.StudentBO;

public class StudentDAO {
	private JdbcTemplate jdbcTemplate;
	private final String getAllStudent = "select student_id,student_name,age,gender,mobile,email from student"; 

	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<StudentBO> getAllStudents(){
		List<StudentBO> students = null;
		students = jdbcTemplate.execute(new getAllStudentPreparedStatementCallback());
		
		/*----LAMBADA EXPRESSION ALTERNATIVE CODE---
//		students = jdbcTemplate.execute((Statement st)->{
//			StudentBO student = null;
//			List<StudentBO> studentList = null;
//			ResultSet rs = null;
//			
//			studentList = new ArrayList<>();
//			rs = st.executeQuery(getAllStudent);
//			while(rs.next()) {
//				student = new StudentBO();
//				student.setStudentId(rs.getInt(1));
//				student.setStudentName(rs.getString(2));
//				student.setAge(rs.getInt(3));
//				student.setGender(rs.getString(4));
//				student.setMobile(rs.getString(5));
//				student.setEmail(rs.getString(6));
//				studentList.add(student);
//			}
//			return studentList;
//		});									*/
		
		
		return students;
	}
	
	
	private class getAllStudentPreparedStatementCallback implements StatementCallback<List<StudentBO>>{
		@Override
		public List<StudentBO> doInStatement(Statement stmt) throws SQLException, DataAccessException {
			StudentBO student = null;
			List<StudentBO> students = null;
			ResultSet rs = null;
			
			students = new ArrayList<>();
			rs = stmt.executeQuery(getAllStudent);
			while(rs.next()) {
				student = new StudentBO();
				student.setStudentId(rs.getInt(1));
				student.setStudentName(rs.getString(2));
				student.setAge(rs.getInt(3));
				student.setGender(rs.getString(4));
				student.setMobile(rs.getString(5));
				student.setEmail(rs.getString(6));
				students.add(student);
			}
			return students;
		}
	}//inner class
	
	
}