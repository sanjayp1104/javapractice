package com.practice.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to spring boot";
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
}
