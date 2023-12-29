package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.BasicRequest;
import com.example.model.BasicResponse;

@CrossOrigin(origins  = {"http://localhost:3000"})
@SpringBootApplication
@RestController
public class DemoApplication {
	
	@Value("${env}")
	private String env;

	@GetMapping("/myFirstGet")
	public String firstGetMethod() {
		return "Spring boot Hello World - myFirstGet!!! - From Environment :: " + env;
	}
	
	@PostMapping("/myFirstPost")
	public BasicResponse firstPostMethod(@RequestBody BasicRequest request) {
		
		System.out.println("Request: " + request.toString());
		
		BasicResponse response = new BasicResponse();
		response.setCode(0);
		response.setMessage("Data added");
		response.setData("Spring boot Hello World - myFirstPost!!! - From Environment :: " + env);
		response.setSuccess(true);
		System.out.println("Response: " + response.toString());
		return response;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}