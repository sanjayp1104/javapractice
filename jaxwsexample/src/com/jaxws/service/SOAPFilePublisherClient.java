package com.jaxws.service;
import java.net.MalformedURLException	;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.jaxws.beans.Person;

public class SOAPFilePublisherClient {
	
	public static void main(String[] args) throws MalformedURLException{
		URL wsdlUrl = new URL("http://localhost:8888/ws/person?wsdl"); 
		QName qname = new QName("http://service.jaxws.com/", "PersonServiceImplService");
		
		Service ser = Service.create(wsdlUrl,qname);
		
		PersonService ps = ser.getPort(PersonService.class);
		
		Person p1 = new Person(); p1.setName("Pankaj"); p1.setId(1); p1.setAge("30");
		Person p2 = new Person(); p2.setName("Meghna"); p2.setId(2); p2.setAge("25");
		Person p3 = new Person(); p3.setName("Surya"); p3.setId(3); p3.setAge("40");
		
		System.out.println("Add Person Status="+ps.addPerson(p1));
		System.out.println("Add Person Status="+ps.addPerson(p2));
		
		System.out.println(ps.getPerson(1));
		
		System.out.println("Delete Person Status="+ps.deletePerson(2));
		
		System.out.println(Arrays.asList(ps.getAllPersons()));	
	}

}
