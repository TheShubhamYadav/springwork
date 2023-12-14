package com.ps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class StudentPSDAO {
	private JdbcTemplate jdbcTemplate;
	private String getStudentByName = "select * from student where student_name=?";

	public StudentPSDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<StudentBO> getStudentByName(String studentName){
		List<StudentBO> students = null;
		
		students = jdbcTemplate.execute(new GetStudentByNamePreparedStatementCreator(studentName) , new GetStudentByNamePreparedStatementCallback());
/*		---My experiments with lambada expression--
//		students = jdbcTemplate.execute(new GetStudentByNamePreparedStatementCreator(studentName), (ps)->{
//			List<StudentBO> studentsList = null;
//			ResultSet rs = null;
//			StudentBO student = null;
//			
//			rs = ps.executeQuery();
//			studentsList = new ArrayList<>();
//			
//			while(rs.next()) {
//				student = new StudentBO();
//				student.setStudentId(rs.getInt(1));
//				student.setStudentName(rs.getString(2));
//				student.setAge(rs.getInt(3));
//				student.setGender(rs.getString(4));
//				student.setMobile(rs.getString(5));
//				student.setEmail(rs.getString(6));
//				studentsList.add(student);
//			}
//			
//			return studentsList;
//		});														*/
		
		return students;
	}
	
	private final class GetStudentByNamePreparedStatementCreator implements PreparedStatementCreator{
		private String studentName;
		
		public GetStudentByNamePreparedStatementCreator(String studentName) {
			this.studentName = studentName;
		}
		
		@Override
		public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			PreparedStatement ps = null;
			ps = con.prepareStatement(getStudentByName);
			ps.setString(1, studentName);
			return ps;
		}
		
	}
	
	private final class GetStudentByNamePreparedStatementCallback implements PreparedStatementCallback<List<StudentBO>> {

		@Override
		public List<StudentBO> doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			List<StudentBO> students = null;
			ResultSet rs = null;
			StudentBO student = null;
			
			rs = ps.executeQuery();
			students = new ArrayList<>();
			
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
	}
}
