package com.docker.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	
	
	@GetMapping("/producer/{name}")
	public String helloworld(@PathVariable("name") String name) {
		
		return "Welcome "+name +" from producer";
	}

}
