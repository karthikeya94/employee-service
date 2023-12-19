package com.employee.office.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeOfficeMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeOfficeMicroServiceApplication.class, args);
	}

}
