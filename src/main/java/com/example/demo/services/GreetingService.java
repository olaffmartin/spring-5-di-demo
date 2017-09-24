package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public interface GreetingService {
	
	String HELLOOM = "Hello Olaff";

	
	public String sayGreeting();
}
