package com.mss.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentController {
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	
	
	
	
}