package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;

import com.example.demo.beans.TestDatasource;

@Configuration
@PropertySource("classpath:datasource.properties") // doesn't work
public class PropertyConfig {

	@Value("${omn.username}")
	private String username;
	
	@Value("${omn.password}")
	private String password;
	
	@Value("${omn.dburl}")
	private String dburl;
	
	@Bean
	public TestDatasource testDatasource() {
		TestDatasource testDatasource = new TestDatasource();
		testDatasource.setUsername(username);
		testDatasource.setPassword(password);
		testDatasource.setDburl(dburl);
		return testDatasource;
	}
	
	@Bean
	public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
		PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
		propertyPlaceholderConfigurer.setLocation(new ClassPathResource("datasource.properties"));
		return propertyPlaceholderConfigurer;
	}
}
