package com.bootpractice.spring.dao;

import java.util.List;

import com.bootpractice.model.Employee;

public interface EmployeeDao {
	Employee getEmployeeById(int empid);
	
	List<Employee> getAllEmploys();
	
	boolean deleteEmployee(Employee emp);
	boolean updateEmployee(Employee emp);
	boolean createEmployee(Employee emp);
}
