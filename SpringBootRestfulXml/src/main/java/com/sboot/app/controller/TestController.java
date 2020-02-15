package com.sboot.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.app.model.Customer;

@RestController
public class TestController {
	
	
	/* @GetMapping( name = "/get-cust-info") */// name is working, path is giving error
	/* @RequestMapping( path = "/get-cust-info") *///Path is giving error
@RequestMapping( name = "/get-cust-info")
public Customer custInfo() {
	Customer cust = new Customer();
	
	cust.setCustNo(100);
	cust.setName("Sanjay");
	cust.setCountry("India");
	
	return cust;
}
}
