package com.practice.demoProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/demo")
	public String demo() {
		return "demo api";
	}

	//TODO need to implement
	@GetMapping("/demo1")
	public String demo1() {
		return "demo api hello";
	}
	
}
