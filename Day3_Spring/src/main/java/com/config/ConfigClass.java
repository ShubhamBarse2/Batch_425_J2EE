package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tka.Employee;

@Configuration
public class ConfigClass {

	@Bean
	public Employee objEmp() {
		return new Employee();
	}

}
