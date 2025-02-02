package com.docker.consumer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class ConsumerController {
	
	@GetMapping("/consumer/{name}")
	public String hello(@PathVariable("name") String name) {
		
		String baseURL = "http://producer:9090/producer/";
		
		String response = RestClient.create()
				.get().uri(baseURL+name)
				.retrieve()
				.body(String.class);
		return response;
	}

}
