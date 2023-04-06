package com.mss.springboot.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mss.springboot.web.app.repo.StudentRepo;


@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("students", repo.findAll());
		return "home";
	}
	
	
	
	
	
	
}