package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.beans.TestDatasource;
import com.example.demo.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

//		MyController myctrl = (MyController) ctx.getBean("myController");
		
		TestDatasource testDatasource = (TestDatasource) ctx.getBean(TestDatasource.class);
		System.out.println(testDatasource.getUsername());
		System.out.println(testDatasource.getPassword());
		System.out.println(testDatasource.getDburl());
	}
		
}
