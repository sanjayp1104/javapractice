package com.springboot.app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.model.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate  jdbcTemplate;
	
	private final String SQL_GETALL_PERSON = "select * from STAFFDETAILS";
	
	
	public List<Employee> isData(){
	List<Employee> emps = new ArrayList<Employee>();
	
	List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL_GETALL_PERSON);
	
	for(Map<String, Object> row : rows) {
		Employee emp= new Employee();
		emp.setEmpid((int)row.get("empid"));
		emp.setFirstName((String)row.get("first_name"));
		emp.setLastName((String)row.get("last_name"));
		emp.setAge((int)row.get("age"));
		
		emps.add(emp);
	}
	
	return emps;
	}
	
	
}
