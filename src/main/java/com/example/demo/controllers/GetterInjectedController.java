package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class GetterInjectedController {
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	@Autowired
	public void setgreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
