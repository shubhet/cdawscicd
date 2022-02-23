package com.ms.ecr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/aws")
public class EcrApplication {
   
	@GetMapping(value="/hello")
	public String hello()
	{
		return "Hello Shubham Gupta";
	}
	@GetMapping(value="/cicd")
	public String welcome()
	{
		return "Welcome to CICD example via SG";
	}
	public static void main(String[] args) {
		SpringApplication.run(EcrApplication.class, args);
	}

}
