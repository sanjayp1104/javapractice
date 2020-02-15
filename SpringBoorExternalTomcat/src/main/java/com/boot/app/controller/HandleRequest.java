package com.boot.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandleRequest {
	@RequestMapping("/boot-ex-tomcat")
	public String customerInformation() {
		return "Hey, I am from external tomcat";
	}
}
