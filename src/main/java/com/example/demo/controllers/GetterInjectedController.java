package com.example.demo.controllers;

import com.example.demo.services.GreetingService;

public class GetterInjectedController {
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	public void setgreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
