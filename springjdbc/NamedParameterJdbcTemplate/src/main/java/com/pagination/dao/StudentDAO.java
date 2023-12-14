package com.pagination.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pagination.bo.StudentBO;

@Repository
public class StudentDAO {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private final String GET_STUDENT_NAME_BY_STUDENT_ID = "select student_name from student where student_id= :student_id";
	private final String GET_STUDENT_BY_AGE_GENDER = 
			"select student_id, student_name, age, gender, mobile, email from student where (age between :minAge and :maxAge) and gender = :gender";
	private final String SAVE_STUDENT = "Insert into student(student_id, student_name, age, gender, mobile, email) values(:student_id, :student_name, :age, :gender, :mobile, :email)";
	
	
	public String getAllStudent(final int student_id){
		Map<String, Object> map = new HashMap<>();
		
		map.put("student_id", student_id);
		return namedParameterJdbcTemplate.queryForObject(GET_STUDENT_NAME_BY_STUDENT_ID, map, String.class);
		
	}
	
	public List<StudentBO> getStudentsByAgeAndGender(int minAge,int maxAge,String gender){
		MapSqlParameterSource mapSource = new MapSqlParameterSource();
		mapSource.addValue("minAge", minAge);
		mapSource.addValue("maxAge", maxAge);
		mapSource.addValue("gender", gender);
		return namedParameterJdbcTemplate.query(GET_STUDENT_BY_AGE_GENDER,mapSource, (rs , rowNum)->{
			StudentBO bo = new StudentBO();
			bo.setStudent_id(rs.getInt(1));
			bo.setStudent_name(rs.getString(2));
			bo.setAge(rs.getInt(3));
			bo.setGender(rs.getString(4));
			bo.setMobile(rs.getString(5));
			bo.setEmail(rs.getString(6));
			return bo;
		});
		
	}
	
	public int saveStudent(StudentBO bo) {
		return namedParameterJdbcTemplate.update(SAVE_STUDENT, new BeanPropertySqlParameterSource(bo));
	}

}
