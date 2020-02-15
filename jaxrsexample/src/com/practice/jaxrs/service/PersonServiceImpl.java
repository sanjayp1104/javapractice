package com.practice.jaxrs.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.RepaintManager;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.practice.jaxrs.model.Person;
import com.practice.jaxrs.model.Response;

@Path("/person")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class PersonServiceImpl implements PersonService {
	private static Map<Integer, Person> persons = new HashMap<Integer, Person>();
	@Override
	@POST
	@Path("/add")
	public Response addPerson(Person p) {
		Response response = new Response();
		if (persons.get(p.getId())!=null) {
			response.setStatus(false);
			response.setMessage("Person already exists");
			return response;
		}
		persons.put(p.getId(),p);
		response.setMessage("Person added successfully");
		response.setStatus(true);
		
		return response;
	}

	@Override
	@GET
	@Path("/{id}/delete")
	public Response deletePerson(@PathParam("id") int id) {
		Response response =  new Response();
		
		if(persons.get(id) == null) {
			response.setStatus(false);
			response.setMessage("Person not found");
			return response;
		}
		
		persons.remove(id);
		response.setStatus(true);
		response.setMessage("Person data deleted");
		return response;
	}

	@Override
	@GET
	@Path("/{id}/get")
	public Person getPerson(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		return persons.get(id);
	}
	
	@GET
	@Path("/{id}/getDummy")
	public Person getDummyPerson(@PathParam("id") int id) {
		Person p = new Person();
		p.setId(id);
		p.setName("Dummy");
		p.setAge(99);
		return p;
		
	}

	@Override
	@GET
	@Path("/getAll")
	public Person[] getAllPersons() {
		Set<Integer> ids = persons.keySet();
		Person p[] = new Person[ids.size()];
		int i=0;
		
		for(Integer id : ids) {
			p[i]=persons.get(id);
			i++;
		}
		return p;
	}

}
