package com.example.demo.controllers;


import com.example.demo.services.GreetingServiceImpl;

public class PropertyInjectedController {

	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
