package com.co.services.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class SampleController {
	
	@GetMapping("/")
	public String sampleApi() {
		return "Sample Microservice 2 " + new Date().getTime();
	}
	
}
