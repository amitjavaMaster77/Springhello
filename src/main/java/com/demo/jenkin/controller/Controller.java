package com.demo.jenkin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	
	@GetMapping("/hello")                     //REST API End Point
	public String hello() {
		System.out.println("GET Department");
		return "Hello";
	}
		@GetMapping("/lulu")                     //REST API End Point
	public String lulu() {
		System.out.println("Hi");
		return "<h1>All the Best</H1>";
	}
	
	
	
	
	
	
}
