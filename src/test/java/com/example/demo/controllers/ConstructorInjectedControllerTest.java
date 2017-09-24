package com.example.demo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setUp() throws Exception{
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLOOM, constructorInjectedController.sayHello());
	}

}
