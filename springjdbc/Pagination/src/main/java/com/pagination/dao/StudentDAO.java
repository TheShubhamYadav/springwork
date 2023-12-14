package com.pagination.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pagination.bo.StudentBO;

@Repository
public class StudentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String GET_ALL_STUDENT = "select student_id, student_name, age, gender, mobile, email from student order by student_id";

	public List<StudentBO> getAllStudent(int pageSize,int pageNo){
		return jdbcTemplate.query(GET_ALL_STUDENT, (rs)->{
			int startIndex = 0;
			int endIndex = 0;
			int rowNum = 1;
			List<StudentBO> students = new ArrayList<>();
			startIndex = (pageSize*(pageNo-1))+1;
			endIndex = pageSize*pageNo;
			while(rs.next() && rowNum<=endIndex) {
				if(rowNum>=startIndex) {
					StudentBO bo = new StudentBO();
					bo.setStudent_id(rs.getInt(1));
					bo.setStudent_name(rs.getString(2));
					bo.setAge(rs.getInt(3));
					bo.setGender(rs.getString(4));
					bo.setMobile(rs.getString(5));
					bo.setEmail(rs.getString(6));
					students.add(bo);
				}
				rowNum++;
			}//while
			return students;
		});
	}

}
