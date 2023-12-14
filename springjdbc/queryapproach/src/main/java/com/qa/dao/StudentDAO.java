package com.qa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.qa.bo.CourseBO;
import com.qa.bo.StudentBO;

@Repository
public class StudentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String GET_ALL_STUDENT_WITH_COURSES = "select s.student_id,s.student_name, s.age, s.gender, s.mobile, s.email,c.course_no, c.course_name, c.duration, c.fee from student s inner join student_course sc on s.student_id = sc.student_id inner join course c on sc.course_no = c.course_no order by s.student_name";
	
	public Collection<StudentBO> getAllStudentWithCourse(){
		return jdbcTemplate.query(GET_ALL_STUDENT_WITH_COURSES, (rs)->{
			StudentBO studentBO = null;
			CourseBO courseBO = null;
			Map<Integer, StudentBO> studentCourseMap = new HashMap<>();
			int studentNo;
			while(rs.next()) {
				studentNo = rs.getInt(1);
				if(!studentCourseMap.containsKey(studentNo)) {
					studentBO = new StudentBO();
					studentBO.setStudentId(rs.getInt(1));
					studentBO.setStudentName(rs.getString(2));
					studentBO.setAge(rs.getInt(3));
					studentBO.setGender(rs.getString(4));
					studentBO.setMobile(rs.getString(5));
					studentBO.setEmail(rs.getString(6));
					studentBO.setCourses(new ArrayList<>());
					studentCourseMap.put(studentNo, studentBO);
				}
				studentBO = studentCourseMap.get(studentNo);
				
				courseBO = new CourseBO();
				courseBO.setCourse_No(rs.getInt(7));
				courseBO.setCourse_name(rs.getString(8));
				courseBO.setDuration(rs.getInt(9));
				courseBO.setFee(rs.getDouble(10));
				
				studentBO.getCourses().add(courseBO);
			}
			return studentCourseMap.values();
		});
	}
	
//	private final class StudentResultSetExtractor implements ResultSetExtractor<Collection<StudentBO>>{
//		@Override
//		public Collection<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
//			StudentBO student = null;
//			CourseBO course = null;
//			Map<Integer, StudentBO> studentCourseMap = new HashMap<>();
//			int studentNo;
//			while(rs.next()) {
//				studentNo  = rs.getInt(1);
//				if(!studentCourseMap.containsKey(studentNo)) {
//					student = new StudentBO();
//					student.setStudentId(rs.getInt(1));
//					student.setStudentName(rs.getString(2));
//					student.setAge(rs.getInt(3));
//					student.setGender(rs.getString(4));
//					student.setMobile(rs.getString(5));
//					student.setEmail(rs.getString(6));
//					student.setCourses(new ArrayList<>());
//					studentCourseMap.put(studentNo, student);
//				}
//				student = studentCourseMap.get(studentNo);
//				
//				course = new CourseBO();
//				course.setCourse_No(rs.getInt(7));
//				course.setCourse_name(rs.getString(8));
//				course.setDuration(rs.getInt(9));
//				course.setFee(rs.getDouble(10));
//				student.getCourses().add(course);
//				
//			}//while
//			return studentCourseMap.values();
//		}
//	}
}
