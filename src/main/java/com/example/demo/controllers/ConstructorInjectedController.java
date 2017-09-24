package com.example.demo.controllers;

import com.example.demo.services.GreetingService;

public class ConstructorInjectedController {
	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	
}
