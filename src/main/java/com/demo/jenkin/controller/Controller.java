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
}
