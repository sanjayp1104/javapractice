package com.bootpractice.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.bootpractice.model.Employee;
import com.bootpractice.model.EmployeeMapper;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_PERSON = "select * from STAFFDETAILS where empid=?";
	private final String SQL_DELETE_PERSON = "delete from STAFFDETAILS where empid=?";
	private final String SQL_UPDATE_PERSON = "update STAFFDETAILS set first_name=?, last_name = ?, age = ? where empid=?";
	private final String SQL_GETALL_PERSON = "select * from STAFFDETAILS";
	private final String SQL_INSERT_PERSON = "insert into STAFFDETAILS (empid,first_name,last_name,age) values (?,?,?,?)";
	
	
	public EmployeeDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Employee getEmployeeById(int empid) {
		return jdbcTemplate.queryForObject(SQL_FIND_PERSON, new Object[] {empid}, new EmployeeMapper());
	}

	public List<Employee> getAllEmploys() {
		return jdbcTemplate.query(SQL_GETALL_PERSON, new EmployeeMapper());
	}

	public boolean deleteEmployee(Employee emp) {
		return jdbcTemplate.update(SQL_DELETE_PERSON,emp.getEmpid())>0;
	}

	public boolean updateEmployee(Employee emp) {
		return jdbcTemplate.update(SQL_UPDATE_PERSON,emp.getFirstName(),emp.getLastName(),emp.getAge(),emp.getEmpid())>0;
	}

	public boolean createEmployee(Employee emp) {
		return jdbcTemplate.update(SQL_INSERT_PERSON,emp.getEmpid(),emp.getFirstName(),emp.getLastName(),emp.getAge())>0;
	}

}
