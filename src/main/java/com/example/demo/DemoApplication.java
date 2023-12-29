package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	@Value("${env}")
	private String env;

	@GetMapping("/check")
	public String home() {
		return "Spring boot Hello World!!! - From Environment :: " + env;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}