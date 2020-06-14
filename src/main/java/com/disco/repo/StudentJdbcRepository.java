package com.disco.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.disco.model.Student;

@Repository
public class StudentJdbcRepository {
	 @Autowired
	    JdbcTemplate jdbcTemplate;
	 
	 public Student findById(long id) {
		    return jdbcTemplate.queryForObject("select * from student where id=?", new Object[] {
		            id
		        },
		        new BeanPropertyRowMapper < Student > (Student.class));
		}
	
}
