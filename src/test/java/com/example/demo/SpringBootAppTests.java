package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpringBootAppTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void myFirstGet() {
		String body = this.restTemplate.getForObject("/myFirstGet", String.class);
		assertThat(body).startsWith("Spring boot");
	}
}
