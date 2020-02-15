package com.practice.jaxrs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class Person {
	private int id;
	private int age;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Id : "+id+"  Name : "+name+"  age "+age;
	}

}
