package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.repository.EmployeeDao;
import com.springboot.model.Employee;

@RestController
public class SpringBootdsController {
	
	@Autowired
	public EmployeeDao dao;
	
	@RequestMapping("/getEmpinfo")
	public List<Employee> employeeInfo(){
		List<Employee> emps = dao.isData();
		
		return emps;
	}
	
}
