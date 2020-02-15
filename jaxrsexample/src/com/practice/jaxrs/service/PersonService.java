package com.practice.jaxrs.service;

import com.practice.jaxrs.model.Person;
import com.practice.jaxrs.model.Response;

public interface PersonService {
	public Response addPerson(Person p);
	public Response deletePerson(int id);
	public Person getPerson(int id);
	public Person[] getAllPersons();
}
