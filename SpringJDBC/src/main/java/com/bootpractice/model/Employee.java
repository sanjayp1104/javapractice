package com.bootpractice.model;

public class Employee {
	private int empid;
	private String firstName;
	private String lastName;
	private int age;
	
	public Employee() {
		
	}

	public Employee(int empid, String firstName, String lastName, int age) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	
	
}
