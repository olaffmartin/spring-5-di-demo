package com.example.demo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.services.GreetingServiceImpl;


public class GetterInjectedControllerTest {

	private GetterInjectedController getterInjectedController;
	
	@Before
	public void setUp() throws Exception{
		this.getterInjectedController = new GetterInjectedController();
		this.getterInjectedController.setgreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLOOM, getterInjectedController.sayHello());
	}


}
