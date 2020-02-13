package com.bootpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bootpractice.model.Employee;
import com.bootpractice.spring.config.AppConfig;
import com.bootpractice.spring.dao.EmployeeDao;

public class TestClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeDao employeeDao =  context.getBean(EmployeeDao.class);
		
		System.out.println("Creating Employees");
		Employee emp1 =  new Employee(8, "AAAA", "BBB", 25);
		
		if ( employeeDao.createEmployee(emp1)) System.out.println("Employee Created successfuly with id "+emp1.getEmpid());
		
		Employee emp2 =  new Employee(9, "CCCC", "DDD", 45);
		
		if ( employeeDao.createEmployee(emp2)) System.out.println("Employee Created successfuly with id "+emp2.getEmpid());
		
		System.out.println("Listing All employees");
		for(Employee emp : employeeDao.getAllEmploys()) {
			System.out.println(emp);
		}
		
		System.out.println("Get The employee with ID 2");
		
		Employee e1 = employeeDao.getEmployeeById(2);
		
		System.out.println(e1);
		
		System.out.println("Update employee");
		
		Employee e2 = employeeDao.getEmployeeById(1);
		
		e2.setFirstName("Vijay");
		e2.setLastName("Patil");
		
		employeeDao.updateEmployee(e2);
		
		System.out.println("Listing All employees");
		for(Employee emp : employeeDao.getAllEmploys()) {
			System.out.println(emp);
		}
		
		System.out.println("Deleting person with id 3 ");
		employeeDao.deleteEmployee(emp2);
		
		System.out.println("Listing All employees");
		for(Employee emp : employeeDao.getAllEmploys()) {
			System.out.println(emp);
		}
	}
}
