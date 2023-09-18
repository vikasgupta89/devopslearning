package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringBuild-2.4.5/hello")
public class BuildController {

	@GetMapping("/get")
	public String getTest() {
		return "My First Spring Boot Application....";
	}
}
