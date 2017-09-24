package com.example.demo.controllers;

import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	
	public MyController(GreetingService greetingService) {	
		this.greetingService = greetingService;
	}


	public String hello() {
		System.out.println("Hello World");
		return greetingService.sayGreeting();
	}

}
