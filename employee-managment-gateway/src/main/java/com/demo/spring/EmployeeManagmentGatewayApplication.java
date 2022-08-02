package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeManagmentGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagmentGatewayApplication.class, args);
	}

}
